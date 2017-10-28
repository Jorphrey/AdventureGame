package Items.UniqueItem;

import Items.Item;

public class UniqueItem extends Item {
    private boolean alreadyUsed;

    public UniqueItem(String name, int quantity, int maxQuantity) {
        super(name, quantity, maxQuantity);
        this.alreadyUsed = false;
    }

    @Override
    public void dropItem() {

    }

    @Override
    public void useItem() {

    }

    public void useUniqueItem(){
        this.alreadyUsed = true;
    }
}
