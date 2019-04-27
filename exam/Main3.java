package exam;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(div(4, 20)));

    }

    private static int[] div(int size, int interval) {
        Random rand = new Random();
        int[] temp = new int[size];
        int index = 0;
        while (index < size) {
            int nextInt = rand.nextInt(interval);
            if (nextInt % 2 == 0 && nextInt % 3 != 0) {
                temp[index] = nextInt;
                index++;
            }
        }
        return temp;
    }
}
