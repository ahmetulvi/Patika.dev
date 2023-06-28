import java.util.Scanner;

public class recursivePrimeNumber {
    public static void main(String[] args){
        int n=17;
        if (isPrime(n,2))
            System.out.println("It's prime");
        else System.out.println("It's not a prime");
    }

    static boolean isPrime(int n, int i){
        if (n<=2)
            return (n==2) ? true: false;
        if (n%i ==0)
            return false;
        if (i * i>n)
            return true;
        // Chech for next divisor
        return isPrime(n,i+1);
    }
}
