package homework06;

public class Product {
    private String nameProduct;
    private double price;

   /* public Product(String nameProduct, double price) {
        this.setNameProduct(nameProduct);
        this.setPrice(price);
    }

    public String getNameProduct() {
        return nameProduct;
    }

   /* public void setNameProduct(String nameProduct) {
        if (nameProduct == null || nameProduct.isEmpty()){
            throw new RuntimeException("Название продукта не может быть пустой строкой, оно должно быть");
        } else if (Pattern.matches("\\d+", nameProduct)){
            throw new RuntimeException("Недопустимое имя продукта" + nameProduct);
        } else if (nameProduct.length() <= 2){
            throw new RuntimeException("Недопустимое имя продукта");
        } else {
            this.nameProduct = nameProduct;
        }
    }*/



    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
