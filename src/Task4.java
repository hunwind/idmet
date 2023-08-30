

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class Task4 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 4, 6, 15, 10, 16, 22, 25, 30, 32, 35, 40);

            List<Integer> result = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .filter(n -> n % 5 != 0)

                    .collect(Collectors.toList());

            result.forEach(System.out::println);
        }
    }





