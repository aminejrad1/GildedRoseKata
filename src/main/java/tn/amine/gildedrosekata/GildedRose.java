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
    }};

    public void updateParamsMethod(Item item, int quality, int sellIn) {
        item.setSellIn(item.getSellIn()-sellIn);

        if(item.getName().equals("Aged Brie"))
        {
            item.setQuality(item.getQuality()+quality);
        }
        else {
            item.setQuality(item.getQuality()-quality);
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
