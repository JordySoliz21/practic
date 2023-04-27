package Class27april;
import java.util.Scanner;
public class parametros_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.println("Ingrese aquí una palabra: ");
		String pal = tc.nextLine();
		
		int longi = pal.length();
		int i = longi-1;
		String palInv = "";
		
		while (i>=0) {
			palInv+=pal.charAt(i);
			i--;
		}
	System.out.println("Palabra invertida: " + palInv);
	}

}
