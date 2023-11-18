public class Main {
	public static void main(String [] args) {
		RationalFraction drob = new RationalFraction(2,4);
		RationalFraction drob2 = new RationalFraction(4,8);
		RationalFraction drob3 = drob.add(drob2);
		drob.add2(drob2);
		System.out.println(drob3.getNumer());
		System.out.println(drob3.getDenom());
	}
}