package Products;

public class Brand implements Comparable<Brand> {

    private int ID;
    private String name;

    public Brand(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ID + ". " + name;
    }

    @Override
    public int compareTo(Brand other) {
        return Integer.compare(this.ID, other.ID);
    }
}
