package Learn001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamsMultipleWays {
    public static void main(String[] args) {

       //1. Frpm Collections(list, set, map)
       List<String> names =  Arrays.asList("Adam","Eve","Madhan","Arjun");
       names.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);

       //2. From Arrays
        int[] numbers = {2,4,56,76,9};
        IntStream numberStream = Arrays.stream(numbers);
        numberStream.filter(n -> n>10).forEach(System.out::println);

        //3. Stream.of()
        Stream<String> fruits = Stream.of("Apple", "Banana", "Grapes");
        fruits.forEach(System.out::println);

        //4. Stream.generate()
        Stream<String> limitTest = Stream.generate(() -> "Hello").limit((3));
        limitTest.forEach(System.out::println);


        //5. Stream.iterate
        Stream<Integer> iterateTest = Stream.iterate(5, n -> n + 1).limit(5);
        iterateTest.forEach(System.out::println);

    }
}
