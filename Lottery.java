import java.util.Scanner;
import java.lang.Math;
public class Lottery {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two digit number:");
        int user = scan.nextInt();
        int comp = (int) (Math.random()*90)+10;

        int user1 = user/10;
        int user2 = user%10;
        int comp1 = comp/10;
        int comp2 = comp%10;

        System.out.println("The lotto number is: " + comp);

        if(user == comp){
            System.out.println("YOU GOT IT!!!");
            System.out.println("You win the jackpot of $10.000");
        }
        else if((user1 == comp1)||(user2 == comp2)){
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        }
        else if ((user1 == comp2)||(user2 == comp1)){
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        }
        else if((user1 + user2)==(comp1 + comp2)){
            System.out.println("You got both digits correct.");
            System.out.println("You win $2,000.");
        }
        else {
            System.out.println("You did not win anything.");
        }



    }
}
