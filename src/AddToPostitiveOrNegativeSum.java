import java.util.Scanner;

public class AddToPostitiveOrNegativeSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int positiveSum = 0;
        int negativeSum=  0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            if (num >= 0)
                positiveSum += num;
            if (num < 0)
                negativeSum += num;
        }
        System.out.println("The sum of the positive numbers is: " + positiveSum);
        System.out.println("The sum of the negative numbers is: " + negativeSum);

    }
}
