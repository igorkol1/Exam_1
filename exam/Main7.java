package exam;

import com.sun.istack.internal.NotNull;

public class Main7 {

    public static void main(String[] args) {
        System.out.println(countNumbers(null));
        System.out.println(countNumbers("Wynik dodawania 1 i 2 to 3"));
    }

    private static int countNumbers(@NotNull String str) {
        char[] chrArray = toCharArray(str);
        int sum = 0;
        for (char chr : chrArray) {
            if (Character.isDigit(chr)) {
                sum += Character.digit(chr, 10);
            }
        }
        return sum;
    }

    private static char[] toCharArray(String str) {
        try {
            return str.toCharArray();
        } catch (NullPointerException e) {
            System.out.println("String nie moze byc pusty");
            return new char[]{' '};
        }
    }
}
