package Products;

public class Notebook extends Product {
    public Notebook(int ID, String brandName, double price, Brand brand, int storage, int screenSize, int RAM, double sale, int stock) {
        super(ID, brandName, price, brand, storage, screenSize, RAM, sale, stock);
    }

    @Override
    public String toString() {
        return "Notebook{} " + super.toString();
    }
}
