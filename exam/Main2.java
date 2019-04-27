package exam;

public class Main2 {

    public static void main(String[] args) {
        String stringToCut = "Naucz się programować od podstaw";
        System.out.println("Nowy text to: " + shorten(stringToCut, 3));
    }

    private static String shorten(String str, int length) {
        return str.substring(0, length);
    }
}
