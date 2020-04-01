package b_Zadania_Domowe.a_Dzien_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class EmployeersToFire {
    private static final int NAME1 = 0;
    private static final int NAME2 = 1;
    private static final int SALARY = 2;
    private static final int CONTRACT = 3;
    private static final int VALID_ROW_LENGTH = 4;
    private static final int EMPLOYERS_TO_FIRE = 3;

    public static void main(String[] args) {
try {
    print();
} catch (IOException e){
    System.out.println("Brak pliku");
}
    }

    private static void print() throws IOException {
        List<Employee> employees = prepareEmploeeList();
        for (int i = 0; i < EMPLOYERS_TO_FIRE; i++) {
            System.out.println(employees.get(i));
        }
    }
    private static List<Employee> prepareEmploeeList() throws IOException {
        List<String> employeesFromFile = readFile();
        List<Employee> employees = new ArrayList<>();

        for (String employe: employeesFromFile
             ) {
            String[] currentemployee = cleanString(employe);
            if(isValidRow(currentemployee)) {
                String name = String.format("%s, %s", currentemployee[NAME1], currentemployee[NAME2]);
                employees.add(new Employee(name, Double.parseDouble(currentemployee[SALARY]), currentemployee[CONTRACT]));
            }
        }
        employees.sort(Collections.reverseOrder());
        return employees;
    }

    private static boolean isValidRow(String[] currentEmployee) {
        if(currentEmployee.length != VALID_ROW_LENGTH) {
            return false;
        }
        String regex = "kowalsk[i|a]";
        String name1 = currentEmployee[NAME1];
        String name2 = currentEmployee[NAME2];
        double salary = 0.00;

        try{
            salary = Double.parseDouble(currentEmployee[SALARY]);
        } catch (NumberFormatException e) {
            System.out.println("Blad przy parsowaniu");
        }

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);

        return (!pattern.matcher(name1).matches() &&
                !pattern.matcher(name2).matches() &&
                salary != 0.0);
    }

    private static List<String> readFile() throws IOException {
        String fileName =
                "/home/przemysaw/IdeaProjects/KAT_JEE_W_03_Servlety/b_Zadania_Domowe/a_Dzien_1/earnings.txt";
        Path source = Paths.get(fileName);
        if(!Files.exists(source)) {
            throw new IOException("Plik nie istnieje!");
        }
        return new ArrayList<>(Files.readAllLines(source));
    }

    private static String[] cleanString(String string) {
        return string
                .replaceAll(",", ";")
                .replaceAll(" ", "")
                .replaceAll("zł", "")
                .split(";");
    }
}