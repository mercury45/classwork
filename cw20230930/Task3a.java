public class Task3a {
	public static void main(String [] args) {
		 int [] a = {2,9,3,4,5,6};
		 int [] b = {3,3,3,4,5,6};
		 // ТОЛЬКО ЕСЛИ len(a) == len(b)
		 int lenA = a.length;
		 int lenB = b.length;
		 int [] c = new int[lenA+1];
		 int lenC = c.length;

		 int div = 0;

		 for (int i = 1; i <= lenA; i++) {
		 	 
		 	
		 	c[lenC-i] += div;
		 	
		 	c[lenC-i] += a[lenA-i] + b[lenB-i];
		 	div = c[lenC-i] / 10;
		 	System.out.println(div);
			c[lenC-i] %= 10;
		}

		 c[0] += div;
		 System.out.println("You've got: ");

		 for (int i = (c[0] != 0) ? 0 : 1; i < lenC; i++) {
		 	System.out.print(c[i]); 
		 }
	}
}