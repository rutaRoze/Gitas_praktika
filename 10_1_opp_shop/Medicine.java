public class Medicine extends RegularItem implements ShopItem {

    public Medicine(String itemName, double priceBeforeTax) {
        super(itemName, priceBeforeTax);
    }

    public String getType() {
        return "Medicine";
    }

    @Override
    public double priceAfterTax() {
        return this.getPriceBeforeTax() + this.taxCount();

    }

    public double taxCount() {
        return this.getPriceBeforeTax() * 9 / 100.0;
    }

}
