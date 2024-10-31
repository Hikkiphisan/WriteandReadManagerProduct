import java.io.Serializable;

public class Product implements Serializable {
    private int ID;
    private String name;
    private double price;
    private String nameCompanymade;
    private String describe;

    public Product(int ID, String name, double price, String nameCompanymade, String describe) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.nameCompanymade = nameCompanymade;
        this.describe = describe;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameCompanymade() {
        return nameCompanymade;
    }

    public void setNameCompanymade(String nameCompanymade) {
        this.nameCompanymade = nameCompanymade;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", nameCompanymade='" + nameCompanymade + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
