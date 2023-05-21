import java.util.Scanner;

public class PowersOfFiveAndFour {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,k,i;

        System.out.println("Please enter a number: ");
        n=sc.nextInt();
        System.out.println("The Powers of Four: ");

        for (i=1; i<=n; i*=4){
            System.out.println(i);

        }
        System.out.println("The Powers of Five");
        for (k=1; k<=n; k*=5){
            System.out.println(k);
        }
    }

}
