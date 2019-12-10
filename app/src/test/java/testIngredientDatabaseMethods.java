import com.evan.demo.CooKiT.db.ingredientDatabase;
import com.evan.demo.CooKiT.models.IingredientDatabase;
import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class testIngredientDatabaseMethods {
    @Test
    public void check_checkDish() {
        IingredientDatabase ingdata = new ingredientDatabase();
        ingdata.addIngredients("cooking", 1.0, 100.0);
        assertThat(ingdata.checkDish("cooking", 39.0));
    }
}
