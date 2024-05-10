package estruturaPosCondicionada;
import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0,idade, numDeIdade = 0;
		
		while(i<=20) {
			System.out.println("qual sua idade?");
			idade =ler.nextInt();
			if (idade >= 18) {
				numDeIdade ++;
			}
			i++;
		}
		System.out.println(numDeIdade+" pessoas são maiores de idade");
		ler.close();
	}

}
