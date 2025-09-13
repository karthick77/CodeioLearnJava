package Learn001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void main(String[] args) {

        // 1. filter()
        List<String> listData = Arrays.asList("Eve", "Arjun", "Ram", "Raja", "Ravi");
        List<String> filterNames = listData.stream().filter(n -> n.startsWith("R")).collect(Collectors.toList());
        System.out.println("Actual Data: "+listData);
        System.out.println("After modified: "+filterNames);


        // 2. map()
        List<String> mapData = Arrays.asList("Eve", "Arjun", "Ram", "Raja", "Ravi");
        List<String> collect = mapData.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Actual Data: "+mapData);
        System.out.println("After modified: "+collect);

        // 3. sorted()
        List<Integer> sortOne = Arrays.asList(2, 5, 6, 88, 5, 7, 99, 77, 5, 7, 99, 77);
        List<Integer> collect1 = sortOne.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

        // 4. distinct()
        List<Integer> collect2 = sortOne.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(collect2);

    }
}
