
import java.util.Scanner;


public class Even_odd {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter an integer to check if it is an odd or even");
        Scanner in =new Scanner(System.in);
        x=in.nextInt();
        if (x%2==0){
            System.out.println("you enterd an even number");
        }
        else {
            System.out.println("you enterd an odd number");
        }
    }
   
}
