import java.util.Scanner;
public class suggestEvent {
    public static void main(String[] args){
        int temperature;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter temperature:");
        temperature=sc.nextInt();
        
        if (temperature<5){
            System.out.println("You can ski");
        } else if (temperature>5 && temperature<15 ) {
            System.out.println("You can go to the cinema.");
            
        } else if (temperature>15 && temperature<25) {
            System.out.println("You can go on a picnic");

        }else {
            System.out.println("You can swim");
        }
    }
}
