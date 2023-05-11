import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String username,password,choose,newPassword;

        System.out.println("Lütfen Kullanıcı Adınızı Giriniz:");
        username=sc.nextLine();

        System.out.println("Lütfen Şifrenizi Giriniz: ");
        password=sc.nextLine();

        if (username.equals("patika")&& password.equals("java123")){
            System.out.println("Kullanıcı adı ve şifre doğru. Giriş Yapılıyor...");
        }else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? [Y/N]:");
            choose=sc.nextLine();
            switch (choose){
                case "Y":
                    System.out.println("Yeni Şifrenizi Giriniz:");
                    newPassword=sc.nextLine();
                    if (newPassword.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                    }else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                case "N":
                    System.out.println("Tekrardan Giriş Yapılıyor.");
            }

        }

    }
}
