package estruturaPosCondicionada;
import java.util.Scanner;

public class RepeticaoDeNome {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num,i = 1;
		String nome;
		System.out.println("Qual o seu nome?");
		nome = ler.nextLine();
		System.out.println("Quantas vezes deseja repeti-lo");
		num = ler.nextInt();
		while (i <= num) {
			System.out.println("Seu nome é "+nome);
			i++;
		}
		ler.close();
	}

}
