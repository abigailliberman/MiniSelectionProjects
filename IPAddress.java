import java.util.Scanner;
import java.lang.Math;
public class IPAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first octet:");
        int firstOctet = scan.nextInt();
        System.out.println("Please enter the second octet:");
        int secondOctet = scan.nextInt();
        System.out.println("Please enter the third octet");
        int thirdOctet = scan.nextInt();
        System.out.println("Please enter the fourth octet");
        int fourthOctet = scan.nextInt();
        boolean correct1 = (firstOctet >= 0 && firstOctet <= 255);
        boolean correct2 = (secondOctet >= 0 && secondOctet <= 255);
        boolean correct3 = (thirdOctet >= 0 && thirdOctet <= 255);
        boolean correct4 = (fourthOctet >= 0 && fourthOctet <= 255);

        if (firstOctet < 0 || firstOctet > 255) {
            System.out.println("Octet 1 is incorrect");
        }
        if (secondOctet < 0 || secondOctet > 255) {
            System.out.println("Octet 2 is incorrect");
        }
        if (thirdOctet < 0 || thirdOctet > 255) {
            System.out.println("Octet 3 is incorrect");
        }
        if(fourthOctet < 0 || fourthOctet > 255){
            System.out.println("Octet 4 is incorrect");
        }
        if(correct1 == true){
            if(correct2 == true){
                if(correct3 == true){
                    if(correct4 == true){
                        System.out.println("IP Address: " + firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet);
                    }
                }
            }

        }

    }
}