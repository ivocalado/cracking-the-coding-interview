package arrays_and_strings;

import java.util.ArrayList;

import cracking_code.tools.Pair;



public class P_08_ZeroMatrix {

	int[][] zeroMatrix(int[][] matrix) {
		ArrayList<Pair<Integer, Integer>> list = new ArrayList<Pair<Integer,Integer>>();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					list.add(new Pair<Integer, Integer>(i, j));
				}
			}
		}
		
		for(Pair<Integer, Integer> pair : list) {
			for(int i = 0; i<matrix.length; i++) {
				matrix[pair.getFirst()][i] = 0;
				matrix[i][pair.getSecond()] = 0;
			}
		}
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
		int[][] matrix = { { 0, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 0, 3, 3 }, { 4, 4, 4, 4, 4 },
				{ 5, 5, 5, 5, 5 } };
		printMatrix(matrix);	
		System.out.println();
		System.out.println();
		int[][] result = new P_08_ZeroMatrix().zeroMatrix(matrix);
		printMatrix(result);
	}
}
