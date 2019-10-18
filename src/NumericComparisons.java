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

        System.out.println(isZero(3));
        System.out.println(isOdd(5));
        System.out.println(isPositive(4));
        System.out.println(isNegative(-1));
        System.out.println(isNonNegative(-8));
        System.out.println(isNonPositive(5));


    }
}
