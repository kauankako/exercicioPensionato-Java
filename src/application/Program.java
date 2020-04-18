package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		Cliente[] vect = new Cliente[9];
		for(int i=0; i<n; i++) {
			System.out.println("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int quarto = sc.nextInt();
			vect[i] = new Cliente(name, email, quarto);
		}
		for(int i=0; i<n; i++) {
			if(vect[i] != null) {
				System.out.println("Busy rooms: ");
				System.out.println(vect[i].getQuarto() + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
			}
		}
		
		
		sc.close();
	}
}
