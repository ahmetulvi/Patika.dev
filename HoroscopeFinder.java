import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int select;
      
        System.out.print("1 : 21 March - 20 April\n");
        System.out.print("2 : 21 April - 21 May\n");
        System.out.print("3 : 22 May - 22 June\n");
        System.out.print("4 : 23 June - 22 July\n");
        System.out.print("5 : 23 July - 22 August\n");
        System.out.print("6 : 23 August - 22 September\n");
        System.out.print("7 : 23 September - 22 October\n");
        System.out.print("8 : 23 October - 22 November\n");
        System.out.print("9 : 23 November - 21 December\n");
        System.out.print("10 : 22 December - 21 January\n");
        System.out.print("11 : 22 January - 19 February\n");
        System.out.print("12 : 20 February - 20 March\n");
        System.out.print("Please select the day you were born:");
        select=sc.nextInt();

        if (select==1){
            System.out.println("Aries");
        } else if (select==2) {
            System.out.println("Taurus");

        } else if (select==3) {
            System.out.println("Gemini");

        } else if (select==4) {
            System.out.println("Cancer");

        } else if (select==5) {
            System.out.println("Leo");

        } else if (select==6){
            System.out.print("Virgo");
        } else if (select==7){
            System.out.print("Libra");
        } else if (select==8){
            System.out.print("Scorpio");
        } else if (select==9){
            System.out.print("Sagittarius");
        } else if (select==10){
            System.out.print("Capricorn");
        } else if (select==11){
            System.out.print("Aquarius");
        } else if (select==12){
            System.out.print("Pisces");

        }
    }   }
