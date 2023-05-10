package Giris;
import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args){
        int a,b;
        double c;

        Scanner input=new Scanner(System.in);
        System.out.println("İlk Değeri Giriniz:");
        a= input.nextInt();

        System.out.println("İkinci Değeri Giriniz:");
        b= input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Sonuç:"+c);

    }
}
