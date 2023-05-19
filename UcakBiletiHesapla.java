import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args){
        double yas,km, toplam;
        int secim;
        Scanner sc=new Scanner(System.in);

        System.out.println("Tek Yön için 1: Gidiş-Dönüş için 2'yi seçiniz: ");
        secim= sc.nextInt();

        System.out.println("Mesafe Kaç KM?");
        km=sc.nextDouble();

        System.out.println("Yaşınızı Giriniz: ");
        yas=sc.nextDouble();

        if (yas>0 && km>0 && (secim==1 || secim==2)){
            toplam=km*0.10;
            if (yas<12){
                toplam*=0.5;
            } else if (yas>12 && yas<24) {
                toplam*=0.9;
            } else if (yas>65) {
                toplam*=7;
            }
            if (secim==2){
                toplam*=0.8;
                toplam*=2;
            }
            System.out.println("Toplam Tutar: "+toplam);
        }else {
            System.out.println("Hatalı Giriş Yaptınız:");
        }


    }
}
