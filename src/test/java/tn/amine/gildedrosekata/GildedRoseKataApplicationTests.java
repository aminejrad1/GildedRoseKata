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

    @Test
    void testUpdateQualityOfAgedBrie() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(31, gildedRose.items.get(2).getQuality());
    }

    @Test
    void testMakeSureQualityIsNeverBelowZero() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.items.get(3).getQuality());
    }

    @Test
    void testMakeSureQualityIsNeverAbove50() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.items.get(4).getQuality());
    }

}
