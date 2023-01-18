package tn.amine.gildedrosekata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseKataApplicationTests {
    @Test
    void testUpdateQualityOfANormalItem() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(49, gildedRose.items.get(0).getQuality());
    }

    @Test
    void testUpdateQualityOfANormalItemThatExpired() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(48, gildedRose.items.get(1).getQuality());
    }

}
