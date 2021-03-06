/*-------------------*
| Rodrigo CavanhaMan |
| URI 1132           |
| Multiplos de 13    |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x, y, soma = 0;

		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y){
			int aux = x;
			x = y;
			y = aux;
		}
		
		while (x <= y){
			if (x % 13 != 0){
				soma = soma + x;
			}
			x = x + 1;
		}
		System.out.println(soma);

		sc.close();
	}
}