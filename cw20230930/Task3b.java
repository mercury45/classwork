public class Task3b {
	public static void main(String [] args) {
		int [] a = {3,4,5};
		int [] b = {2,2,2,2,2};
		int lenA = a.length;
		int lenB = b.length;
		int [] arrayOfTenDegree = {1,10,100,1000,10000,100000,1000000,10000000};

		int s = 0;
		for (int i = 1; i <= lenB; i++) {

			for (int j = 1; j <= lenA; j++) {

				s += a[lenA-j]*arrayOfTenDegree[j-1]*b[lenB-i]*arrayOfTenDegree[i-1];
				
				}
			}	

		System.out.println();
		System.out.println(s);
		}			
}
