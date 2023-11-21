public class RegularItem implements ShopItem {

    private String itemName;
    private double priceBeforeTax;

    public RegularItem(String itemName, double priceBeforeTax) {
        this.itemName = itemName;
        this.priceBeforeTax = priceBeforeTax;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPriceBeforeTax() {
        return priceBeforeTax;
    }

    public String getType() {
        return "Regular item";
    }

    @Override
    public double priceAfterTax() {
        return this.getPriceBeforeTax() + this.taxCount();
    }

    public double taxCount() {
        return this.getPriceBeforeTax() * 21 / 100.0;

    }

}
