/*-------------------*
| Rodrigo CavanhaMan |
| URI 1059           |
| Numeros Pares      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int num = 1;
		
		while (num <= 100) {
			if (num % 2 == 0){
				System.out.println(num);
			}
			num = num + 1;
		}

		sc.close();
	}
}