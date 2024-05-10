package estruturaPosCondicionada;
import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, num = 0; 
		while(i <= 10) {
			System.out.println("Escreva um número");
			num += ler.nextInt();
			i++;
		}
		System.out.println("A soma dos números é "+ num);
		ler.close();
	}

}
