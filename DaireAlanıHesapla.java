import java.util.Scanner;

public class DaireAlanı {
    public static void main(String[] args){
        int r,a;
        double pi=3.14;
        double sonuc;
        Scanner input=new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz:");
        r=input.nextInt();

        System.out.println("Dairenin merkez açısını giriniz:");
        a=input.nextInt();

        sonuc=(pi*(r*r)*a);
        System.out.println("Sonuç: "+sonuc);



    }
}
