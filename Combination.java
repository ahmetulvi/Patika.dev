import java.util.Scanner;
public class Combination {
    public static void main(String[] args){
        int n,r,a,i,nf=1,rf=1,af=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements is in the set?");
        n= sc.nextInt();

        System.out.println("How many different groups should be formed?");
        r= sc.nextInt();

       for (i=n;i>0;i--){
           nf=nf*i;
       }
       for (i=r;i>0;i--){
           rf=rf*i;
       }
       a=n-r;
       for (i=a;i>0;i--){
           af=af*i;
       }
       c=nf/(rf*(af));
        System.out.println(c);
    }
}
