import java.util.Scanner;
// Üçgenin alanı olarak düzeltiyorum bu programı.

public class HipotenusBulma {
    public static void main(String[] args){
        int a,b,c;
        double u, alan;


        Scanner input=new Scanner(System.in);
        System.out.println("İlk Değeri Giriniz:");
        a= input.nextInt();

        System.out.println("İkinci Değeri Giriniz:");
        b= input.nextInt();
        System.out.println("Üçüncü Değeri Giriniz:");
        c= input.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Alan:"+ alan);

        

    }
}
