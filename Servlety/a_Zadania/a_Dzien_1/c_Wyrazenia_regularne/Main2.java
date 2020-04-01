package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("quit")) {
            String pass = scanner.next();
            System.out.println(verifyPassword(pass));
        }

    }

    static boolean verifyPassword(String password) {
        boolean validLength = verifyLength(password);
        boolean validLowerCase = verifyLowerCase(password);
        boolean validUpperCase = verifyUpperCase(password);
        boolean validDoubleCase = verifyNoDoubleCase(password);
        return validLength && validLowerCase && validUpperCase && validDoubleCase;
    }


    private static boolean verifyLength(final String password) {
        return password.matches(".{10,15}");
    }

    private static boolean verifyLowerCase(String password) {
        final Pattern compile = Pattern.compile("[a-z]");
        return compile.matcher(password).find();
    }

    private static boolean verifyUpperCase(String password) {
        final Pattern compile = Pattern.compile("[A-Z]");
        return compile.matcher(password).find();
    }

    private static boolean verifyNoDoubleCase(final String password) {
        final Pattern compile = Pattern.compile("[a-z]{2}|[A-Z]{2}");
        return !compile.matcher(password).find();
    }

 /*   private static void findVsMatch() {
        String string = "alakoala";
        Pattern pattern = Pattern.compile(".*ko.*");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
    }

  */
}

/*
 Pattern compiledPattern = Pattern.compile("reg.*");
        Matcher matcher = compiledPattern.matcher("Wyrażenia regularne w Javie");
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher("Java jest technologią wykorzystywaną do\n" +
                "tworzenia aplikacji, które czynią Internet bardziej atrakcyjnym.\n" +
                "Java to nie to samo co JavaScript. Więcej informacji o oprogramowaniu Java");
        while (matcher1.find()) {
            System.out.println("start: " + matcher1.start());
            System.out.println("end: " + matcher1.end() + " ");
 */
