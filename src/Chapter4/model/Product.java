package Chapter4.model;

public class Product {
    private int code;
    private String description;
    private double price;

    public Product(int code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    @Override
    public String toString() {
        String result = "Code: " + code + ", Description: " + description + ", price: " + price;
        return result;
    }
}
