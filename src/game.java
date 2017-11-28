/****************************************************************************************************************************************

 Made by:- Iliyas Attarwala
 Rock paper Scissor game and fun through java coding
 jdk:-1.8.1
 Date:-31/10/2017
 Time:-8:55 am


 *****************************************************************************************************************************************/

import java.util.Scanner;         //for taking input from user

public class game                  // game class because of a game of rock paper and scissor
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!,Let's play a game of rock paper scissor");       //greeting the players
        System.out.println("Player 1 Name: ");                     //asking player one name
        String name1 = input.next();
        System.out.println("Player 2 Name: ");                     //asking player two name
        String name2 = input.next();
        System.out.println("Welcome!, " + name1 + " and " + name2);      //welcoming them with their names
        System.out.println(name1 + ",what do you want to choose: ");            //asking them to choose between rock paper and scissor
        String PlayerOne = input.next();
        System.out.println(name2 + ",what do you want to choose: ");             //asking them to choose between rock paper and scissor
        String PlayerTwo = input.next();
        //Logical if statements to decide who is the winner
        if ((PlayerOne.equals("rock") && PlayerTwo.equals("scissor")) || (PlayerOne.equals("scissor") && PlayerTwo.equals("paper")) || (PlayerOne.equals("paper") && PlayerTwo.equals("rock"))) {
            if (PlayerOne.equals("rock") && PlayerTwo.equals("scissor")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("scissor") && PlayerTwo.equals("paper")) {
                System.out.println("Scissor beats Paper");
            }
            if (PlayerOne.equals("paper") && PlayerTwo.equals("rock")) {
                System.out.println("Paper beats Rock");
            }
            System.out.println(name1 + " Wins!");
        }
        if ((PlayerOne.equals("Rock") && PlayerTwo.equals("Scissor")) || (PlayerOne.equals("Scissor") && PlayerTwo.equals("Paper")) || (PlayerOne.equals("Paper") && PlayerTwo.equals("Rock"))) {
            if (PlayerOne.equals("Rock") && PlayerTwo.equals("Scissor")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("Scissor") && PlayerTwo.equals("Paper")) {
                System.out.println("Scissor beats Paper");
            }
            if (PlayerOne.equals("Paper") && PlayerTwo.equals("rock")) {
                System.out.println("Paper beats Rock");
            }
            System.out.println(name1 + " Wins!");
        }
        if ((PlayerOne.equals("Rock") && PlayerTwo.equals("scissor")) || (PlayerOne.equals("Scissor") && PlayerTwo.equals("paper")) || (PlayerOne.equals("Paper") && PlayerTwo.equals("rock"))) {
            if (PlayerOne.equals("Rock") && PlayerTwo.equals("scissor")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("Scissor") && PlayerTwo.equals("paper")) {
                System.out.println("Scissor beats Paper");
            }
            if (PlayerOne.equals("Paper") && PlayerTwo.equals("rock")) {
                System.out.println("Paper beats Rock");
            }
            System.out.println(name1 + " Wins!");
        }
        if ((PlayerOne.equals("rock") && PlayerTwo.equals("Scissor")) || (PlayerOne.equals("scissor") && PlayerTwo.equals("Paper")) || (PlayerOne.equals("paper") && PlayerTwo.equals("Rock"))) {
            if (PlayerOne.equals("rock") && PlayerTwo.equals("Scissor")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("scissor") && PlayerTwo.equals("Paper")) {
                System.out.println("Scissor beats Paper");
            }
            if (PlayerOne.equals("paper") && PlayerTwo.equals("Rock")) {
                System.out.println("Paper beats Rock");
            }
            System.out.println(name1 + " Wins!");
        }
        if ((PlayerOne.equals("rock") && PlayerTwo.equals("paper")) || (PlayerOne.equals("scissor") && PlayerTwo.equals("rock")) || (PlayerOne.equals("paper") && PlayerTwo.equals("scissor"))) {
            if (PlayerOne.equals("rock") && PlayerTwo.equals("paper")) {
                System.out.println("Paper beats Rock");
            }
            if (PlayerOne.equals("scissor") && PlayerTwo.equals("rock")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("paper") && PlayerTwo.equals("scissor")) {
                System.out.println("Scissor beats Paper");
            }
            System.out.println(name2 + " Wins!");
        }
        if ((PlayerOne.equals("Rock") && PlayerTwo.equals("Paper")) || (PlayerOne.equals("Scissor") && PlayerTwo.equals("Rock")) || (PlayerOne.equals("Paper") && PlayerTwo.equals("Scissor"))) {
            if (PlayerOne.equals("Rock") && PlayerTwo.equals("Paper")) {
                System.out.println("Paper beats Rock");
            }
            if (PlayerOne.equals("Scissor") && PlayerTwo.equals("Rock")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("Paper") && PlayerTwo.equals("Scissor")) {
                System.out.println("Scissor beats Paper");
            }
            System.out.println(name2 + " Wins!");
        }
        if ((PlayerOne.equals("Rock") && PlayerTwo.equals("paper")) || (PlayerOne.equals("Scissor") && PlayerTwo.equals("rock")) || (PlayerOne.equals("Paper") && PlayerTwo.equals("scissor"))) {
            if (PlayerOne.equals("Rock") && PlayerTwo.equals("paper")) {
                System.out.println("Paper beats Rock");
            }
            if (PlayerOne.equals("Scissor") && PlayerTwo.equals("rock")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("Paper") && PlayerTwo.equals("scissor")) {
                System.out.println("Scissor beats Paper");
            }
            System.out.println(name2 + " Wins!");
        }
        if ((PlayerOne.equals("rock") && PlayerTwo.equals("Paper")) || (PlayerOne.equals("scissor") && PlayerTwo.equals("Rock")) || (PlayerOne.equals("paper") && PlayerTwo.equals("Scissor"))) {
            if (PlayerOne.equals("rock") && PlayerTwo.equals("Paper")) {
                System.out.println("Paper beats Rock");
            }
            if (PlayerOne.equals("scissor") && PlayerTwo.equals("Rock")) {
                System.out.println("Rock beats Scissor");
            }
            if (PlayerOne.equals("paper") && PlayerTwo.equals("Scissor")) {
                System.out.println("Scissor beats Paper");
            }
            System.out.println(name2 + " Wins!");
        }
        if ((PlayerOne.equals("rock") && PlayerTwo.equals("rock")) || (PlayerOne.equals("scissor") && PlayerTwo.equals("scissor")) || (PlayerOne.equals("paper") && PlayerTwo.equals("paper"))) {
            System.out.println("Tie!");
        }
        if ((PlayerOne.equals("Rock") && PlayerTwo.equals("Rock")) || (PlayerOne.equals("Scissor") && PlayerTwo.equals("Scissor")) || (PlayerOne.equals("Paper") && PlayerTwo.equals("Paper"))) {
            System.out.println("Tie!");
        }
        if ((PlayerOne.equals("Rock") && PlayerTwo.equals("rock")) || (PlayerOne.equals("Scissor") && PlayerTwo.equals("scissor")) || (PlayerOne.equals("Paper") && PlayerTwo.equals("paper"))) {
            System.out.println("Tie!");
        }
        if ((PlayerOne.equals("rock") && PlayerTwo.equals("Rock")) || (PlayerOne.equals("scissor") && PlayerTwo.equals("Scissor")) || (PlayerOne.equals("paper") && PlayerTwo.equals("Paper"))) {
            System.out.println("Tie!");
        }
        if(PlayerOne.equalsIgnoreCase("end") && PlayerTwo.equalsIgnoreCase("end"))
        {
            System.exit(0);
        }
    }
}

