import java.util.Scanner;

public class advancedCalculator {
    static void sum(){
        int result=0,j,n;
        Scanner count=new Scanner(System.in);
        Scanner r=new Scanner(System.in);
        System.out.println("How many numbers do you want to sum? ");
        j = count.nextInt();
        for (int i=0;i<j;i++){
            System.out.println("Please enter the number "+(i+1) );
            n = r.nextInt();
            result+=n;
        }
        System.out.println("Result ==> "+result);

    }
    static void minus(){
        int result=0,j,n;
        Scanner count=new Scanner(System.in);
        Scanner r=new Scanner(System.in);
        System.out.println("How many numbers will you enter to subtract?");
        j=count.nextInt();
        for (int i=0;i<j;i++){
            System.out.println("Please enter the number "+(i+1) );
            n=r.nextInt();
            result-=n;
        }
        System.out.println("Result ==> "+result);
    }
    static void divide(){
        float a,b,result;
        Scanner ad = new Scanner(System.in);
        Scanner bd = new Scanner(System.in);
        System.out.print("Enter the number to divide: ");
        a = ad.nextFloat();
        System.out.print("Enter the divider: ");
        b = bd.nextFloat();
        result = a/b;
        System.out.println("Result ==> "+result);
    }
    static void multiply(){
        int res=1,j,n;
        Scanner count=new Scanner(System.in);
        Scanner r=new Scanner(System.in);
        System.out.println("How many numbers will you enter to multiply?");
        j=count.nextInt();
        for (int i=0;i<j;i++){
            System.out.println("Please enter the number "+(i+1) );
            n=r.nextInt();
            res*=n;
        }
        System.out.println("Result ==> "+res);
    }
    static void power(){
        int a,b,res=1;
        Scanner p = new Scanner(System.in);
        Scanner p1 = new Scanner(System.in);
        System.out.print("Enter the number you want to exponentiate with:");
        a = p.nextInt();
        System.out.print("Enter exponent: ");
        b = p1.nextInt();
        for(int i=0;i<b;i++){
            res*=a;
        }
        System.out.print("Result ==> "+ res);
    }
    static void factorial(){
        int result=1,a;
        Scanner number=new Scanner(System.in);
        System.out.println("Which number's factorial do you want to get: ");
        a=number.nextInt();
        for (int i=a;i>=1;i--){
            result*=i;
        }
        System.out.print("Result ==> "+result);
    }
    static void mod(){
        int result,n1,n2;
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        System.out.println("Enter the number you want to get the mod of:");
        n1=a.nextInt();
        System.out.println("By what number do you want to get the mod:");
        n2=b.nextInt();
        result=n1 % n2;
        System.out.print("Result ==> "+result);

    }
    static void rectangle(){
        int shrt,lng,area,perimeter;
        Scanner n1=new Scanner(System.in);
        Scanner n2=new Scanner(System.in);
        System.out.println("Enter long edge:");
        lng= n1.nextInt();
        System.out.println("Enter short edge:");
        shrt=n2.nextInt();
        area= lng*shrt;
        perimeter=2*(lng+shrt);
        System.out.println("Area  ==> "+area);
        System.out.println("Perimeter ==> "+perimeter);

    }


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int select;
        do {
            String menu="\n1- Sum\n"+
                    "2- Minus\n"+
                    "3- Divide\n"+
                    "4- Multiply\n"+
                    "5- Power\n"+
                    "6- Factorial\n"+
                    "7- Mode Operation\n"+
                    "8- Calculate Rectangle\n"+
                    "0- Exit";
            System.out.println(menu);
            System.out.println("Please Select your process: ");
            select=input.nextInt();

            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    divide();
                    break;
                case 4:
                    multiply();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered wrong selection!");


            }

        }while (select!=0);

    }
}
