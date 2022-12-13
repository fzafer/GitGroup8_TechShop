public class techEquipments {

    private String brand;
    private String model;
    private String color;
    private double price;
    private int expirationYear;

    private boolean isSecondHand = false;

    public techEquipments(String brand, String model, String color, double price, int expirationYear, boolean isSecondHand) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.expirationYear = expirationYear;
        this.isSecondHand = isSecondHand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public boolean isSecondHand() {
        return isSecondHand;
    }

    public void setSecondHand(boolean secondHand) {
        isSecondHand = secondHand;
    }


    @Override
    public String toString() {
        return "techEquipments{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", expirationYear=" + expirationYear +
                ", isSecondHand=" + isSecondHand +
                '}';
    }
}

