package br.com.philippesis.horizontalrecycleview;

public class Grocery {

    public String productName;
    public String productDesc;

    public Grocery(String productName, String productDesc) {
        this.productName = productName;
        this.productDesc = productDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}
