public class Matrix2x2 {
    double[][] array = new double[2][2];
    public Matrix2x2() {
        this(0);
    }

    public Matrix2x2(double x) {
        this(x,x,x,x);
    }

    public Matrix2x2(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                array[i][j] = arr[i][j];
            }
        }
    }

    public Matrix2x2(double x1,double x2, double x3, double x4) {
        array[0][0] = x1;
        array[0][1] = x2;
        array[1][0] = x3;
        array[1][1] = x4;
    }


    public Matrix2x2 add(Matrix2x2 matrix) {
        double[][] arr = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                arr[i][j] = array[i][j] + matrix.array[i][j];
            }
        }
        return new Matrix2x2(arr);
    }

    public void add2(Matrix2x2 matrix) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] += matrix.array[i][j];
            }
        }
    }

    public Matrix2x2 sub(Matrix2x2 matrix) {
        double[][] arr = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                arr[i][j] = array[i][j] - matrix.array[i][j];
            }
        }
        return new Matrix2x2(arr);
    }

    public void sub2(Matrix2x2 matrix) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] -= matrix.array[i][j];
            }
        }
    }

    public Matrix2x2 multNumber(double num) {
        double[][] arr = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] *= num;
            }
        }
        return new Matrix2x2(arr);
    }

    public void multNumber2(double number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] *= number;
            }
        }
    }

    public Matrix2x2 mult(Matrix2x2 matrix) {
        double[][] arr = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0].length; k++) {
                    arr[i][j] += array[i][k] * matrix.array[k][j];
                }
            }
        }
        return new Matrix2x2(arr);
    }

    public void mult2(Matrix2x2 matrix) {
        double[][] arr = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0].length; k++) {
                    arr[i][j] += array[i][k] * matrix.array[k][j];
                }
            }
        }
        array = arr;
    }

    public double det() {
        return (array[0][0] * array[1][1] - array[0][1] * array[1][0]);
    }

    public void transpon() {
        double temp;
        temp = array[0][1];
        array[0][1] = array[1][0];
        array[1][0] = temp;
    }

    public Matrix2x2 inverseMatrix() {
        double temp;
        double[][] arr = new double[array.length][array[0].length];
        if (this.det() != 0) {
            arr[0][0] = array[1][1];
            arr[1][1] = array[0][0];
            arr[0][1] = -array[0][1];
            arr[1][0] = -array[1][0];
            return new Matrix2x2(arr);
        } else {
            return null;
        }
    }

    public Matrix2x2 equivalentDiagonal() {
        double div;
        double[][] arr = new double[array.length][array[0].length];
        Matrix2x2 matrix = new Matrix2x2();
        div = -1 * array[1][0] / array[0][0];
            for (int i = 0; i < array[0].length; i++) {
                arr[1][i] = array[1][i] + array[0][i] * div;
            }
        div = -1 * array[0][1] / array[1][1];
        for (int i = 0; i < array[0].length; i++) {
            arr[0][i] = array[0][i] + array[1][i] * div;
        }
        return new Matrix2x2(arr);
    }

    public Vector2D multVector(Vector2D vector) {
        Vector2D vector1 = new Vector2D(array[0]);
        Vector2D vector2 = new Vector2D(array[1]);
        vector1.setX(vector1.scalarProduct(vector));
        vector1.setY(vector2.scalarProduct(vector));
        return vector1;
    }
}

