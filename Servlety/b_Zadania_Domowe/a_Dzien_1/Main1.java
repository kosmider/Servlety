package b_Zadania_Domowe.a_Dzien_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Main1 {

    private static final int NAME1 = 0;
    private static final int NAME2 = 1;
    private static final int SALARY = 2;
    private static final int CONTRACT = 3;
    private static final int VALID_ROW_LENGTH = 4;
    private static final int NUMBER_OF_EMPLOYEES_TO_FIRE = 3;

    public static void main(String[] args) {
        try {
            printEmployeesToFire();
        } catch (IOException e) {
            System.out.println("Blad odczytu pliku!");
        }
    }

    private static void printEmployeesToFire() throws IOException {
        List<Employee> employees = prepareEmployeesList();
        System.out.println("\nPracownicy z najwyzszymi wynagrodzeniami");
        for (int i = 0; i < NUMBER_OF_EMPLOYEES_TO_FIRE; i++) {
            System.out.println(employees.get(i));
        }
    }


    private static List<Employee> prepareEmployeesList() throws IOException {
        List<String> employeesFromFile = readFile();
        List<Employee> employees = new ArrayList<>();

        for (String employee : employeesFromFile) {
            String[] currentEmployee = cleanString(employee);
            if (isValidRow(currentEmployee)) {
                String name = String.format("%s %s", currentEmployee[NAME1], currentEmployee[NAME2]);
                employees.add(new Employee(name, Double.parseDouble(currentEmployee[SALARY]), currentEmployee[CONTRACT]));
            }
        }
        employees.sort(Collections.reverseOrder());
        return employees;
    }

    private static boolean isValidRow(String[] currentEmployee) {

        if (currentEmployee.length != VALID_ROW_LENGTH) {
            return false;
        }

        String regex = "kowalsk[a|i]";
        String name1 = currentEmployee[NAME1];
        String name2 = currentEmployee[NAME2];
        double salary = 0.0;

        try {
            salary = Double.parseDouble(currentEmployee[SALARY]);
        } catch (NumberFormatException e) {
            System.out.println("Blad przy parsowaniu wynagrodzenia");
        }

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        return (!pattern.matcher(name1).matches() &&
                !pattern.matcher(name2).matches() &&
                salary != 0.0);
    }

    private static String[] cleanString(String string) {
        return string
                .replaceAll(",", ";")
                .replaceAll(" ", "")
                .replaceAll("zł", "")
                .split(";");
    }

    private static List<String> readFile() throws IOException {
        String filename =
                "/home/przemysaw/IdeaProjects/KAT_JEE_W_03_Servlety/b_Zadania_Domowe/a_Dzien_1/earnings.txt";
        Path source = Paths.get(filename);
        if (!Files.exists(source)) {
            throw new IOException("Podany plik nie istnieje!");
        }
        return new ArrayList<>(Files.readAllLines(source));
    }
}
