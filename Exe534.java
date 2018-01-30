import java.util.Random;
import java.util.Scanner;

public class Exe534{

    
    private static int WinningScorePlayer = 0;
    private static int WinningScoreComputer = 0;


    public static void main(String[] args) {
        int rock = 0, paper = 1, scissors = 2;
        do {
            System.out.println("Rock(0) , Paper(1) or Scissors(2)?.. PLayer One :");
            Scanner k1 = new Scanner(System.in);
            int playerOne = k1.nextInt();

            System.out.println("Rock , Paper or Scissors?.. PLayer Computer");

            //Draws
            if ((playerOne == rock) && (playerComputer() == rock)) {
               
                System.out.println("draw");
            } else if ((playerOne == paper) && playerComputer() == paper) {
                
                System.out.println("draw");
            } else if ((playerOne == scissors) && playerComputer() == scissors) {
                
                System.out.println("draw");

                //rock Wining - loosing
            } else if ((playerOne == rock) && playerComputer() == scissors) {
                WinningScorePlayer++;
               
                System.out.println("Rock wins!");
            } else if ((playerOne == rock) && playerComputer() == paper) {
                WinningScoreComputer++;
               
                System.out.println("Rock Looses!!");


                //paper wining - loosing
            } else if ((playerOne == paper) && playerComputer() == rock){
                WinningScorePlayer++;
                
                System.out.println("Paper wins!");
            } else if ((playerOne == paper) && playerComputer() == scissors) {
                WinningScoreComputer++;
                
                System.out.println("Paper looses!");


                //scissors wining - loosing
            } else if ((playerOne == scissors) && playerComputer() == paper){
                WinningScorePlayer++;
                
                System.out.println("Scissors wins!");
            } else if ((playerOne == scissors) && playerComputer() == rock) {
                WinningScoreComputer++;
                
                System.out.println("Scissors looses!");

            }


        } while (Score());

    }

    private static boolean Score() {

        if (WinningScoreComputer == 2) {
            System.out.println("Computer wins!");
            System.exit(0);
        } else if (WinningScorePlayer == 2) {
            System.out.println("PLayer one wins!");
            System.exit(0);
        }
        return true;
    }

    private static double playerComputer(){
        double pickNUmber = Math.random();

        if(pickNUmber <0.34 ){
            pickNUmber = 0;
        }else if(pickNUmber <=0.67 ){
            pickNUmber = 1;
        }else {
            pickNUmber = 2;
        }


        return pickNUmber;
    }
}


