import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Size of the array ?");
        n= sc.nextInt();

        int[] list=new int[n];


        System.out.println("Enter the array elements:");
        for (int i=0;i<n;i++){
            list[i]=sc.nextInt();
            System.out.println("Enter the next array elements:");
        }
        int min=list[0];
        int max=list[0];


        for (int j:list) {
            if (j<min){
                min=j;
            }
            if (j>max){
                max=j;
            }
        }
        Arrays.sort(list);
        int minClosed=list[1];
        int maxClosed=list[n-1];


        System.out.println(max);
        System.out.println(min);
        System.out.println(maxClosed);
        System.out.println(minClosed);


    }
}
