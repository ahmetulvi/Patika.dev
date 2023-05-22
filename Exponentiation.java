import java.util.Scanner;
public class Exponentiation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,i,sum=1;

        System.out.println("Üssü alınacak sayıyı giriniz: ");
        a=sc.nextInt();
        System.out.println("Ne kadar üssünü almak istiyorsunuz: ");
        b= sc.nextInt();

        for (i=b;i>0;i--){
            sum*=a;
        }
        System.out.println(sum);

    }
}
