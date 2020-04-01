/*
W pliku `Main3.java`

1. Napisz program, który będzie przyjmował linie z konsoli, do momentu wpisania `quit`.
2. Przy pomocy metody `replaceAll` usuń z podanego wyrażenia znaki białe (np. spacje).
3. Program ma sprawdzać czy wpisany napis jest poprawnym działaniem matematycznym, np:
    ````
    2+3 - 1 = 4
    2 + 2 =4
    1+ 1 =2
    3-1 + 2 =122
    2 * 4- 2 = 6
    6 / 3 + 10 = 12
    ````
Możesz dokończyć wyrażenie :
````
private static final String REGEX = "(\\d[\\/*])*\\d=";
````

4. Jeżeli wyrażenie jest poprawny działaniem matematycznym zapisz je do pliku o nazwie `operations.txt`.
5. Pomijamy sprawdzanie poprawności wyniku, istotna jest poprawność składniowa.

 */

package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {


    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile("reg.*");
        Matcher matcher = compiledPattern.matcher("Wyrażenia regularne w Javie");
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        Pattern pattern = Pattern.compile("[A-Z]+\\s+[a-z]?.*\\d+\\w*[abc]+[^ijk]kot");
        Matcher matcher1 = pattern.matcher("PRZEMEK   tAk777_abckot");
        System.out.println("Find: - czy wystepuje " + matcher1.find());
        System.out.println("Matcher: - czy jest takie samo " + matcher1.matches());
    }
}
