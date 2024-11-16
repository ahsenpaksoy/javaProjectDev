package day10.oop;

import java.time.LocalDate;

public class Apartman {
    /*
    pasif temel özellikleri
     */
    public String mahalle="Java";
    public String sokak="Intellij";
    public String name="B291-295";
    public int kapiNo=291;

    //daire childlari icin tekrar tekrar olusturmamamiz icin gerekli pasif ozellikler
    protected boolean aidatOdendiMi=false;
    protected static final String aidat="Aidat 1650TL olarak ayarlanmıştır.";

    public Apartman() {
        aidatOdemeTarihi=LocalDate.now();
    }

    LocalDate aidatOdemeTarihi;
    /*
    aktif özellikler
     */
    public void temelBilgi(){
        System.out.println("Apartman 4 katlıdır 2 giriş yapısı vardır");
        System.out.println("Apartmanimiz depreme dayanıklı bir şekilde oluşturulmuştur.");
        System.out.println("Bahçesinde şadırvan barindirir ve kücük bir oyun alanı vardır.");
        System.out.println("Apartman 7/24 güvenlik kameralari ile izlenmektedir.");
        System.out.println("16 Araçlık park yeri bulunmaktadır.");
        System.out.println("Merkezi konumdadır ve Metroya 5 dk yürüme mesafesindedir");
        System.out.println("Bina yaşı 3'tür.");
        System.out.println("Bina içerisinde havuz ve spor salonu bulunmaktadır.");
        System.out.println("Bina içerisinde 2 tane kapıcı bulunmaktadır.");
    }
    //daire childlari icin tekrar tekrar olusturmamamiz icin gerekli aktif ozellikler
    public void aidatOde(){
        if (this.aidatOdendiMi){
            System.out.println("Siz zaten aidati önceden ödediniz bir sonraki ay görüşmek üzere....");
        }else {
            System.out.println("Aidati şimdi ödediğiniz için teşekkürler bir sonraki ay görüşmek üzere....");
            this.aidatOdendiMi=true;
            this.aidatOdemeTarihi=LocalDate.now();
            System.out.println(this.aidatOdemeTarihi);

        }

    }
    //kullanıcı aidati 3 ay boyunca odemezse olusacak bir uyari
    public void aidatBilgisi(){
        LocalDate date=LocalDate.now();
        if (date.getDayOfMonth()==15){
            System.out.println("Ayın 15'i olduğu için aidat bilgileriniz 0'landı....");
            this.aidatOdendiMi=false;
        }
        if (date.getMonthValue()-this.aidatOdemeTarihi.getMonthValue() >=3){
            System.err.println("3 ve daha fazla aydır aidat ödemesi yapmıyorsunuz lütfen ödemeleri getiriniz");
        }
        if (this.aidatOdendiMi){
            System.out.println("Aidati ödenmiş daire");
        }else {
            System.out.println("Aidati ödenmemiş daire");
        }



    }
}