package estruturaPosCondicionada;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, resposta;
		int acertos = 0, acertosTotais = 0, totalDePessoas = 0;
		
		do {
			acertos -=acertos;
			totalDePessoas ++;
		System.out.println("Qual foi a resposta da sua primeira questão?");
		r1 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua segunda questão?");
		r2 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua terceira questão?");
		r3 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua quarta questão?");
		r4 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua quinta questão?");
		r5 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua sexta questão?");
		r6 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua setima questão?");
		r7 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua oitava questão?");
		r8 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua nona questão?");
		r9 =ler.nextLine();
		System.out.println("Qual foi a resposta da sua décima questão?");
		r10 =ler.nextLine();
		if (r1.equals("A")) {
			acertos ++;
		}if (r2.equals("B")) {
			acertos ++;
		}if (r3.equals("C")) {
			acertos ++;
		}if (r4.equals("D")) {
			acertos ++;
		}if (r5.equals("E")) {
			acertos ++;
		}if (r6.equals("E")) {
			acertos ++;
		}if (r7.equals("D")) {
			acertos ++;
		}if (r8.equals("C")) {
			acertos ++;
		}if (r9.equals("B")) {
			acertos ++;
		}if (r10.equals("A")) {
			acertos ++;
			acertosTotais += acertos;
		}
		System.out.println("Você acertouu "+acertos+" sua nota foi "+acertos);
		System.out.println("Tem mais alguém para calcular a nota?[S/N]");
		resposta = ler.nextLine();
		
		}while(resposta.equals("S"));
		System.out.println(totalDePessoas+" fizeram a prova e "+(acertosTotais/totalDePessoas)+" foi a média");
		ler.close();
	}

}
