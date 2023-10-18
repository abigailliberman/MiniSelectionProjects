import java.util.Scanner;
public class GradeOutput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your numerical grade");
        int grade = scan.nextInt();
        if(98 <= grade && 100 >= grade){
            System.out.println("A+");
        }
        else if(93 <= grade && 97 >= grade){
            System.out.println("A");
        }
        else if(90 <= grade && 92 >= grade){
            System.out.println("A-");
        }
        else if(88 <= grade && 89 >= grade){
            System.out.println("B+");
        }
        else if(83 <= grade && 87 >= grade){
            System.out.println("B");
        }
        else if(80 <= grade && 82 >= grade){
            System.out.println("B-");
        }
        else if(78 <= grade && 79 >= grade){
            System.out.println("C+");
        }
        else if(73 <= grade && 77 >= grade){
            System.out.println("C");
        }
        else if(70 <= grade && 72 >= grade){
            System.out.println("C-");
        }
        else if(68 <= grade && 69 >= grade){
            System.out.println("D+");
        }
        else if(63 <= grade && 67 >= grade){
            System.out.println("D");
        }
        else if(60 <= grade && 62 >= grade){
            System.out.println("D-");
        }
        else{
            System.out.println("F");
        }
    }
}
