import java.util.Scanner;
public class AvarageGradeCalculation {
    public static void main(String[] args){
        int math,turk,physic,chem,music;
        double avg;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please write your grade.\n " +
                "Do not forget if you don't write a grade between 0 and 100, your grade will not be calculated.");

        System.out.println("Enter your Math grade:");
        math= sc.nextInt();
        if (math<0 || math>100){
            math=0;
        }
        System.out.println("Enter your Physics grade:");
        physic=sc.nextInt();
        if (physic<0 || physic>100){
            physic=0;
        }
        System.out.println("Enter your Turkish grade:");
        turk=sc.nextInt();
        if (turk<0 || turk>100){
            turk=0;
        }
        System.out.println("Enter your Chemistry grade:");
        chem=sc.nextInt();
        if (chem<0 || chem>100){
            chem=0;
        }
        System.out.println("Enter your Music grade:");
        music=sc.nextInt();
        if (music<0 || music>100){
            music=0;
        }
        
        avg=(double)(math+physic+turk+chem+music)/5;

        if (avg>=55){
            System.out.println("Congratulations! You passed the class.");
        }else {
            System.out.println("Unfortunately, you failed the class.");
        }
        System.out.println("Your avarage grade:" +avg);

    }
}
