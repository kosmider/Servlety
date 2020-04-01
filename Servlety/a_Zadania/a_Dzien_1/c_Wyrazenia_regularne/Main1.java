package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {

        String mail = "kos@gmail.com";
        System.out.println(verifyEmail(mail));

        String html = "<html>";
        System.out.println(verifyHtml(html));
    }
    static boolean verifyEmail(String email) {
        Pattern pattern = Pattern.compile("[\n" +
                "_\n" +
                "a-zA-Z0-9-]+(\\.[\n" +
                "_\n" +
                "a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            return true;
        }
        else return false;
    }

    static boolean verifyHtml(String html) {
        Pattern pattern = Pattern.compile("<([a-z]+)[^<>\\/]*(?:>(.\n" +
                "*)<\\/\\1>|\\/>)");
        Matcher matcher = pattern.matcher(html);

        if (matcher.find()){
            return true;
        } else return false;
    }
}
