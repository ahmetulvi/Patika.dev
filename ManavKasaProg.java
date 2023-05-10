import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args){
      
        Scanner input=new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95, patlıcan=5.00, toplam;

        System.out.println("Armut Kaç Kilo ?");
        armut*=input.nextDouble();

        System.out.println("Elma Kaç Kilo ?");
        elma*=input.nextDouble();

        System.out.println("Domates Kaç Kilo ?");
        domates*=input.nextDouble();

        System.out.println("Muz Kaç Kilo ?");
        muz*=input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ?");
        patlıcan*=input.nextDouble();

        toplam=armut+elma+domates+muz+patlıcan;
        System.out.println("Toplam Tutar:"+toplam);
     

    }
}
