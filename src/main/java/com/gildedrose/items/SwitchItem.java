package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends Item{
    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int factor;
        if (this.sellIn >= 0) {
            factor = 1;
            this.quality = Math.min(this.quality + factor, 50);
        }
        else{
            factor = 1;
            this.quality = Math.max(this.quality - factor, 0);
        }


    }
}
