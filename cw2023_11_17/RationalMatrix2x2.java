public class RationalMatrix2x2 {
    private RationalFraction[][] matrix;

    public RationalMatrix2x2() {
        this(new RationalFraction());
    }

    public RationalMatrix2x2(RationalFraction fraction) {
        this(fraction,fraction,fraction,fraction);
    }

    public RationalMatrix2x2(RationalFraction f1, RationalFraction f2, RationalFraction f3, RationalFraction f4) {
        matrix = new RationalFraction[2][2];
        matrix[0][0] = f1;
        matrix[0][1] = f2;
        matrix[1][0] = f3;
        matrix[1][1] = f4;
    }

    public RationalMatrix2x2 add(RationalMatrix2x2 other) {
        RationalMatrix2x2 newMatrix = new RationalMatrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix.matrix[i][j] = matrix[i][j].add(other.matrix[i][j]);
            }
        }
        return newMatrix;
    }

    public RationalMatrix2x2 mult(RationalMatrix2x2 other) {
        RationalMatrix2x2 newMatrix = new RationalMatrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    newMatrix.matrix[i][j] = newMatrix.matrix[i][j].add(matrix[i][k].mult(other.matrix[k][j]));
                }
            }
        }
        return newMatrix;
    }

    public String toString() {
        String line = "";
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                line += matrix[i][j] + " ";
            }
            line += "\n";
        }
        return line;
    }

    public RationalFraction det() {
        RationalFraction mainDiag = matrix[0][0].mult(matrix[1][1]);
        RationalFraction otherDiag = matrix[0][1].mult(matrix[1][0]);
        return mainDiag.sub(otherDiag);
    }

    public RationalVector2D multVector(RationalVector2D vector) {
        RationalFraction res1 = matrix[0][0].mult(vector.getX()).add(matrix[0][1].mult(vector.getY()));
        RationalFraction res2 = matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY()));
        return new RationalVector2D(res1, res2);

    }
}
