/*import java.util.Scanner;


public class RightTriangle {
    private static Boolean isTriangle(int a, int b, int c) {
        return ((a + b > c) && (a + c > b) && (b + c > a));
    }

    private static Boolean isRight(int a, int b, int c){

        double pythagorean = Math.pow(a, 2) + Math.pow(b, 2);


        if (pythagorean == Math.pow(c, 2))
            return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer sides of a triangle");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (isRight(a,b,c) && isTriangle(a,b,c))
            System.out.print("The side lengths of " + a + ", " + b +", " + "and " + c + " form a right triangle");
        else if (isTriangle(a,b,c) && !isRight(a,b,c))
            System.out.print("The side lengths of " + a + ", " + b +", " + "and " + c + " form a triangle, but it is not a right triangle");
        else
            System.out.print("The side lengths of " + a + ", " + b +", " + "and " + c + " do not form a triangle");

    }
}


*/