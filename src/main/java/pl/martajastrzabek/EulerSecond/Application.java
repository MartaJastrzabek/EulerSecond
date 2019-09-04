package pl.martajastrzabek.EulerSecond;

import pl.martajastrzabek.EulerSecond.pl.martajastrzabek.EulerSecond.pl.martajastrzabek.EulerSecond.Service.EulerSecondService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        EulerSecondService fibonacci = new EulerSecondService();
        try {
            List<Integer> fibonacciNumbers = fibonacci.createFibonacciNumbers(4000000);

            System.out.println(fibonacciNumbers);
            System.out.println(fibonacci.countEvenSum(fibonacciNumbers));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
