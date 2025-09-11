package Learn001;

import java.util.Arrays;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {

       List<String> names =  Arrays.asList("Adam","Eve","Madhan");
       names.stream().forEach(System.out::println);
    }
}
