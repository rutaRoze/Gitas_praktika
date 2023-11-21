import java.util.ArrayList;

public class Shop {

    ArrayList<ShopItem> items;

    public Shop() {
        this.items = new ArrayList<>();
    }

    public void addItem(ShopItem item) {
        items.add(item);
    }

    public void printShopItems() {

        String itemDetails = "";
        for (ShopItem item : items) {
            itemDetails += String.format("""
                            Item type: %s\s
                            Item name: %s\s
                            Price in Euros: %.2f\s
                            Price in Swiss francs: %.2f\s

                            """,
                    item.getType(), item.getItemName(), item.priceAfterTax(), item.priceAfterTax() / 0.96589345);
        }

            System.out.println(itemDetails);
    }
}
