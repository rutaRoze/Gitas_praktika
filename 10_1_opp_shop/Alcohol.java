public class Alcohol extends RegularItem implements ShopItem {
    private double alcoholVolume;
    private double packageSize;

    public Alcohol(String itemName, double priceBeforeTax, double alcoholVolume, double packageSize) {
        super(itemName, priceBeforeTax);
        this.alcoholVolume = alcoholVolume;
        this.packageSize = packageSize;
    }

    public double getAlcoholVolume() {
        return this.alcoholVolume;
    }

    public double getPackageSize() {
        return packageSize;
    }

    public String getType() {
        return "Alcohol";
    }

    @Override
    public double priceAfterTax() {

        return this.getPriceBeforeTax() + this.taxCount();
    }

    public double taxCount() {
        double pvmTax = this.getPriceBeforeTax() * 21 / 100.0;
        double exciseTax;
        if (this.getAlcoholVolume() < 15) {
            exciseTax = this.getPackageSize() * 0.86;
        } else {
            exciseTax = this.getPackageSize() * 1.26;
        }

        return pvmTax + exciseTax;
    }

}
