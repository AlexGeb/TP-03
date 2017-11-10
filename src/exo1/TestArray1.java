package exo1;

/**
 * @author ETY0002
 *
 */
public class TestArray1 {

	/** Entry point
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		// display all elements
		displayArray(array,true);
		// display all elements in the inverse order
		displayArray(array,false);
		// display all elements superior to 3
		filterArray(array,3);
		// display even elements
		displayEven(array);
		// display max
		displayBigger(array);
		// display min
		displaySmaller(array);
	}

	/** display all the elements of an array 
	 * @param arg the array to display
	 * @param order boolean to chose in which order to display the array
	 */
	public static void displayArray(int[] arg, boolean order) {
		System.out.print("{ ");
		if(order) {
			int i = 0;
			for(;i<arg.length;i++) {
				System.out.print(arg[i] + " ");
			}
		} else {
			int i = arg.length-1;
			for(;i>=0;i--) {
				System.out.print(arg[i] + " ");
			}
		}
		System.out.println("} ===> " + arg.length + " elements");
	}
	
	/** display all elements of param entry superior to param maxvalue
	 * @param entry array to filter
	 * @param maxvalue
	 */
	public static void filterArray(int[] entry, int maxvalue) {
		int count = 0;
		System.out.print("{ ");
		for (int i = 0; i < entry.length; i++) {
			if (entry[i]>maxvalue) {
				count++;
				System.out.print(entry[i] + " ");
			}
		} 
		System.out.println("} ===> " + count + " elements are bigger than " + maxvalue);
	}
	
	/** display the even elements of the param entry 
	 * @param entry array of integer
	 */
	public static void displayEven(int[] entry) {
		int count = 0;
		System.out.print("{ ");
		for (int i = 0; i < entry.length; i++) {
			if (entry[i]%2 == 0) {
				count++;
				System.out.print(entry[i] + " ");
			}
		} 
		System.out.println("} ===> " + count + " elements are even");
	}
	
	/** display the bigger int
	 * @param entry array of integer
	 */
	public static void displayBigger(int[] entry) {
		int max = 0;
		for (int i = 0; i < entry.length; i++) {
			if(entry[i]>max) {
				max = entry[i];
			}
		} 
		System.out.println("the max is : " + max);
	}
	
	/** display the smaller int
	 * @param entry array of integer
	 */
	public static void displaySmaller(int[] entry) {
		int min = 32767;
		for (int i = 0; i < entry.length; i++) {
			if(entry[i]<min) {
				min = entry[i];
			}
		} 
		System.out.println("the min is : " + min);
	}
	
}
