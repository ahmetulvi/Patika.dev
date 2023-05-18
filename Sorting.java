import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;

        System.out.println("Please enter first number: ");
        a= sc.nextInt();
        System.out.println("Please enter second number: ");
        b=sc.nextInt();
        System.out.println("Please enter third number: ");
        c=sc.nextInt();

        if (a<b && a<c && b<c){
            System.out.println("a<b<c");
        } else if (a<b && a<c && c<b) {
            System.out.println("a<c<b");
            
        } else if (b<a && b<c && a<c ) {
            System.out.println("b<a<c");

        } else if (b<a && b<c && c<a) {
            System.out.println("b<c<a");
        } else if (c<a && c<b && a<b) {
            System.out.println("c<a<b");
        }else if (c<a && c<b && b<a){
            System.out.println("c<b<a");
        }

    }
}
