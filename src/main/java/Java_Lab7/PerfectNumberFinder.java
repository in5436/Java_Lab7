package Java_Lab7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumberFinder {

    public boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }

        int sumOfDivisors = IntStream.rangeClosed(1, number / 2)
                .filter(d -> number % d == 0) //
                .sum();

        return sumOfDivisors == number;
    }

    public List<Integer> findInRange(int limit) {

        List<Integer> result = IntStream.rangeClosed(1, limit)
                .filter(this::isPerfect)
                .boxed()
                .collect(Collectors.toList());

        return result;
    }
}