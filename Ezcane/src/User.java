import java.util.Date;
import java.util.List;

public class User {
    private String id;
    private String ad;
    private String soyad;
    private String tcKimlikNo;
    private String dogumTarihi;
    private String email;
    private String telefon;
    private String sifre;
    private String sifre2;
    private List<String> hastaliklar;
    private List<String> alerji;
    public User(){

    }
    public User(String id, String ad, String soyad, String tcKimlikNo, String dogumTarihi, String email, String telefon, String sifre, String sifre2) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlikNo = tcKimlikNo;
        this.dogumTarihi = dogumTarihi;
        this.email = email;
        this.telefon = telefon;
        this.sifre = sifre;
        this.sifre2 = sifre2;
    }

    public User(List<String> hastaliklar, List<String> alerji) {
        this.hastaliklar = hastaliklar;
        this.alerji = alerji;
    }

    public String getId() {
        return id;
    }

    public String setId(int id) {

        return this.getAd().substring(0,2)+this.tcKimlikNo.substring(0,5);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSifre2() {
        return sifre2;
    }

    public void setSifre2(String sifre2) {
        this.sifre2 = sifre2;
    }
}
