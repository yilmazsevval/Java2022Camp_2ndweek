public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.substring(0, 2); //substring bir değer döndürüyor. Bir şey oluşturdu ve onu bize değer  olarak veriyor
        String yeniMesaj2 = sehirVer();
        System.out.println(yeniMesaj2);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }

    public static void ekle() { //void operasyonları emir kipi gibi düşün
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2){

        return sayi1 + sayi2; //sayi1+sayi2 toplamını döndür ve bitir
    }

    public static int topla2(int... sayilar){ //... ya variable arguments denir ve buraya gönderdiğimiz sayılar bir int array gibi çalışır. Aslında by sayilar dediğimiz şey bir dizidir
        int toplam = 0;
        for (int sayi:sayilar){ //sayilardaki her bir sayi için demek
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer(){

        return "Ankara";
    }
}