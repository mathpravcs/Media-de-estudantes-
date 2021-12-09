package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculo media = new Calculo();

		System.out.println("Digite as medias:");
		media.media1 = sc.nextDouble();
		media.media2 = sc.nextDouble();
		media.media3 = sc.nextDouble();
		media.media4 = sc.nextDouble();

		if (media.FinalMedia() < 5.0) {
			System.out.println("Aluno Reprovado ");
		} else {
			System.out.println("Aluno Aprovado");
		}

		sc.close();
	}

}
