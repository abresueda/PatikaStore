package Products;

public class MobilePhone extends Product {
    int camera;
    int battery;
    String color;

    public MobilePhone(int ID, String brandName, double price, Brand brand, int storage, int screenSize, int RAM, double sale, int stock, int camera, int battery, String color) {
        super(ID, brandName, price, brand, storage, screenSize, RAM, sale, stock);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public MobilePhone() {
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
