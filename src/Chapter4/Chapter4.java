package Chapter4;

import Chapter4.model.Product;

public class Chapter4 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Eggs", 12.000);
        System.out.println(product1.toString());

        Product product2 = new Product(2, "Milk", 13);
        System.out.println(product2.toString());
    }
}

