package Inventory;

import Items.Item;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Inventory {
    private Map<Item, Integer> mInventory;

    public Inventory(){
        mInventory = new HashMap();
    }

    public void removeInventory(Item item) {
        if (mInventory.containsKey(item)) {
            for(Item i : mInventory.keySet()){
            }
        }
    }

    public void addToInventory(Item item) {

    }

    public Item getInventoryItem(String name){

        return null;
    }


}
