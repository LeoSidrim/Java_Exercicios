package estudo;
import java.util.Scanner;
public class Questao5 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mult = 1;
		while(true) {
			
			System.out.println("Fatoria\n1-Entrada\n2-Saida");
			int cod = sc.nextInt();
			if(cod==2) {
				break;
			}
			System.out.println("Insira seu número: ");
			int a = sc.nextInt();
			
			if(a==0) {
				System.out.println("Resultado: 1");
			} else if (a<=0) {
				System.out.println("Insira um número positivo");
			}
			
			for(int i=1; i<=a;i++) {
				mult*=i;
			}
			
			System.out.println("valor fatorial: "+ mult);

			
		}
		sc.close();
		
	}
}
