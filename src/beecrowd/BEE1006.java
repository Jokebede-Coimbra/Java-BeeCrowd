package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BEE1006 {

	public static void main(String[] args) {

		/*
		 * Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um
		 * aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a
		 * nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0
		 * at� 10.0, sempre com uma casa decimal.
		 * 
		 * Entrada O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla
		 * precis�o (double).
		 * 
		 * Sa�da Imprima a mensagem "MEDIA" e a m�dia do aluno conforme exemplo abaixo,
		 * com 1 d�gito ap�s o ponto decimal e com um espa�o em branco antes e depois da
		 * igualdade. Assim como todos os problemas, n�o esque�a de imprimir o fim de
		 * linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		System.out.println("MEDIA = " + String.format("%.1f", media));

		sc.close();
	}

}
