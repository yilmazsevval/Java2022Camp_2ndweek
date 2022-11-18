public class Product { //bir class bir özellik barındırır

    public Product(int id, String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price =price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product (){

    }

    //attribute veya field denir
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public int getId() { //private old. için get ile okuturuz
        return id;
    }

    public void setId(int id) { //get onun değerini kur demek bbu yüzden void
        this.id = id; //this ile yukarıdaki classın thisinden bahsediyor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() { //kodu yazılabilir(kullanıcının yazmasını) istemediğimiz için setini sildik.
        return this.name.substring(0,1) + id;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
