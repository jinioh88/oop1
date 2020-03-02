package ch8;

public class DounutShop extends Shop implements Nameable {
    String companyName;

    String[] menuItems = {
      "Dounuts",
      "Muffins",
      "Danish",
      "Coffee",
      "Tea"
    };

    @Override
    public String[] getInventory() {
        return menuItems;
    }

    @Override
    public void buyInventory(String item) {
        System.out.println("You have just purchase " + item);
    }

    @Override
    public String getName() {
        return companyName;
    }

    @Override
    public void setName(String name) {
        companyName = name;
    }
}
