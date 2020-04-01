/*
#### Zadanie 3

1. W pliku `Main2.java` do zmiennych **reg1**, **reg2**, **reg3**, **reg4** wpisz kolejno wyrażenia regularne, opisujące:

    * liczby zmiennoprzecinkowe (5.65 , 123.123)
    * liczby w notacji naukowej ( 5.4325e+04 ; 2.0000342E-06)
    * datę w formacie `dd/mm/yyyy`
    * datę w formacie `yyyy-mm-dd` - gdzie rok jest powyżej 2000

 */
package b_Zadania_Domowe.a_Dzien_1;

public class Main2 {
	public static void main(String[] args) {
		String reg1 = "^-?\\d+\\.\\d+$";
		String reg2 = "^-?\\d+\\.\\d+e(\\+|-)\\d+$/mi";
		//nie waliduje lutego
		String reg3 = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/\\d{4}$";
		//nie waliduje lutego,
		String reg4 = "^(2\\d{3})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
		String reg5 = "";
	}

}
