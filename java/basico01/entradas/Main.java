/*
	Primeiro programa Java para entrada de dados
*/

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		System.out.println("== Entrada de dados Java 001 ==");
		System.out.print("Informe seu nome : ");
		Scanner in1 = new Scanner(System.in);


		//String nome = in1.next(); //next() entra com a primeira palavra quebrando no primeiro espaço
		String nome = in1.nextLine(); // nextLine() entra com uma linha de string

		System.out.print("Informe sua idade : ");
		int idade = in1.nextInt();

		System.out.print("Informe sua renda mensal : ");
		float renda = in1.nextFloat();

		double rendaAnual = renda * 12;

		System.out.println("O nome informado foi :"+nome);
		System.out.println("A idade informada foi : " + idade);
		System.out.println("Sua renda mensal : " + renda);
		System.out.println("Renda anual : " + String.format("%.2f", rendaAnual));



	}


}