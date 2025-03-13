package estudo;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	while (true) {
		System.out.println("Verificador de números primos\n1-Entrada\n2-Saída\n");
		int x = sc.nextInt();
		if (x == 2) {
			break;
		}
		System.out.println("Insira um número");
		int a = sc.nextInt();
		if (a % a == 0 && a / 1 == a) {
			System.out.println("Seu número é primo");
		} else {
			System.out.println("Seu número não é primo");
		}
		
	}
	
	
	
	
	sc.close();
	}
}
