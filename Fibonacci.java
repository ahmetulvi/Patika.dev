public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,sum = 0;
        System.out.println("Please Write a Number: ");
        n=sc.nextInt();

        int s1=0;
        int s2=1;
        for(int i=0;i<=n;i++){
            System.out.print(s1 + " ");
            sum = s1+s2;
            s1=s2;
            s2=sum;
        }
    }
}
