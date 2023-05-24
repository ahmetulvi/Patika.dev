import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1,number,max=0,min=0;
        System.out.println("Kaç Sayı Gireceksiniz? ");
        int n= sc.nextInt();

        for (i=1;i<=n;i++){
            System.out.println(i+".sayıyı girin");
            number=sc.nextInt();
            
            if(number>max){
                max=number;
            }
            if (number<min || min==0) {
                min=number;
            }
        }
        System.out.println("En Büyük Sayı: "+max);
        System.out.println("En Küçük Sayı: "+min);
    }
}
