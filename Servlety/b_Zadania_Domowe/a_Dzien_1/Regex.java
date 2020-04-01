package b_Zadania_Domowe.a_Dzien_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Wyrazenia regex w Javie: ");
        Pattern compiledPattern = Pattern.compile("reg.*");
        Matcher matcher = compiledPattern.matcher("Wyrazenia regex w Javie");
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        System.out.println("\n\nIlona: ");
        Pattern pattern = Pattern.compile("I.o.a\\d+");
        Matcher matcher1 = pattern.matcher("Ilona1991");
        System.out.println(matcher1.find());
        System.out.println(matcher1.matches());

        System.out.println("\n\nMail: ");
        Pattern pattern1 = Pattern.compile("[a-g]*[0-9]+\\d.[^Przemek]");
        Matcher matcher2 = pattern1.matcher("e13@a");
        System.out.println(matcher2.find());
        System.out.println(matcher2.matches());

        System.out.println(verify("P_1111"));
        System.out.println(verify("Przem2331"));
        System.out.println(verify("a1234"));
        System.out.println(verify("kosmiderprzemyslaw1991@gmail.com"));
        System.out.println(verify("kosmo1@o2.pl"));

        System.out.println("\n2019 Pazdziernik");
        Pattern pattern2 = Pattern.compile("\\d+.[a-z]+");
        Matcher matcher3 = pattern2.matcher("2019Rpazdzernik");
        System.out.println(matcher3.find());
        System.out.println(matcher3.matches());
    }

    static boolean verify(String email) {
        return Pattern.matches("^[a-zA-Z_]+(\\d)+[@]\\D*\\d*\\.\\D{2,}$", email);
    }
}
