/*1
Класс Vector2D - двумерный вектор. Атрибуты - два вещественных числа (координаты). Далее (здесь и в последующих подобных задачах) указываю методы с типом возвращамых значений, а в скобках пишу только типы параметров. get- и set- методы создавать по необходимости (тоже здесь и далее). 
•	Vector2D() - конструктор для нулевого вектора;
•	Vector2D(double, double) - конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
•	Vector2D add(Vector2D) - сложение вектора с другим вектором, результат возвращается как новый объект.
•	void add2(Vector2D) - сложение вектора с другим вектором, результат сохраняется в том, у кого был вызван этот метод;
•	Vector2D sub(Vector2D) - вычитание из вектора другого вектора, результат возвращается как новый объект;
•	void sub2(Vector2D) - вычитание из вектора другого вектора, результат сохраняется в том векторе, у кого был вызван этот метод;
•	Vector2D mult(double) - умножение вектора на вещественное число, результат возвращается как новый объект;
•	void mult2(double) - умножение вектора на вещественное число, результат сохраняется в векторе;

•	String toString() - строковое представление вектора;
•	double length() - длина вектора;
•	double scalarProduct(Vector2D) - скалярное произведение вектора на другой вектор;
•	double cos(Vector2D) - косинус угла между этим и другим вектором;
•	boolean equals(Vector2D) - сравнить вектор с другим вектором;

*/


public class Vector2D {
	private double x;
	private double y;

	public Vector2D() {
		this(0,0);
	}

	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	} 

	public Vector2D(double[] arr) {
		x = arr[0];
		y = arr[0];
	}
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Vector2D add(Vector2D vector) {
		Vector2D vectorNew = new Vector2D(x + vector.x, y + vector.y);
		return vectorNew;
	}

	public void add2(Vector2D vector) {
		x += vector.x;
		y += vector.y;
	}

	public Vector2D sub(Vector2D vector) {
		Vector2D vectorNew = new Vector2D(x - vector.x, y - vector.y);
		return vectorNew;
	}

	public void sub2(Vector2D vector) {
		x -= vector.x;
		y -= vector.y;
	}

	public Vector2D mult(double number) {
		Vector2D vectorNew = new Vector2D(x * number, y * number);
		return vectorNew;
	}

	public void mult2(double number) {
		x *= number;
		y *= number;
	}

	public String toString() {
		return "Vector: (" + x + ", " + y + ")";
	}

	public double length() {
		return Math.sqrt(x*x + y*y);
	}

	public double scalarProduct(Vector2D vector) {
		return x * vector.x + y * vector.y;
	}

	public double cos(Vector2D vector) {
		return this.scalarProduct(vector) / (this.length() * vector.length());
	}

	public boolean equals(Vector2D vector) {
		double x2 = vector.getX();
		double y2 = vector.getY();
		return (Helper.isCoordsEquals(x,x2) && Helper.isCoordsEquals(y,y2));
	}
}