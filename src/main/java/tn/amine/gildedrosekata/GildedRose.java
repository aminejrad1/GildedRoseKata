package tn.amine.gildedrosekata;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class GildedRose {
    public List<Item> items = new ArrayList<>() {{
       add(new Item("Chocolate", 10, 50));
       add(new Item("Coffee", 0, 50));
       add(new Item("Aged Brie", 10, 30));
       add(new Item("Old Smelly Boot", 10, 0));
       add(new Item("Aged Brie", 10, 50));
       add(new Item("Sulfuras", 10, 80));
    }};

    public void updateParamsMethod(Item item, int quality, int sellIn) {
        item.setSellIn(item.getSellIn()-sellIn);
        if(item.getQuality()!=0)
        {
            if(item.getName().equals("Sulfuras"))
                return;
            if(item.getName().equals("Aged Brie"))
            {
                if(item.getQuality()<50)
                    item.setQuality(item.getQuality()+quality);
            }
            else {
                item.setQuality(item.getQuality()-quality);
            }
        }
    }

    public void updateQuality() {
        items.forEach(
                item -> {
                    if(item.getSellIn()==0)
                        updateParamsMethod(item, 2, 0);
                    else
                        updateParamsMethod(item, 1, 1);
                }
        );
    }
}
