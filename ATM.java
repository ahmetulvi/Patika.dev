import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String username,passwd;
        double balance=1500;
        int right=3,choose,money;
        while (right>0){
            System.out.println("Please enter your Username: ");
            username= sc.nextLine();
            System.out.println("Please enter your password: ");
            passwd=sc.nextLine();

            if (username.equals("patika") && passwd.equals("java101")){
                System.out.println("Welcome to Bank of Kodluyoruz:");
                System.out.println("Which action do you want to perform?\n"+
                        "1-Deposit\n"+
                        "2-Withdraw\n"+
                        "3-Question Balance\n"+
                        "4-Log Out");
                choose=sc.nextInt();

                switch (choose){
                    case 1:
                        System.out.println("Enter amaount you want to deposit: ");
                        money=sc.nextInt();
                        balance+=money;
                        break;
                    case 2:
                        System.out.println("Enter amount you want to withdraw: ");
                        money= sc.nextInt();
                        if (money<balance){
                            balance-=money;
                        }else {
                            System.out.println("The amount you want to withdraw is greater than your balance.");
                        }
                        break;
                    case 3:
                        System.out.println("Your Balance : "+balance);
                        break;
                    case 4:
                        right=0;

                }

            }else{
                right--;
                if (right==0){
                    System.out.println("Your account has been blocked. Please contact your bank!");
                } else{
                    System.out.println("Your username or password is incorrect!");
                    System.out.println("Your remaining right: " + right +"\n");
                }

            }

        }

    }
}
