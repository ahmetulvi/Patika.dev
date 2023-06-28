import java.util.Scanner;

public class recursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find pattern: ");
        int number=input.nextInt();
        PatternCreator(number,number,-1);
    }
    static void PatternCreator(int constNumber,int variableNum,int sign){
        if (variableNum>constNumber)
            return;
        if (variableNum<1)
            sign*=-1;
        System.out.print(" "+variableNum+ " ");
        PatternCreator(constNumber,variableNum + sign*5,sign);
    }
}
