package tn.amine.gildedrosekata;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class GildedRose {
    public List<Item> items = new ArrayList<>() {{
       add(new Item("Chocolate", 10, 50));
       add(new Item("Coffee", 0, 50));
    }};

    public void updateQuality() {
        items.forEach(
                item -> {
                    if(item.getSellIn()==0)
                    {
                        item.setQuality(item.getQuality()-2);
                    }
                    else {
                        item.setQuality(item.getQuality()-1);
                        item.setSellIn(item.getSellIn()-1);
                    }
                }
        );
    }
}
