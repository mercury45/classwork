public class Main {
	public static void main(String [] args) {
		RationalFraction drob = new RationalFraction(2,4);
		RationalFraction drob2 = new RationalFraction(4,8);
		RationalFraction drob3 = drob.add(drob2);
		RationalFraction drob4 = drob.sub(drob2);
		RationalFraction drob5 = drob.mult(drob2);
		RationalFraction drob6 = drob.div(drob2);
		System.out.println(drob3.toString()+ " " + drob3.value());
		System.out.println(drob4.toString()+ " " + drob4.value());
		System.out.println(drob5.toString()+ " " + drob5.value());
		System.out.println(drob6.toString() + " " + drob6.value());
		System.out.println(drob.equals(drob2));

	}
}