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

    @Test
    void testQualitySulfuras() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(80, gildedRose.items.get(5).getQuality());
    }

    @Test
    void testUpdateQualityAgedBrie10daysOrLess() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(32, gildedRose.items.get(6).getQuality());
    }

    @Test
    void testUpdateQualityAgedBrie5daysOrLess() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
        assertEquals(33, gildedRose.items.get(7).getQuality());
    }

}
