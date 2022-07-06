package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        if (lastPrinted >= 0) {
            int count = 0;
            while (count <= lastPrinted) {
                System.out.println(count++);
            }
        }
    }
}
