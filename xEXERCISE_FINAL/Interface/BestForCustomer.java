package xEXERCISE_FINAL.Interface;

public class BestForCustomer implements Discountable {
    private double percentage;
    private double threshlod;
    private double discount;

    public BestForCustomer() {

    }
    public BestForCustomer(double percentage, double threshlod, double discount) {
        this.percentage = percentage;
        this.threshlod = threshlod;
        this.discount = discount;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
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
        double percentageDiscount = price - (price * percentage) / 100;
        double threshlodDiscount;

        if(price >= 10000) {
            threshlod = 10;

            threshlodDiscount = price - discount - (price * threshlod) / 100;
        }
        else {
            threshlod = 0;

            threshlodDiscount = price - discount - (price * threshlod) / 100;
        }

        return Math.max(percentageDiscount, threshlodDiscount);
    }
    
}
