import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager {
    Database database=new Database();
    public void yeniKullaniciEkle(User user1){
        if(user1.getAd().length()==0) {

            System.out.println("Ad boş olamaz");
            return;
        }
        if(user1.getSoyad().equals("")) {
            System.out.println("Soyad boş bırakılamaz");

            return;
        }
        if(user1.getTcKimlikNo().equals("")) {
            System.out.println("Tc kimlik boş bırakılamaz");
            return;
        }
        if(user1.getDogumTarihi().equals("")) {
            System.out.println("Doğum tarihi boş geçilmez");
            return;
        }
        if(user1.getEmail().equals("")) {
            System.out.println("Eposta boş bırakılmaz");
            return;
        }

        if(user1.getSifre().equals("")) {
            System.out.println("Şifre boş geçilmez");
            return;
        }
        if(user1.getSifre2().equals("")) {
            System.out.println("Şifre boş geçilmez");
            return;
        }
        final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user1.getEmail());
        if(!matcher.matches()){
            System.out.println(user1.getEmail()+" EPOSTA FORMATINA UYGUN DEĞİL.");
            return;
        }
        if (user1.getEmail().equals(database.email1)){
            System.out.println("Eposta once kullanmıs.");
            return;
        }
        System.out.println("Kullanıcı kaydeildi");
        add(user1);

    }
    public void giris(User user){
        boolean a=false;
        for(String lang:database.email1){
            if (user.getEmail().equals(lang)){

                for(String lang2:database.sifre1){
                    if (user.getSifre().equals(lang2)){
                        a=true;
                    }
                }
            }
        }
        if (a==true){
            System.out.println("Giriş başarılı");
            anaSayfa();

        }
        else {
            System.out.println("Giriş başarısız");
        }
    }
    public void add(User user){

        database.name.add(user.getAd());
        database.tcKimlikNo1.add(user.getTcKimlikNo());
        database.sifre1.add(user.getSifre());
        database.email1.add(user.getEmail());
        database.soyad1.add(user.getSoyad());
        database.dogumtarihi1.add(user.getDogumTarihi());
        database.telefon1.add(user.getDogumTarihi());

    }
    public void anaSayfa(){

    }
}
