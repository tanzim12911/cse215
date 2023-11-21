package xEXERCISE_FINAL.Interface;

public class TestClass {
    public static void main(String[] args) {
        PercentageDiscount pd = new PercentageDiscount(10);
        System.out.println("Percentage Discount: " + pd.discountedPrice(12500));

        ThreshlodDiscount td = new ThreshlodDiscount(10, 500);
        System.out.println("Threshlod Discount: " + td.discountedPrice(12500));

        BestForCustomer bfc = new BestForCustomer(10, 10, 500);
        System.out.println("BEst Price for Customer: " + bfc.getDiscount());
    }
}
