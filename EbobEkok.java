import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n1,n2,i=1,ebob=1,ekok=1;
        System.out.println("Lütfen Küçük Olan Sayıyı Giriniz: ");
        n1= sc.nextInt();
        System.out.println("Lütfen Büyük Olan İkinci Sayıyı Giriniz: ");
        n2=sc.nextInt();
        
        while (i<n1){
            i++;
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }

        }System.out.println("Seçtiğiniz Sayıların EBOB'u "+ebob);
        ekok=(n1*n2)/ebob;
        System.out.println("Seçtiğiniz Sayıların EKOK'u "+ ekok);


    }
}
