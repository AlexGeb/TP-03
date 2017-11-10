package exo2;

import java.util.Arrays;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		// Display the mean of array :
		System.out.println("the mean is : " + getMean(array));

		System.out.println("the index of 15 is : " + getIndex(array,15));
		getDoublons(array);
	}

	/**
	 * @param array
	 * @return mean of array
	 */
	public static double getMean(int[] array) {
		double mean = 0;
		for (int i = 0; i < array.length; i++) {
			mean += array[i];
		}
		mean = mean / array.length;
		return mean;
	}

	public static void getDoublons(int[] array) {
		String doublons = "";
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			int[] sub = Arrays.copyOfRange(array, i+1, array.length);
			if(getIndex(sub,array[i])>=0) {
				count++;
				doublons += array[i] +" ";
			}
		}
		System.out.println("there are "+ count + " doublons : " + doublons);
	}

	public static int getIndex(int[] array, int el) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == el) {
				index = i;
			}
		}
		return index;
	}
}
