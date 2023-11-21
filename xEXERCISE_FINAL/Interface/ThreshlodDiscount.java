package xEXERCISE_FINAL.Interface;

public class ThreshlodDiscount implements Discountable {
    private double threshlod;
    private double discount;

    public ThreshlodDiscount() {

    }

    public ThreshlodDiscount(double threshlod, double discount) {
        this.threshlod = threshlod;
        this.discount = discount;
    }

    public double getThreshlod() {
        return threshlod;
    }

    public void setThreshlod(double threshlod) {
        this.threshlod = threshlod;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    

    @Override
    public double discountedPrice(double price) {
        
        return price - discount - (price * threshlod) / 100;
    }
}
