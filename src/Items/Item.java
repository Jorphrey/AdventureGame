package Items;

import java.util.Objects;

public abstract class Item {
    private String name;
    private int quantity;
    private int maxQuantity;

    public Item(String name, int quantity, int maxQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return getQuantity() == item.getQuantity() &&
                maxQuantity == item.maxQuantity &&
                Objects.equals(getName(), item.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", maxQuantity=" + maxQuantity +
                '}';
    }
}
