package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive >= 0) {
            int count = 1;
            while (count - 1 <= printToInclusive) {
                System.out.println(getFactorial(count++));
            }
        }
    }

    private int getFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i < number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
