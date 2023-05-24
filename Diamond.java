import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Elmasın Boyutunu Giriniz (Tek Sayı Olmalı): ");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("Lütfen Tek Bir Sayı Giriniz!");
            return;
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
