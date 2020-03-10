package cracking_code.arrays_and_strings;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 * 
 * @author ivocalado
 *
 */
public class P_07_RotateMatrix {
	int[][] rotateMatrix(int[][] matrix) {
		//TODO

		return matrix;
	}

	static void printMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			for (int value : is) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 },
				{ 5, 5, 5, 5, 5 } };
		printMatrix(matrix);
		System.out.println();
		System.out.println();
//		int[][] result = new P_07_RotateMatrix().rotateMatrix(matrix);
//		printMatrix(result);
	}
}
