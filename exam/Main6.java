package exam;

public class Main6 {

    public static void main(String[] args) {
        String str = "Test Ala ma kota i Ala ma psa";
        String forReplace = "Ala ma";
        String replacment = "Ola";
        System.out.println(replaceStr(str, forReplace, replacment));
    }

    private static String replaceStr(String str, String forReplace, String replacement) {
        // W zadaniu nie było doprecyzowane czy metoda ma być case sesitive czy nie. Jezeli nie to nalezalo by dodac .toLowerCase() na parametrach str, forReplace i replacement
        return str.replace(forReplace, replacement);
    }
}
