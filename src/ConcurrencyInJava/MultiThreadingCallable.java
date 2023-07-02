package ConcurrencyInJava;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class MultiThreadingCallable {

    private static Random random = new Random();

    // generated 100 thousand numbers, ranging from 1 million, to 1.2 million.
    private static List<Integer> l = random.ints(100000,1000000,1200000).boxed().collect(Collectors.toList());

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MultiThreadingCallable multiThreadingCallable = new MultiThreadingCallable();
        multiThreadingCallable.NonBlocking();
        multiThreadingCallable.blocking();


    }

    private void NonBlocking() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Long startTime = System.currentTimeMillis();
        List<Future<Boolean>> futuresList = executorService.invokeAll(l.stream().map(item -> new PrimeChecker(item)).collect(Collectors.toList()));
        executorService.shutdown();
        try {
            System.out.println(executorService.awaitTermination(200, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("MultiThreaded ->" + (System.currentTimeMillis() - startTime) + " ms");
        }
    }

    private void blocking() {
        Long startTime = System.currentTimeMillis();
        for (int i : l) {
            new PrimeChecker(i).call();
        }
        System.out.println("Normal blocking code ->" +  (System.currentTimeMillis() - startTime));
    }
}

class PrimeChecker implements Callable<Boolean> {

    private int num;

    PrimeChecker(int num) {
        this.num = num;
    }
    @Override
    public Boolean call() {
        for (int i=2; i<=num/2; i++) {
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
