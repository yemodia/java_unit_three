public class NumericComparisons {
    private static boolean isOdd(int num1) {
        return num1 % 2 != 0;
    }

    private static boolean isZero(int num1){
        return num1 == 0;
    }

    private static boolean isPositive(int num1){
        return num1 > 0;
    }

    private static boolean isNegative(int num1){
        return num1 < 0;
    }

    private static boolean isNonPositive(int num1){
        return num1 >= 0;
    }

    private static boolean isNonNegative(int num1){
        return num1 <= 0;
    }
    public static void main(String[] args){

        isZero(3);
        isOdd(5);
        isPositive(4);
        isNegative(-1);
        isNonNegative(-8);
        isNonPositive(5);
        

    }
}
