public class Main {
    public static void main(String[] args) {
        // Создаем рациональные дроби
        RationalFraction fraction1 = new RationalFraction(1, 2);
        RationalFraction fraction2 = new RationalFraction(3, 4);

        // Создаем векторы с использованием рациональных дробей
        RationalVector2D vector1 = new RationalVector2D(fraction1, fraction2);
        RationalVector2D vector2 = new RationalVector2D(new RationalFraction(2, 3), new RationalFraction(1, 4));

        // Печатаем векторы
        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);

        // Проверяем метод add
        RationalVector2D sumVector = vector1.add(vector2);
        System.out.println("Sum Vector: " + sumVector);

        // Проверяем метод length
        System.out.println("Length of Vector 1: " + vector1.length());

        // Проверяем метод scalarProduct
        RationalFraction scalarProduct = vector1.scalarProduct(vector2);
        System.out.println("Scalar Product: " + scalarProduct);

        // Проверяем метод equals
        RationalVector2D vector3 = new RationalVector2D(fraction1, fraction2);
        System.out.println("Vector 3: " + vector3);
        System.out.println("Are Vector 1 and Vector 3 equal? " + vector1.equals(vector3));
        System.out.println("Are Vector 1 and Vector 2 equal? " + vector1.equals(vector2));
    }
}