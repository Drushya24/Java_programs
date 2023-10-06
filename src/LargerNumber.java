import javax.swing.*;
import java.util.Scanner;
public class LargerNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c) {
            System.out.println("a is greater" + a);
        }
         else if (b>=a && b>=c)
        {
            System.out.println("a is greater" + b);
        }
        else{
            System.out.println("a is greater" + c);
        }
    }
}
