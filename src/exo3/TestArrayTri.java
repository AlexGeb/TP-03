/**
 * 
 */
package exo3;

import java.util.Arrays;

import exo2.TestArray2;

/**
 * @author ETY0002
 *
 */
public class TestArrayTri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		// order the array
		System.out.println(Arrays.toString(order(array)));
		
		// order it with Arrays 
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static int[] order(int[] array) {
		int[] ordered = array;
		for (int i = ordered.length - 1; i > 0 ; i--) {
			for (int j = 0; j < i; j++) {
				if (ordered[j + 1] < ordered[j]) {
					int a = ordered[j+1];
					int b = ordered[j];
					ordered[j+1] = b;
					ordered[j] = a;
				}
			}
		}
		return ordered;
	}

}
