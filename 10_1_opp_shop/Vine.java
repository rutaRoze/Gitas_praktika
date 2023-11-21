public class Vine extends Alcohol implements ShopItem {

    public Vine(String itemName, double priceBeforeTax, double alcoholVolume, double packageSize) {
        super(itemName, priceBeforeTax, alcoholVolume, packageSize);
    }

    public String getType() {
        return "Vine";
    }

    @Override
    public double priceAfterTax() {

        return this.getPriceBeforeTax() + taxCount();
    }

    public double taxCount() {
        double pvmTax = this.getPriceBeforeTax() * 21 / 100.0;
        double exciseTax;
        if (this.getAlcoholVolume() < 8.5) {
            exciseTax = this.getPackageSize() * 0.28;
        } else {
            exciseTax = this.getPackageSize() * 0.72;
        }

        return pvmTax + exciseTax;

    }

}
