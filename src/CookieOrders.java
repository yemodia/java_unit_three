
import java.util.Scanner;

public class CookieOrders {

    private static String totalCost(int orderNum){
        double boxPrice;
        if (orderNum>= 1 && orderNum <= 4){
            boxPrice = 6.95;
            return  "You bought " + orderNum +" box of cookies at $" + boxPrice +" per box. Your total bill is $ "+orderNum*boxPrice;
        }
        else if (orderNum >= 5 && orderNum <= 9){
            boxPrice = 5.95;
            return  "You bought " + orderNum +" box of cookies at $" + boxPrice +" per box. Your total bill is $ "+orderNum*boxPrice;
        }
        else if (orderNum >= 10 && orderNum <= 15){
            boxPrice = 5.50;
            return  "You bought " + orderNum +" box of cookies at $" + boxPrice +" per box. Your total bill is $ "+orderNum*boxPrice;
        }
        else if (orderNum > 16){
            boxPrice = 4.95;
            return  "You bought " + orderNum +" box of cookies at $" + boxPrice +" per box. Your total bill is $ "+orderNum*boxPrice;
        }
        else
            return "Your input is invalid";

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

            System.out.println("1-4 boxes:				6.95 per box");
            System.out.println("5-9 boxes:\t\t\t\t5.95 per box\n");
            System.out.println("10-15 boxes:\t\t\t\t5.50 per box");
            System.out.println("16 or more boxes:\t\t\t4.95 per box");

            System.out.print("Enter the amount of boxes you wish to purchase: ");
            int orderNum = scan.nextInt();

            System.out.println(totalCost(orderNum));


    }
}
