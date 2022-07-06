package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            int count = 0;
            while (count <= power) {
                System.out.println((int)Math.pow(2, count++));
            }
        } else {
            System.out.println("too much power");
        }

    }
}
