package unidade01;
import java.util.Scanner;

class SomarDoisInt {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		//declarar variaveis
		int a, b, soma;
		
		//leitura
		System.out.println("digite um n�mero: ");
		a = scan.nextInt();
		System.out.println("digite outro n�mero: ");
		b = scan.nextInt();
		
		//soma
		soma = a + b;
		
		//mostrar resultado
		System.out.println("Soma = " + soma);
	}
}