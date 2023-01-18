package tn.amine.gildedrosekata;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GildedRose {
    public static List<Item> items = new ArrayList<>() {{
       add(new Item("Chocolate", 10, 50));
    }};

    public static void updateQuality() {
        items.forEach(
                item -> {
                    item.setQuality(item.getQuality()-1);
                    item.setSellIn(item.getSellIn()-1);
                }
        );
    }
}
