package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.IngredientStock;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class IIngredientStock_CheckTest {
    @Test
    public void check_checkDish() {
        IIngredientStock ingdata = new IngredientStock();
        ingdata.addIngredients("cooking", 1.0, 100.0);
        assertThat(ingdata.checkDish("cooking", 1.0)).isTrue();
    }
}
