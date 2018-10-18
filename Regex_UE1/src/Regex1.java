/* Erstellt von Carina Lainerberger
   11.10.2018
*/
import java.util.*;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
	// Diese Kommentar wurde mit einem Branch
        String eingabe="http://www.orf.at";
        System.out.println(eingabe);
        System.out.println(Pattern.matches("[h][t]{2}[p][s]?[:][/]{2}[w]{3}[.]{1}[a-zA-Z]{1,15}[.]{1}[a-z]{2,4}",eingabe));
    }
}
