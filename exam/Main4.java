package exam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnTab()));
    }

    private static int[] returnTab() {
        System.out.print("Podaj n: ");
        int n = getInt();
        return IntStream.range(1, n + 1).toArray();
    }

    protected static int getInt() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz: ");
        }
        return scan.nextInt();
    }
}
