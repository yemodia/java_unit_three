/*
Yerim Dia
AP Computer Science
November 11, 2019

This program is a rock,paper, scissors simulation versus the computer.
The user is prompted to enter a either rock, paper or scissors.
Then the computer chooses a random number that holds either string.
The user's answer and computer's pick are compared, and the winner is printed to the user.
*/


import java.util.Scanner;

public class RockPaperScissors {
    private static String getUserChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose either: rock, paper, or scissors");
        String userChoice = scan.nextLine();
        return userChoice.toLowerCase();
        // This method gets the choice of the user by prompting it to enter rock, paper or scissors, and converts it to lowercase.
    }

    private static String getComputerChoice(){
        int computerPick = (int)(Math.random()* 3 + 1);
        if (computerPick == 1)
            return "rock";
        else if (computerPick == 2)
            return "paper";
        else
            return "scissors";
        // This method gets the choice of the computer by making it choose a number from 1-3.
    }
    private static String whoWins (String computerPick, String userPick){
        if (computerPick.equals(userPick))
            return "You picked " + userPick + ". \nThe computer picked " + computerPick + ". \nYou tied!";
        else if (userPick.equals("paper") && computerPick.equals("rock"))
            return "You picked " + userPick + ". \nThe computer picked " + computerPick + ". \nYou win!! ";
        else if (userPick.equals("rock") && computerPick.equals("paper"))
            return "You picked " + userPick + ". \nThe computer picked " + computerPick + ". \nThe computer wins.";
        else if (userPick.equals("scissors") && computerPick.equals("rock"))
            return "You picked " + userPick + ". \nThe computer picked " + computerPick + ". \nThe computer wins.";
        else if (userPick.equals("rock") && computerPick.equals("scissors"))
            return "You picked " + userPick + ". \nThe computer picked " + computerPick + ". \nYou win!!";
        else if (userPick.equals("paper") && computerPick.equals("scissors"))
            return "You picked " + userPick + ". \nThe computer picked " + computerPick + ". \nThe computer wins.";
        else
            return "You picked " + userPick + ". \nThe computer picked " + computerPick + ". \nYou win!!";
        //This method compares the user's pic and computer's pick and returns the winning player.

    }

    public static void main(String[] args){
        String computerPick = getComputerChoice();
        String userPick = getUserChoice();

        System.out.println(whoWins(computerPick, userPick));
    }
}
