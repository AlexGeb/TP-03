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
		displayArray(array,true);
	}

	public static void displayArray(int[] arg, boolean order) {
		System.out.print("{");
		int i = 0;
		for(;i<arg.length-1;i++) {
			System.out.print(arg[i] + ", ");
		}
		System.out.print(arg[i++]);
		System.out.print("}");
	}
}
