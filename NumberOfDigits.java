import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // 1643 3
        int sayı,kalan=1,sonuc=0;
        System.out.println("Sayıyı Giriniz: ");
        sayı=sc.nextInt();

        while (sayı!=0){
            kalan=sayı%10;
            sayı=sayı/10;
            sonuc=sonuc+kalan;
        }
        System.out.println(sonuc);


    }
}
