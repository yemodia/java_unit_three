import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        if (num1 > num2)
            System.out.print(num1 + " is larger than " + num2);


        if (num1 < num2)
            System.out.print(num2 + " is larger than " + num1);


        if (num1 == num2)
            System.out.print(num1 + " and " + num2 + " are equal");
    }
}
