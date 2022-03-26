import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user=new User();
        Scanner scanner=new Scanner(System.in);
        UserManager userManager=new UserManager();
          boolean kontrol=true;
        while(kontrol){
            System.out.println("Yapmak istedğiniz işlemi seçin:");
            System.out.println("1 kayıt olma");
            System.out.println("2 Kullanıcı girişi:");
            System.out.println("3 Çıkış yapılıyor:");
            String secim=scanner.nextLine();

            if (secim.equals("1")){
                System.out.println("adınızı girin");
                String ad=scanner.nextLine();
                System.out.println("soyad girin");
                String soyad=scanner.nextLine();
                System.out.println("Tc kimlik girin");
                String tc=scanner.nextLine();
                System.out.println("Doğum tarihi girin");
                String dogum=scanner.nextLine();
                System.out.println("email girin");
                String email=scanner.nextLine();
                System.out.println("telefon girin");
                String telefon=scanner.nextLine();
                System.out.println("Şifre girin");
                String sifre=scanner.nextLine();
                System.out.println("Şifre tekrar girin");
                String sifre2=scanner.nextLine();
                user.setAd(ad);
                user.setSoyad(soyad);
                user.setTcKimlikNo(tc);
                user.setDogumTarihi(dogum);
                user.setEmail(email);
                user.setTelefon(telefon);
                user.setSifre(sifre);
                user.setSifre2(sifre2);
                userManager.yeniKullaniciEkle(user);
            }
            if (secim.equals("2")){
                System.out.println("email girin");
                String email=scanner.nextLine();

                System.out.println("Şifre girin");
                String sifre=scanner.nextLine();
                user.setEmail(email);
                user.setSifre(sifre);

                userManager.giris(user);

            }
            if (secim.equals("3")){
                System.out.println("Çıkış yapıldı....");
                kontrol=false;
            }
        }








    }

}
