public class Task4b {
	public static void main(String [] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int m1;
		int n1;
		System.out.println("Input size of first matrix(m n):");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		int [][] array1 = new int[n1+1][m1+1];
		System.out.println("Input your matrix:");
		for (int i = 0; i < m1; i++) {
			
			for (int j = 0; j < n1; j++) {
				array1[i][j] = sc.nextInt();
				
			}
		}
		int m2;
		int n2;
		System.out.println("Input size of second matrix(m n):");
		m2 = sc.nextInt();
		n2 = sc.nextInt();
		int [][] array2 = new int[n2+1][m2+1];
		System.out.println("Input your matrix:");
		for (int i = 0; i < m2; i++) {
			
			for (int j = 0; j < n2; j++) {
				array2[i][j] = sc.nextInt();
				
			}
		}

		if (n1 == m2) {
			int [][] array3 = new int[m1][n2];
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < m1; j++) {
					for (int k = 0; k < n2; k++) {
						array3[i][j] += array1[i][k]*array2[k][j];
					}
				}
			}
			System.out.println("Multiply of two matrix:");
			for (int i = 0; i < array3.length;i++) {
				for (int j = 0; j < array3[i].length; j++) {
					System.out.print(array3[i][j] + " ");
				}
				System.out.println("");
			}
		} else {
			System.out.println("Sizes dont suit!");
		}
	}
}