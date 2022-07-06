package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive > 1) {
            int count = 2;
            while (count < printToInclusive) {
                if (isNumberPrime(count)) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }

    private boolean isNumberPrime(int number) {
        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
