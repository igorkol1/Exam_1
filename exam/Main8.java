package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static exam.Main4.getInt;

public class Main8 {

    public static void main(String[] args) {
        create(20);
    }

    private static void create(int max) {
        int n = getNumberOfStudents();
        List<String> studentsResults = getStudentsResults(n);
        saveToFile(studentsResults, "exam.txt");
        List<String> passedStudents = getStudentsWhoPassed(max, "exam.txt");
        saveToFile(passedStudents, "exam_passed.txt");
    }

    private static int getNumberOfStudents() {
        System.out.println("Podaj liczbe uczniów: ");
        return getInt();
    }

    private static List<String> getStudentsResults(int n) {
        Scanner scanner = new Scanner(System.in);
        String login = "", score = "";
        List<String> textLines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj login:");
            login = scanner.nextLine();
            System.out.println("Podaj ilość punktów:");
            score = String.valueOf(getInt());
            textLines.add(login + " " + score);
        }
        return textLines;
    }

    private static void saveToFile(List<String> textToSave, String fileName) {
        Path filePath = Paths.get(fileName);
        createFile(fileName);
        try {
            Files.write(filePath, textToSave);
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku.");
        }
    }

    private static void createFile(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                System.out.println("Nie można utworzyc pliku: " + fileName);
            }
        }
    }

    private static List<String> getStudentsWhoPassed(int max, String fileName) {
        File file = new File(fileName);
        List<String> passedStudents = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String tempStr = scan.nextLine();
                if (Integer.parseInt(tempStr.split(" ")[1]) > (0.6 * max)) {
                    passedStudents.add(tempStr);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku: " + fileName);
        }
        return passedStudents;
    }
}
