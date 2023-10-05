import java.util.Scanner;

public class Task4c {

	// Функция вывода матрицы
	public static void PrintOut(double [][] matrix) {
		int numStrings = matrix.length;

		for (int i = 0; i < numStrings; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}


	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put matrix size(n):");
		final double EPS = 1e-4;
		int n = sc.nextInt();
		double [][] matrix = new double[n][n];
		// Просим матрицу
		for (int i = 0; i < n; i++) {
			System.out.println("Print your " + (i+1) + " string of matrix");
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextDouble();
			}
		}


		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				double c = matrix[j][i] / matrix[i][i];
				for (int k = i + 1; k < n ; k++) {
					System.out.println(matrix[j][k]);
					matrix[j][k] -= c * matrix[i][k];

				}
				matrix[j][i] = 0.0;
				PrintOut(matrix);
			}
		}
				




		PrintOut(matrix);

		for (int i = 0; i < n; i++) {
			if (matrix[i][i] == 0) {
				System.out.println("Линейно-зависимая строка");
			} 
		}
	}
}