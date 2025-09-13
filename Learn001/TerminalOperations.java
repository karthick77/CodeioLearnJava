package Learn001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        // 1. ForEach
        List<String> names =  Arrays.asList("Adam","Eve","Madhan","Arjun");
        names.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);

        // 2. Collect
        List<String> listData = Arrays.asList("Eve", "Arjun", "Ram", "Raja", "Ravi");
        List<String> filterNames = listData.stream().filter(n -> n.startsWith("R")).collect(Collectors.toList());
        System.out.println("Actual Data: "+listData);
        System.out.println("After modified: "+filterNames);

        // 3. Count
        List<Integer> numbers = Arrays.asList(1, 4, 5, 7, 11, 35, 667, 9);
        long count = numbers.stream().count();
        System.out.println("Count of numbers: "+count);

        // 4. reduce
        Integer reduce = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of given numbers in an array: "+reduce);


    }
}
