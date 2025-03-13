package estudo;
import java.util.Scanner;
public class Questao4 {
	public static void main (String[] args) {
		
	//sistema_de_caixa
	Scanner sc = new Scanner(System.in);
	double saldo = 0;
	while (true) {
		
		System.out.println("---Sistema bancário---\n1-ver saldo\n2- depositar\n3-sacar\n4-sair");
		int x = sc.nextInt();
		if (x == 4) {
			break;
		}
		switch (x) {
		
		case 1:
			System.out.println("SEU SALDO É: "+ saldo);
			break;
		case 2:
			System.out.println("INSIRA O VALOR QUE DESEJA DEPOSITAR: ");
			double deposit = sc.nextDouble();
			saldo += deposit;
			System.out.println("SALDO DEPOSITADO!\n SEU NOVO SALDO É:  " + saldo);
			break;
		case 3:
			System.out.println("INSIRA O VALOR QUE DESEJA SACAR: ");
			double withdraw = sc.nextDouble();
			saldo -= withdraw;
			System.out.println("SALDO ATUALIZADO!\n SEU NOVO SALDO É:  " + saldo);
			break;
		}
		
	}
	sc.close();
	}
}
