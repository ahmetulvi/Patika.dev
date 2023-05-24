import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // 28 14 7 4 2 1
        int i,n,toplam,carpan=0;
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        n= sc.nextInt();

        for (i=1;i<n;i++){
            if (n%i==0){
                carpan+=i;
            }

        }
        if (carpan==n){
            System.out.println("Girdiğiniz "+n+" sayısı mükemmel sayıdır.");
        }else System.out.println("Girdiğiniz "+n+" sayısı mükemmel sayı değildir.");

    }
}
