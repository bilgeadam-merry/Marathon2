package com.meryem;

import com.meryem.entity.Cevap;
import com.meryem.entity.Soru;
import com.meryem.entity.Tahmin;
import com.meryem.entity.Yarismaci;
import com.meryem.entity.enumm.Cinsiyet;
import com.meryem.repository.CevapRepository;
import com.meryem.repository.SoruRepository;
import com.meryem.repository.TahminRepository;
import com.meryem.repository.YarismaciRepository;

public class Runner {
    public static void main(String[] args) {
        CevapRepository cevapRepository = new CevapRepository();
        Cevap cevap1 = Cevap.builder()
                .ad("Zeki")
                .soyad("Müren")
                .imgUrl("https://tr.wikipedia.org/wiki/Zeki_M%C3%BCren#/media/Dosya:Zeki_M%C3%BCren.jpg")
                .build();

        Cevap cevap2 = Cevap.builder()
                .ad("Oğuzhan")
                .soyad("Uğur")
                .imgUrl("https://paradiseproduction.com.tr/wp-content/uploads/2021/08/Oguzhan-Ugur.png")
                .build();

        Cevap cevap3 = Cevap.builder()
                .ad("Kemal")
                .soyad("Kılıçdaroğlu")
                .imgUrl("https://www.rudaw.net/s3/rudaw.net/ContentFiles/737345Image1.jpg?version=5321320")
                .build();
        Cevap cevap4 = Cevap.builder()
                .ad("İrem")
                .soyad("Derici")
                .imgUrl("https://www.hurriyet.com.tr/galeri-irem-derici-kimdir-ve-kac-yasinda-iste-irem-dericinin-hayati-sarkilari-ve-biyografisi-ile-ilgili-bilgiler-41790963")
                .build();
        Cevap cevap5 = Cevap.builder()
                .ad("Murat")
                .soyad("Boz")
                .imgUrl("https://image.cnnturk.com/i/cnnturk/75/0x555/64a27664a46860171c47ca1c.jpg")
                .build();

        YarismaciRepository yarismaciRepository = new YarismaciRepository();
        Yarismaci yarismaci1 = Yarismaci.builder()
                .ad("Meryem")
                .soyad("Macaroğlu")
                .yas(26)
                .cinsiyet(Cinsiyet.KADIN)
                .toplamPuan(50)
                .telefon("0555 555 55 55")
                .email("mrym@gmail.com")
                .kullanilanSure(60)
                .build();
        Yarismaci yarismaci2 = Yarismaci.builder()
                .ad("Elanur")
                .soyad("Hopan")
                .yas(35)
                .cinsiyet(Cinsiyet.KADIN)
                .toplamPuan(75)
                .telefon("0555 555 55 55")
                .email("elanur@gmail.com")
                .kullanilanSure(38)
                .build();
        Yarismaci yarismaci3 = Yarismaci.builder()
                .ad("Bülent")
                .soyad("Akgül")
                .yas(29)
                .cinsiyet(Cinsiyet.ERKEK)
                .toplamPuan(40)
                .telefon("0555 555 55 55")
                .email("bülent@gmail.com")
                .kullanilanSure(42)
                .build();
        Yarismaci yarismaci4 = Yarismaci.builder()
                .ad("Ahmet")
                .soyad("Furkan")
                .yas(36)
                .cinsiyet(Cinsiyet.ERKEK)
                .toplamPuan(58)
                .telefon("0555 555 55 55")
                .email("ahmtfr@gmail.com")
                .kullanilanSure(62)
                .build();
        Yarismaci yarismaci5 = Yarismaci.builder()
                .ad("Leyla")
                .soyad("Güzel")
                .yas(27)
                .cinsiyet(Cinsiyet.KADIN)
                .toplamPuan(66)
                .telefon("0555 555 55 55")
                .email("bülent@gmail.com")
                .kullanilanSure(32)
                .build();
        SoruRepository soruRepository = new SoruRepository();
        Soru soru1 = Soru.builder()
                .cinsiyet(Cinsiyet.KADIN)
                .yas(35)
                .meslek("şarkıcı")
                .ektraIpucu("sarışın")
                .puan(10)
                .build();
        TahminRepository tahminRepository = new TahminRepository();
        Tahmin tahmin = Tahmin.builder()
                .yarismaci(yarismaci1)
                .soru(soru1)
                .build();


    }
}
