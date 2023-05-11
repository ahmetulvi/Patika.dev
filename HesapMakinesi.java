import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int secim, top=1,cıkarma=2,bol=3,carp=4;
        int sayı1,sayı2;

        System.out.println("Lütfen İlk Sayıyı Giriniz: ");
        sayı1= sc.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        sayı2= sc.nextInt();

        System.out.println("Hangi işlemi Yapmak İstiyorsunuz?\n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.println("Seçiminiz: ");
        secim= sc.nextInt();
        switch (secim){
            case 1:
                System.out.println("Toplam: "+ (sayı1+sayı2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (sayı1-sayı2));
                break;
            case 3:
                System.out.println("Bölme: "+(sayı1/sayı2));
                break;
            case 4:
                System.out.println("Çarpma: "+(sayı1*sayı2));
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız");

        }
   }
}      
