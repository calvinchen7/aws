import java.text.NumberFormat;
import java.util.Locale;

public class Bar {

public static void main(String[] args) {
Locale locale = Locale.US;

// Line 1.
NumberFormat formatter = NumberFormat.getCurrencyInstance(locale); // D.
double currency = 1_00.00;
System.out.println(formatter.format(currency));
}

}