package tn.amine.gildedrosekata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tn.amine.gildedrosekata.GildedRose.items;
import static tn.amine.gildedrosekata.GildedRose.updateQuality;

class GildedRoseKataApplicationTests {
    @Test
    void testUpdateQualityOfANormalItem() {
        updateQuality();
        assertEquals(items.get(0).getQuality(), 49);
    }

}
