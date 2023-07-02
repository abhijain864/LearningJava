package ConcurrencyInJava;

import reactor.core.publisher.Flux;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadingRunnable {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SSS");

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(300);
        // First we will do, multiThreading with runnable tasks, and will also see time difference between blocking vs non-synchronous
        multiThreadingWithRunnable(executorService);
        System.out.println("--------------------------------------------------------------------------------------------");
        blockingCode();
    }

    private static void multiThreadingWithRunnable(ExecutorService executorService) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<3; i++) {
            int j = i;
            System.out.println("-----------------------Submitting task number " + j + "    at    " + simpleDateFormat.format(new Date()) + "---------------------------");
            executorService.submit(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            });
        }
        executorService.shutdown();
        // shutting down the executor service is important, because that only tells the executorService that no new tasks will
        // be assigned to it, and calling awaitTermination will cause it to wait for all the previously submitted tasks.
        try {
            System.out.println(executorService.awaitTermination(20, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Total execution time multiThreaded == " + (System.currentTimeMillis() - startTime) + "ms");
        }
    }

    private static void blockingCode() {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("total time taken blocking code == " + (System.currentTimeMillis() - startTime) + "ms");
    }




}
