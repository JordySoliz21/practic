package Class27april;
import java.util.Scanner;
public class fact_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		for (int i=1; i<=10; i++) {
			int factorial=1;
		for (int j=1; j<=i; j++) {
			factorial*=j;
		}
		System.out.println("El factorial de " + i + " es:"+ factorial);
		}
    }
}