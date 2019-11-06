public class TrickyDice {
    private static int regularRoll(){
        int randomNum = (int)(Math.random() * 6 ) + 1;
        return randomNum;
    }
    private static int trickyRoll(){
        int randomNum2 = (int)(Math.random() * 100);
        if (randomNum2 < 10)
            return 1;
        else if(randomNum2 > 10 && randomNum2 < 29)
            return 2;
        else if(randomNum2 >= 30 && randomNum2 < 39)
            return 3;
        else if (randomNum2 >= 40 && randomNum2 < 49)
            return 4;

        else if (randomNum2 >= 50 && randomNum2 < 59)
            return 5;
        else
            return 6;

    }
    public static void main(String[] args){
        System.out.println(regularRoll());
        System.out.println(trickyRoll());
    }
}
