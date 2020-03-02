package ch8;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = null;

        String className = args[0];

        try {
            shop = (Shop) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assert shop != null;
        String[] inventory = shop.getInventory();

        for (String s : inventory) {
            System.out.println(s);
        }

        shop.buyInventory(inventory[1]);
    }
}
