import java.util.Scanner;

public class loginScreen {

    public static void main(String[] args) {
        String pswrd = "12345", loginName = "admin", charInp;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Kullanıcı adınızı girin  :");
            String kulLoginName = inp.nextLine();
            System.out.print("Kullanıcı şifrenizi girin  :");
            String kulPswrd = inp.nextLine();
            if (kulLoginName.equals(loginName) && kulPswrd.equals(pswrd)) {
                System.out.print("Giriş kabul edildi. Hoş geldiniz.");
            } else {
                System.out.print(
                        "Kullanıcı adı veya şifreniz yanlış. \nŞifrenizi sıfırlamak için E yazın, Çıkmak için H yazınız  :");
                charInp = inp.nextLine();
                if (charInp.equalsIgnoreCase("E")) {
                    System.out.print("Yeni şifrenizi giriniz  :");
                    String newPass = inp.nextLine();
                    if (pswrd.equals(newPass)) {
                        System.out.print("Şifre oluşturulamadı lütfen başka şifre girin.");

                    } else {
                        System.out.print("Şifre oluşturuldu.");
                    }

                } else {
                    System.out.print("Program sonlandırılıyor.");
                }
                System.out.print("Program sonlandırılıyor.");

            }
        }

    }
}