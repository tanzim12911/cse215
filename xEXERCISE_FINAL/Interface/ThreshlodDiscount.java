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
        
        if(price >= 10000) {
            threshlod = 10;

            return price - discount - (price * threshlod) / 100;
        }
        else {
            threshlod = 0;

            return price - discount - (price * threshlod) / 100;
        }
    }
}
