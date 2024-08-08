package Products;

public abstract class Product {
    private int ID;
    private String brandName;
    private double price;
    private Brand brand;
    private int storage;
    private int screenSize;
    private int RAM;
    private double sale;
    private int stock;

    public Product(int ID, String brandName, double price, Brand brand, int storage, int screenSize, int RAM, double sale, int stock) {
        this.ID = ID;
        this.brandName = brandName;
        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.RAM = RAM;
        this.sale = sale;
        this.stock = stock;
    }

    public Product() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("| %2d | %-20s | %-8f USD | %-8s | %-2d GB | %-2d inches | %-2d GB |",
                ID, brandName, price, brand.getName(), storage, screenSize, RAM);
    }
}
