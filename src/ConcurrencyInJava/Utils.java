package ConcurrencyInJava;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Utils {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> l= random.ints(2).boxed().collect(Collectors.toList());
        random.ints(3,344,360).forEach(System.out::println);
    }
}
