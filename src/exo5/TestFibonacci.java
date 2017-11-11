package exo5;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		System.out.println("**** Exercice 5 ****");
		Scanner questionUser = new Scanner(System.in); // scanner object for human interaction
		System.out.println("Choisissez un entier : ");
		int N = questionUser.nextInt();

		// Method with a power matrix
		long start2 = System.nanoTime();
		double N2 = fibonacci2(N);
		long elapsedTime2 = System.nanoTime() - start2;
		System.out.println("Seconde méthode : \n" + N2 + "\n calculé en " + elapsedTime2 * 10E-6 + " ms");

		// Recursive method
		long start = System.nanoTime();
		double N1 = fibonacci(N);
		long elapsedTime = System.nanoTime() - start;
		System.out.println("Méthode récursive : \n" + N1 + "\n calculé en " + elapsedTime * 10E-6 + " ms");

		// close the scanner object
		questionUser.close();
	}

	private static double fibonacci(int n) {
		if (n < 2)
			return (n);
		return (fibonacci(n - 2) + fibonacci(n - 1));
	}

	private static double fibonacci2(int n) {
		double[][] A = { { 0, 1 }, { 1, 1 } };
		double[][] B = powerMatrix(A, n - 1);
		return B[0][0] + B[0][1];
	}

	private static double[][] powerMatrix(double[][] a, int p) {
		double[][] result = a;
		for (int n = 1; n < p; ++n)
			result = multiplyMatrices(result, a);
		return result;
	}

	private static double[][] multiplyMatrices(double[][] a, double[][] b) {
		double[][] result = { { 0, 0 }, { 0, 0 } };
		for (int i = 0; i < 2; ++i)
			for (int j = 0; j < 2; ++j)
				for (int k = 0; k < 2; ++k)
					result[i][j] += a[i][k] * b[k][j];
		return result;
	}

	private static String matrixToString(double[][] a) {
		return a[0][0] + " " + a[0][1] + "\n" + a[1][0] + " " + a[1][1];
	}
}
