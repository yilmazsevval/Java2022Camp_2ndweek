public class Main { //classların temel özelliği gruplama yapmaktır.
    public static void main(String[] args) {
        //classlar referance type tir
        CustomerManager customerManager = new CustomerManager(); //bellekte customermanager türünde bir nesne üretiyoruz
        CustomerManager customerManager2 = new CustomerManager(); //new lemek bellekte çok yer kaplar.
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayi1 = 10;
        int sayi2= 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //refarance
        int [] sayilar1 = new int []{1,2,3};
        int [] sayilar2 = new int[] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]); //refarance type old. için değişti

    }
}

