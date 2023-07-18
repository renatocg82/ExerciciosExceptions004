package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AppExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10];
		int i = 1;
		int cont = 0;

		try {

			while (i != 0) {
				System.out.println("Insira o valor para armazenar no vetor: ");
				i = sc.nextInt();
				vetor[cont] = i;
				cont = cont + 1;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("-----------------");
			System.out.println("O Vetor está cheio! ");
			System.out.println("-----------------");
		}

		catch (InputMismatchException e) {
			System.out.println("-----------------");
			System.out.println("Valor inserido inválido! ");
			System.out.println("-----------------");
		}
		
		for (int in : vetor) {
			System.out.println(in);
		}
		System.out.println();

		sc.close();
	}

}

