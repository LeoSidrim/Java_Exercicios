package estudo;
import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		//Tabuada_com_while
		
		Scanner sc = new Scanner(System.in);
		int i = 0;

		while (true) {
			System.out.println("--- Tabuada 0-10 _--\n1-Entrada\n2-Saída");
			int code = sc.nextInt();
			if (code == 2) {
				break;
			}
			System.out.println("Insira um número inteiro");
			int a = sc.nextInt();
			while (i<=10) {
			 System.out.print(a +"x"+ i +"="+a*i+"\n");
			 i++;
			}
			System.out.println("\n");
			
		}
		sc.close();

	}

}
