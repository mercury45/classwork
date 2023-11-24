public class MainRationalMatrix2x2 {

    public static void main(String[] args) {
        // Создаем рациональные дроби
        RationalFraction fraction1 = new RationalFraction(1, 2);
        RationalFraction fraction2 = new RationalFraction(3, 4);
        RationalFraction fraction3 = new RationalFraction(5, 6);
        RationalFraction fraction4 = new RationalFraction(7, 8);

        // Создаем матрицы с использованием рациональных дробей
        RationalMatrix2x2 matrix1 = new RationalMatrix2x2(fraction1, fraction2, fraction3, fraction4);
        RationalMatrix2x2 matrix2 = new RationalMatrix2x2(new RationalFraction(2, 3), new RationalFraction(4, 5), new RationalFraction(6, 7), new RationalFraction(8, 9));

        // Печатаем матрицы
        System.out.println("Matrix 1:\n" + matrix1);
        System.out.println("Matrix 2:\n" + matrix2);

        // Проверяем метод add
        RationalMatrix2x2 sumMatrix = matrix1.add(matrix2);
        System.out.println("Sum Matrix:\n" + sumMatrix);

        // Проверяем метод mult
        RationalMatrix2x2 multMatrix = matrix1.mult(matrix2);
        System.out.println("Multiplication Matrix:\n" + multMatrix);

        // Проверяем метод det
        RationalFraction detMatrix1 = matrix1.det();
        RationalFraction detMatrix2 = matrix2.det();
        System.out.println("Determinant of Matrix 1: " + detMatrix1);
        System.out.println("Determinant of Matrix 2: " + detMatrix2);

        // Проверяем метод multVector
        RationalVector2D vector = new RationalVector2D(new RationalFraction(2, 3), new RationalFraction(1, 4));
        RationalVector2D multVector = matrix1.multVector(vector);
        System.out.println("Matrix 1 * Vector:\n" + multVector);
    }


}
