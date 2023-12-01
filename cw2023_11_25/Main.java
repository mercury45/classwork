public class Main {
	public static void main(String [] args) {
		int[] array = new int[]{4,1252,62363,-2,4,0};
		System.out.println(Check.isAllPostitiveHasChet(array));

		int[][] arr1 = new int[][]{{3,6,2},{1,3,6,9}};
		System.out.println(Check.isStringMod3(arr1));
		System.out.println("all chet: " + Check.isNumMod2InArray(arr1));
		String[][] arrStr1 = new String[][]{{"Asgk","SAGL","lkgj"}, {"Ikowf", "Bnsfaf","gjlsa"}, {"jasb","Ythrh","g"}};
		System.out.println(Check.isColsHasFirstGlas(arrStr1));
	}
}