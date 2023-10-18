import java.util.Scanner;
import java.lang.Math;
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play rock paper scissors!");
        System.out.println("Choose rock(0), paper(1), or scissors(2)");
        int user = scan.nextInt();
        int computer = (int)(Math.random()*3);
        if(user == computer){
            if(computer == 0){
                System.out.println("You chose rock. The computer chose rock.");
            }
            if(computer == 1){
                System.out.println("You chose paper. The computer chose paper.");
            }
            if(computer == 2){
                System.out.println("You chose scissors. The computer chose scissors.");
            }
            System.out.println("It's a draw!");
        }
        else if(user == 0){
            if(computer == 1){
                System.out.println("You played rock. The computer played paper.");
                System.out.println("Paper beats rock. You lose!");
            }
            if(computer == 2){
                System.out.println("You played rock. The computer played scissors.");
                System.out.println("Rock beats scissors. You win!");
            }
        }
        else if(user == 1){
            if(computer == 0){
                System.out.println("You played paper. The computer played rock.");
                System.out.println("Paper beats rock. You win!");
            }
            if(computer == 2){
                System.out.println("You played paper. The computer played scissors.");
                System.out.println("Scissors beats paper. You lose!");
            }
        }
        else if(user == 2){
            if(computer == 0){
                System.out.println("You played scissors. The computer played rock.");
                System.out.println("Rock beats scissors. You lose!");
            }
            if(computer == 1){
                System.out.println("You played scissors. The computer played paper.");
                System.out.println("Scissors beats paper. You win!");
            }
        }

    }
}
