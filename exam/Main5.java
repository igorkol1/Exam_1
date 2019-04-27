package exam;

//W pliku Main5.java umieść metodę o sygnaturze static double ball().
//        Uzupełnij ciało metody tak, aby:
//
//        pobierała z konsoli promień r,
//        zwracała obliczoną objętość kuli.


//Powierzchnia kuli to sfera, jej pole liczymy ze wzoru P=4*pi*R^2. Wzór na objętość kuli V=4/3*pi*R^3.

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        System.out.println("Objetosc kuli to "+Math.round(ball()));
    }

    private static double ball(){
        System.out.println("Podaj promień: ");
        double r = getDouble();
        double volume = (double)(4/3)*(Math.PI*Math.pow(r,3));
        return Math.round(volume);
    }

    private static double getDouble() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz: ");
        }
        return scan.nextDouble();
    }

}
