package pl.martajastrzabek.EulerSecond.pl.martajastrzabek.EulerSecond.pl.martajastrzabek.EulerSecond.Service;

import java.util.ArrayList;
import java.util.List;

public class EulerSecondService {
    public List<Integer> createFibonacciNumbers(int limit) throws IllegalArgumentException {

        if (limit <= 0) {
            throw new IllegalArgumentException("Nie prawidłowa wartość limitu");
        }

        List<Integer> fibonacciNumbers = new ArrayList<>();
        int element = 0;

        for (int i = 0; ; i++) {

            if (element >= limit)
                break;

            if (i == 0) {
                element = i + 1;
                fibonacciNumbers.add(element);
            } else if (i == 1) {
                element = fibonacciNumbers.get(i - 1) + i;
                fibonacciNumbers.add(element);
            } else {
                element = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
                fibonacciNumbers.add(element);
            }
        }

        return fibonacciNumbers;
    }

    public int countEvenSum(List<Integer> numbers) {
        int sum = 0;

        for (Integer n : numbers) {
            if (n % 2 == 0)
                sum += n;
        }

        return sum;
    }
}
