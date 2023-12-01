import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Check {
    public static String str(char s) {
        return s + "";
    }

    public static boolean isNegativeInArray(int[] array) {
        boolean f = true;
        for (int i = 0; i < array.length && f; i++) {
            if (array[i] < 0) {
                f = false;
            }
        }
        return f;
    }


    public static boolean equal(String s, String reg) {
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static boolean isAllAreGlas(String s) {
        boolean f = true;
        for (int i = 0; i < s.length() && f; i++) {
            if (equal(str(s.charAt(i)), "[A-Za-z]")) {
                if (!(equal(str(s.charAt(i)), "[AEYUIOaeyuio]"))) {
                    f = false;
                }
            }
        }
        return true;
    }

    public static boolean isTwoNegativeInArray(int[] array) {
        int count = 0;
        boolean f = false;
        for (int i = 0; i < array.length && !f; i++) {
            if (array[i] < 0) {
                count++;
                if (count >= 2) {
                    f = true;
                }
            }
        }
        return f;
    }

    public static boolean isThreeGlasInString(String s) {
        int c = 0;
        boolean f = false;
        for (int i = 0; i < s.length() && !f; i++) {
            if (equal(s.charAt(i) + "", "[aeyuioAEYUIO]")) {
                c++;
                if (c > 3) {
                    f = true;
                }
            }
        }
        return c == 3;
    }

    public static boolean isHasChet(int num) {
        int c;
        boolean f;
        while (num > 0) {
            c = num % 2;
            if (c == 0) {
                return true;    
            }
            num /= 10;
        }
        return false;
    }

    public static boolean isAllChet(int num) {
        int c;
        boolean f;
        while (num > 0) {
            c = num % 2;
            if (c == 1) {
                return false;    
            }
            num /= 10;
        }
        return true;
    }

    public static boolean isAllPostitiveHasChet(int[] array) {
        int num;
        boolean f = true;
        for (int i = 0; i < array.length && f; i++) {
            num = array[i];
            if (num > 0 && !isHasChet(num)) {
                f = false;
            }
        }
        return f;
    }

    public static boolean isStringMod3(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int c = 0;
            boolean f = true;
            for (int j = 0; j < array[i].length && f; j++) {
                if (array[i][j] % 3 == 0) {
                    c++;
                } else {
                    f = false;
                }
            }
            if (c == array[i].length) {
                return true;
            }
        }
        return false;
    }

    public static boolean isColsHasFirstGlas(String[][] arr) {
        char sym;
        int c = 0;

        for (int i = 0; i < arr[0].length; i++) {
            boolean f = true;
            for (int j = 0; j < arr.length && f; j++) {
                if (equal(arr[j][i].charAt(0) + "", "[AEYUIOaeyuio]")) {
                    f = false;
                    c++;
                }
            }
            if (f) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumMod2InArray(int[][] array) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            boolean f = true;
            for (int j = 0; j < array[0].length && f; j++) {
                if (isAllChet(array[i][j])) {
                    f = false;
                }                
            }
            if (f) {
                return false;
            }
        }
        return true;
    }
}