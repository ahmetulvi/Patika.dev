package Giris;
import java.util.Scanner;

public class KDVHesapla {
    public static void main(String[] args){
        double fiyat ;
        Scanner inp = new Scanner(System.in);
        System.out.println("lütfen fiyat bilgisi giriniz :");
        fiyat = inp.nextDouble();
        double kdv=fiyat*0.18;
        double kdv1=fiyat*0.08;
        System.out.println("kdvsiz tutar : " + fiyat);
        double sonuç =(fiyat>=0 && fiyat<=1000) ?  kdv : kdv1 ;
        double toplam=sonuç+fiyat;


        System.out.println("kdv tutarı : " +sonuç );
        System.out.println("KDV'li Tutar: "+ toplam);
    }
}
