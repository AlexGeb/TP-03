package exo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> tab = new ArrayList<Integer>();
		System.out.println("**** Exercice 4 ****");
		Scanner questionUser = new Scanner(System.in); // scanner object for human interaction
		boolean encore = true;
		while (encore) {
			System.out.println("Veuillez choisir une option (1 ou 2) : ");
			System.out.println("1 : ajoute un entier à un tableau");
			System.out.println("2 : affiche le tableau");
			System.out.println("3 : quitter");
			int a = questionUser.nextInt(); // menu
			switch (a) {
			case 1:
				System.out.println("Entrez un entier à ajouter dans le tableau :");
				int b = questionUser.nextInt();
				tab.add(b);
				break;
			case 2:
				System.out.println(tab);
				break;
			case 3:
				encore = false;
				break;
			default:
				System.out.println("Seuls 1 et 2 sont des entrées valides !");
				break;
			}
		}
		questionUser.close();
		System.out.println("Au revoir !");
	}
}
