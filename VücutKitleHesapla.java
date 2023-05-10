import java.util.Scanner;

public class VucutKitleHesapla {
    public static void main (String[] args){

        double boy, kilo, sonuc;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz:");
        kilo= input.nextInt();
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz");
        boy=input.nextDouble();

        sonuc=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: "+sonuc);
    }
}
