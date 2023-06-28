package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int mirror = 0;
        while (number != 0) {
            mirror = mirror * 10 + (number % 10);
            number = number / 10;
        }
        System.out.println(mirror);
    }}
