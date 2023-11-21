import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter item type (R - regular, M - medicine, A - alcohol, V - vine) " +
                    "(to exit press enter):");
            String itemType = scan.nextLine();

            if (itemType.isEmpty()) {
                break;
            }

            addItemToShop(shop, itemType);
        }

        shop.printShopItems();
    }

    public static void addItemToShop(Shop shop, String itemType) {
        if (itemType.equalsIgnoreCase("r")) {
            shop.addItem(new RegularItem(askItemName(), askPriceBeforeTax()));

            return;
        }

        if (itemType.equalsIgnoreCase("m")) {
            shop.addItem(new Medicine(askItemName(), askPriceBeforeTax()));

            return;
        }

        if (itemType.equalsIgnoreCase("a")) {
            shop.addItem(new Alcohol(askItemName(), askPriceBeforeTax(), askAlcoholVolume(), askPackageSize()));

            return;
        }

        if (itemType.equalsIgnoreCase("v")) {
            shop.addItem(new Vine(askItemName(), askPriceBeforeTax(), askAlcoholVolume(), askPackageSize()));
        }
    }

    public static String askItemName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item name:");
        return scan.nextLine();
    }

    public static double askPriceBeforeTax() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item price before taxes:");
        return Double.parseDouble(scan.nextLine());
    }

    public static double askAlcoholVolume() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter alcohol volume:");
        return Double.parseDouble(scan.nextLine());
    }

    public static double askPackageSize() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter packageSize:");
        return Double.parseDouble(scan.nextLine());
    }
}
