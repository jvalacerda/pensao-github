package application;

import java.util.Locale;
import java.util.Scanner;

import pensionato.Pensao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pensao[] vect = new Pensao[10];

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			sc.nextLine();

			System.out.print("Rent #" + (i + 1) + ":\n");

			System.out.print("Name:");
			String name = sc.nextLine();

			System.out.print("Email:");
			String email = sc.nextLine();

			System.out.print("Room:");
			int room = sc.nextInt();

			vect[room] = new Pensao(name, email);
		}

		System.out.print("Busy rooms:\n");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.print(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		sc.close();
	}

}
