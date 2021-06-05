package model.shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private Item getItemById(int id) {
        for (Item item : items) {
            if (item.getCourse().getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void addItem(Item i) {
        if (getItemById(i.getCourse().getId()) != null) {
        } else {
            items.add(i);
        }
    }

    public void removeItem(int id) {
        if (getItemById(id) != null) {
            items.remove(getItemById(id));
        }
    }

    public float getTotalMoney() {
        float money = 0;
        money = items.stream().map((item) -> item.getCourse().getFee()).reduce(money, (accumulator, _item) -> accumulator + _item);
        return money;
    }
}
