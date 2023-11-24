public class RationalComplexMatrix2x2 {
    RationalComplexNumber[][] matrix;

    public RationalComplexMatrix2x2() {
        this(new RationalComplexNumber());
    }

    public RationalComplexMatrix2x2(RationalComplexNumber num) {
        this(num,num,num,num);
    }

    public RationalComplexMatrix2x2(RationalComplexNumber n1,RationalComplexNumber n2,RationalComplexNumber n3,RationalComplexNumber n4) {
        matrix = new RationalComplexNumber[][]{{n1,n2},{n3,n4}};
    }

    public RationalComplexMatrix2x2 add(RationalComplexMatrix2x2 other) {
        RationalComplexMatrix2x2 newMatrix = new RationalComplexMatrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix.matrix[i][j] = matrix[i][j].add(other.matrix[i][j]);
            }
        }
        return newMatrix;
    }

    public RationalComplexMatrix2x2 mult(RationalComplexMatrix2x2 other) {
        RationalComplexMatrix2x2 newMatrix = new RationalComplexMatrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    newMatrix.matrix[i][j] = newMatrix.matrix[i][j].add(matrix[i][k].mult(other.matrix[k][j]));
                }
            }
        }
        return newMatrix;
    }

    public RationalComplexNumber det() {
        RationalComplexNumber mainDiag = matrix[0][0].mult(matrix[1][1]);
        RationalComplexNumber otherDiag = matrix[0][1].mult(matrix[1][0]);
        return mainDiag.sub(otherDiag);
    }

    public RationalComplexVector2D multVector(RationalComplexVector2D vector) {
        RationalComplexNumber res1 = (matrix[0][0].mult(vector.getX())).add(matrix[0][1].mult(vector.getY()));
        RationalComplexNumber res2 = matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY()));
        return new RationalComplexVector2D(res1, res2);
    }
}
