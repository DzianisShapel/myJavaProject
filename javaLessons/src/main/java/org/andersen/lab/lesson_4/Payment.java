package org.andersen.lab.lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private String name;

    List<Product> productList = new ArrayList<>();

    private int paymentAmount;

    public Payment() {};

    public Payment(String name)
    {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(String name, int cost) {
        productList.add(new Product(name, cost));
    }

    public void showProducts() {
        for (Product product: productList) {
            System.out.println("Product: " + product.getProductName() + " added.");
        }
    }

    public int getPaymentAmount() {
        int cost = 0;
        for (Product product: productList) {
            cost += product.getProductCost();
        }
        return cost;
    }




    private class Product {
        private String productName;
        int productCost;


        public Product() {
        }

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public int getProductCost() {
            return this.productCost;
        }
    }

}
