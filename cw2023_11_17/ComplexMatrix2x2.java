public class ComplexMatrix2x2 {
    private ComplexNumber[][] matrix;

    public ComplexMatrix2x2() {
        this(new ComplexNumber());
    }

    public ComplexMatrix2x2(ComplexNumber num) {
        this(num,num,num,num);
    }

    public ComplexMatrix2x2(ComplexNumber num1,ComplexNumber num2,ComplexNumber num3,ComplexNumber num4) {
        matrix = new ComplexNumber[2][2];
        matrix[0][0] = num1;
        matrix[0][1] = num2;
        matrix[1][0] = num3;
        matrix[1][1] = num4;
    }

    public ComplexMatrix2x2 add(ComplexMatrix2x2 other) {
        ComplexMatrix2x2 newMatrix = new ComplexMatrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix.matrix[i][j] = matrix[i][j].add(other.matrix[i][j]);
            }
        }
        return newMatrix;
    }

    public ComplexMatrix2x2 mult(ComplexMatrix2x2 other) {
        ComplexMatrix2x2 newMatrix = new ComplexMatrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    newMatrix.matrix[i][j] = newMatrix.matrix[i][j].add(matrix[i][k].mult(other.matrix[k][j]));
                }
            }
        }
        return newMatrix;
    }

    public ComplexNumber det() {
        ComplexNumber mainDiag = matrix[0][0].mult(matrix[1][1]);
        ComplexNumber otherDiag = matrix[0][1].mult(matrix[1][0]);
        return mainDiag.sub(otherDiag);
    }

    public ComplexVector2D multVector(ComplexVector2D vector) {
         ComplexNumber res1 = (matrix[0][0].mult(vector.getX())).add(matrix[0][1].mult(vector.getY()));
         ComplexNumber res2 = matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY()));
         return new ComplexVector2D(res1, res2);
    }

}
