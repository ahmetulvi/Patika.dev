import java.util.Scanner;
public class CalculateUntilAnOdd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k,sum=0;

        do {
            System.out.println("Please enter number:");
            k=sc.nextInt();
            if (k%4==0){
                sum+=k;
            }
            System.out.println("Sum ---> " +sum);
        }while (k%2==0);

    }
}
