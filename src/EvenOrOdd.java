import java.util.Scanner;
    public class EvenOrOdd {
        public static void main(String[] args)
        {
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num%2==0)
            {
                System.out.println(" The given number is even " + num);
            }
            else
            {
                System.out.println("The given number is odd" + num);
            }
        }

    }

