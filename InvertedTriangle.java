import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write base number:");
        int n=sc.nextInt();

        for (int i=1;i<n;i++){
            for (int j=n+1; j>i+1;j--){
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
