public class Main {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		Vector2D vector = new Vector2D(x,y);
		System.out.println(vector.toString());
		Vector2D vector2 = new Vector2D(1,1);
		vector.add2(vector2);
		System.out.println(vector.toString());
		Vector2D vector3 = vector.add(vector);
		System.out.println(vector3.toString());
		System.out.println("Length is: " + vector.length());
		Vector2D zeroVector1 = new Vector2D();
		Vector2D zeroVector2 = new Vector2D();
		double cos = zeroVector1.cos(zeroVector2);
		System.out.println(cos);
		zeroVector1.setX(0);
		zeroVector1.setY(1);
		zeroVector2.setX(0);
		zeroVector2.setY(5);
		System.out.println(zeroVector1.x);
		System.out.println(zeroVector1.toString());
		System.out.println(zeroVector2.toString());
		cos = zeroVector1.cos(zeroVector2);
		System.out.println(cos);
		zeroVector2.setY(1.0000005);
		System.out.println(zeroVector1.toString());
		System.out.println(zeroVector2.toString());
		System.out.println(zeroVector1.equals(zeroVector2));
	}
}