public class ShareDigit {
    private static Boolean sharedigit(int num1, int num2){
        int leftNum1 = num1 / 10;
        int rightNum1 = num1 % 10;

        int leftNum2 = num2 / 10;
        int rightNum2 = num2 % 10;

        if (leftNum1 == leftNum2)
            return true;
        else if (leftNum1 == rightNum2)
            return true;
        else if (rightNum1 == leftNum2)
            return true;
        else if (rightNum1 == rightNum2)
                return true;
        else
            return false;

    }

    public static void main(String[] args){
        System.out.println(sharedigit(50,54));
        System.out.println(sharedigit(50,64));


    }
}
