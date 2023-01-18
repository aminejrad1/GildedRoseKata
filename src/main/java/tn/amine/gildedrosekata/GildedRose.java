package tn.amine.gildedrosekata;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class GildedRose {
    public List<Item> items = new ArrayList<>() {{
       add(new Item("Chocolate", 10, 50));
       add(new Item("Coffee", 0, 50));
       add(new Item("Aged Brie", 15, 30));
       add(new Item("Old Smelly Boot", 10, 0));
       add(new Item("Aged Brie", 10, 50));
       add(new Item("Sulfuras", 10, 80));
       add(new Item("Aged Brie", 10, 30));
       add(new Item("Aged Brie", 5, 30));
       add(new ConjuredItem("Conjured item", 10, 22));
    }};

    public void updateParamsMethod(Item item, int quality, int sellIn) {
        item.setSellIn(item.getSellIn()-sellIn);
        if(item.getQuality()!=0)
        {
            if(item.getClass().equals(ConjuredItem.class)) {
                item.setQuality(item.getQuality() - 2);
                return;
            }
            else
            if(item.getName().equals("Sulfuras"))
                return;
            if(item.getName().equals("Aged Brie"))
            {
                if(item.getQuality()<50)
                {
                    if(item.getSellIn()<=10 && item.getSellIn()>5)
                        item.setQuality(item.getQuality()+2);
                    else if(item.getSellIn()<=5)
                        item.setQuality(item.getQuality()+3);
                    else
                        item.setQuality(item.getQuality()+1);
                }
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
