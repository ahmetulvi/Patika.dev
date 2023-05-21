import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k,average=0,count=0, sum=0;


        System.out.println("Please enter a number :");
        k= sc.nextInt();

        for (int i=0; i<=k; i++){
            if ( i!=0 && i%12==0){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("Average==>"+sum/count);
    }
}
