package estudo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	double a ,b, result;
	int cod;
	Scanner sc = new Scanner(System.in);
	
	while (true) {
		
	System.out.println("---MENU---\n\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5- sair");	
	System.out.println("Insira sua opção");
	cod = sc.nextInt();
	if (cod==5) {
		break;
	}
		
	System.out.println("Insira valor A: ");
	a = sc.nextDouble();
	System.out.println("Insira valor B: ");
	b = sc.nextDouble();
	
	
	switch (cod) {
	
	case 1:
		result = a + b;
		System.out.println("O resultado é: "+ result);
		break;
	case 2:
		result = a - b;
		System.out.println("O resultado é: "+ result);
		break;
	case 3:
		result = a * b;
		System.out.println("O resultado é: "+ result);
		break;
	case 4:
		if(b != 0) {
			result = a/b;
			System.out.println("O resultado é: "+ result);
			
		} else {
			System.out.println("Valor de denominador inválido. Insira outro valor diferente de 0.");
		}
		break;
	}
	
	
	}
		
	sc.close();	
	}}