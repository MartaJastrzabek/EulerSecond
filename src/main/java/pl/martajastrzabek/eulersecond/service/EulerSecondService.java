package pl.martajastrzabek.eulersecond.service;

import java.util.ArrayList;
import java.util.List;

public class EulerSecondService {
    public List<Integer> createFibonacciNumbers(int limit) throws IllegalArgumentException {

        if (limit <= 0) {
            throw new IllegalArgumentException("Nieprawidłowa wartość limitu");
        }
        
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int element = 0;
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(2);

        for (int i = 2; element < limit; i++) {
            element = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
            fibonacciNumbers.add(element);
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
