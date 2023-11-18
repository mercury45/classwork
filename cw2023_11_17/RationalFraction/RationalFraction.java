/*2
Класс RationalFraction - рациональная дробь. Атрибуты - два целых числа (числитель и знаменатель). Методы:
•	RationalFraction() - конструктор для дроби, равной нулю;
•	RationalFraction(int, int) - конструктор дроби со значениями числителя и знаменателя; в конструкторах устраняйте дублирование кода;
•	void reduce() - сокращение дроби;
•	RationalFraction add(RationalFraction) - сложение дроби с другой дробью, результат возвращается как новый объект (не забудьте сократить)
•	void add2(RationalFraction) - сложение дроби с другой дробью, результат сохраняется в том, у кого был вызван этот метод (не забудьте сократить);
•	RationalFraction sub(RationalFraction) - вычитание из дроби другой дроби, результат возвращается как новый объект (не забудьте сократить);
•	void sub2(RationalFraction) - вычитание из дроби другой дроби, результат сохраняется в том, у кого был вызван этот метод (не забудьте сократить);
•	RationalFraction mult(RationalFraction) - умножение дроби на другую дробь, результат возвращается как новый объект (сократить)
•	void mult2(RationalFraction) - умножение дроби на другую дробь, результат сохраняется;
•	RationalFraction div(RationalFraction) - деление дроби на другую дробь, результат возвращается как новый объект (сократить)
•	void div2(RationalFraction) - деление дроби на другую дробь, результат сохраняется; больше не буду писать "возвращается" или "сохраняется", думаю, уже и так понятно.
•	String toString() - строковое представление дроби (например, -2/3);
•	double value() - десятичное значение дроби;
•	boolean equals(RationalFraction) - сравнить дробь с другой дробью 
•	(не забывайте, что 2/4 и 1/2 - одна и та же дробь)
•	int numberPart() - целая часть дроби;
*/


public class RationalFraction {
	private int numer;
	private int denom;
	public RationalFraction() {
		this(0,1);
	}

	public RationalFraction(int numer, int denom) {
		if (denom < 0) {
			this.numer = (-1) * numer;
			this.denom = (-1) * denom;
		} else {
			this.numer = numer;
			this.denom = denom;
		}
	}

	public int getNumer() {
		return numer;
	}

	public int getDenom() {
		return denom;
	}

	public void reduce() {
		int nod = Helper.euqlid(numer,denom);
		numer /= nod;
		denom /= nod;
	}

	public RationalFraction add(RationalFraction fraction) {
		RationalFraction fractionNew = new RationalFraction();
		if (denom != fraction.denom) {
			fractionNew.numer = numer * fraction.denom + fraction.numer * denom;
			fractionNew.denom = denom * fraction.denom;
		} else {
			fractionNew.numer = numer + fraction.numer;
		}
		fractionNew.reduce();
		return fractionNew;
	}

	public void add2(RationalFraction fraction) {
		if (denom != fraction.denom) {
			numer = numer * fraction.denom + fraction.numer * denom;
			denom = denom * fraction.denom;
		} else {
			numer += fraction.denom;
		}

		this.reduce();
	}

	public String toString() {
		return numer + "/" + denom;
	}
}
