package exam;

public class Main1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 56;
        System.out.println("Pole prostokonta o boku " + a + " i " + b + " to " + rectangle(a, b));
    }

    private static int rectangle(int a, int b) {
        return a * b;
    }
}
