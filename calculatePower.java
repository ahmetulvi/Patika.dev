import java.util.Scanner;

public class calculatePower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println( pow(5,3));
    }
    static int pow(int a, int b){
        int result=1;
        if (b==0){
            return result;
        }
        result*=a*pow(a,--b);//This works like a for loop. Since we call --b, it calls itself until it becomes 0.
        return result;
    }
}
