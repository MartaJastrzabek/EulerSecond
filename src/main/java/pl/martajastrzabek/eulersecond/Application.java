package pl.martajastrzabek.eulersecond;

import pl.martajastrzabek.eulersecond.service.EulerSecondService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        EulerSecondService fibonacci = new EulerSecondService();
        try {
            List<Integer> fibonacciNumbers = fibonacci.createFibonacciNumbers(89);

            System.out.println(fibonacciNumbers);
            System.out.println(fibonacci.countEvenSum(fibonacciNumbers));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
