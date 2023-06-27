public class palindromNumber {

    static boolean isPalindrom (int number){
        int temp=number, reverseNumber=0, lastNumber;
        while(temp!=0){
            lastNumber=temp % 10; //divide to find last number
            reverseNumber=(reverseNumber * 10)+lastNumber; // after finding the last number, sort the numbers from bottom to top
            temp/=10; // get rid of the last number
        }
        if (reverseNumber==number)
            return true;
        else return false;

    }
    public static  void main(String[] args){
        System.out.println(isPalindrom(2467));

    }
}
