package exo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**** Exercice 4 **** \n Veuillez choisir une option (1 ou 2) : ");
		Scanner questionUser = new Scanner(System.in); // scanner object for human interaction
		ArrayList<Integer> tab = new ArrayList<Integer>();
		int a = questionUser.nextInt(); // question 1
		switch (a) {
		case 1:
			System.out.println("Enter a number");
			int b = questionUser.nextInt(); // question 1
			tab.add(b);
			break;
		case 2:
			System.out.println(tab);
			break;
		default:
			System.out.println("You must enter 1 or 2 !!");
		}

	}
}
