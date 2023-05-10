import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        // Not Ortalaması Hesaplayan Program.
        

        Scanner imp= new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        matematik=imp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik=imp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya=imp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih=imp.nextInt();

        System.out.println("Müzik Notunuzu Giriniz:");
        muzik=imp.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce=imp.nextInt();

        double sonuc= (double) (matematik + fizik + kimya + turkce + tarih + muzik) /6;

        System.out.println("Ortalamanız: "+sonuc );

        String sonuc1= (sonuc>=60)? "Başarıyla Sınıfı Geçtiniz":"Maalesef Sınıfta Kaldınız";
        System.out.println(sonuc1);


    }
}
