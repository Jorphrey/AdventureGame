package Items;

public abstract class Item {
    private String name;
    private int quantity;
    private int maxQuantity;
    private boolean alreadyUsed;

    public Item(String name, int quantity, int maxQuantity){}

    public void takeItem(Item item) {
        if (this.equals(item)) {
            this.quantity += item.getQuantity();
        }

    }

    public abstract void dropItem();

    public abstract void useItem();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
