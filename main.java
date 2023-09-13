import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mesafe, yas, yolcuTipi;
        double perMesafe = 0.10, indirimsiz, yasIndirim50, yasIndirim10, yasIndirim30, indirimli50, indirimli10, indirimli30, gidisDonus50, gidisDonus30, gidisDonus10, sonTutar50, sonTutar10, sonTutar30, sontutarIndirimsiz;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen KM cinsinden mesafe bilgisi giriniz: ");
        mesafe = input.nextInt();


        System.out.print("Lütfen yaş bilgisi giriniz: ");
        yas = input.nextInt();

        System.out.print("Lütfen yolculuk tipini giriniz(1 - Tek Yön / 2 - Gidiş Dönüş): ");
        yolcuTipi = input.nextInt();

        if (yolcuTipi > 2 || yolcuTipi <= 0){
            System.out.println("Hatalı Veri Girdiniz !");
        }

        indirimsiz = mesafe * perMesafe;

        yasIndirim50 = indirimsiz * 0.5;
        yasIndirim10 = indirimsiz * 0.1;
        yasIndirim30 = indirimsiz * 0.3;

        indirimli50 = indirimsiz - yasIndirim50;
        indirimli10 = indirimsiz - yasIndirim10;
        indirimli30 = indirimsiz - yasIndirim30;

        gidisDonus50 = indirimli50 * 0.20;
        gidisDonus10 = indirimli10 * 0.20;
        gidisDonus30 = indirimli30 * 0.20;

        sonTutar50 = (indirimli50 - gidisDonus50)*2;
        sonTutar10 = (indirimli10 - gidisDonus10)*2;
        sonTutar30 = (indirimli30 - gidisDonus30)*2;
        sontutarIndirimsiz = indirimsiz * 2;


        if (yas < 12){
            System.out.println("Tek yön toplam tutar: " + indirimli50);
        } else if (yas <= 24) {
            System.out.println("Tek yön toplam tutar: " + indirimli10);
        } else if (yas < 65) {
            System.out.println("Tek yön toplam tutar: " + indirimsiz);
        } else if (yas >= 65) {
            System.out.println("Tek yön toplam tutar: " + indirimli30);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        if (yas < 12 && yolcuTipi == 2){
            System.out.println("Gidiş dönüş indirimli toplam tutar: " + sonTutar50 + "TL");
        } else if (yas <= 24 && yolcuTipi == 2) {
            System.out.println("Gidiş dönüş indirimli toplam tutar: " + sonTutar10 + "TL");
        } else if (yas < 65 && yolcuTipi == 2) {
            System.out.println("Gidiş dönüş indirimli toplam tutar: " + sontutarIndirimsiz + "TL");
        } else if (yas >= 65 && yolcuTipi == 2) {
            System.out.println("Gidiş dönüş indirimli toplam tutar: " + sonTutar30 + "TL");
        }
    }
}