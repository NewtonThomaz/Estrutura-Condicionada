package estruturaPosCondicionada;
import java.util.Scanner;

public class LerNome {

	public static void main(String[] args) {
		int repeticao = 0;
		String nome;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual o seu nome");
		nome = ler.nextLine();
		
		while(repeticao < 10) {
			System.out.println(nome);
			repeticao ++;
			
		}
		ler.close();
	}

}
