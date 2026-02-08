package frontline.combat.fcp.init;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DELICIOUS_SNACK = new FoodProperties.Builder().alwaysEat().nutrition(5)
            .saturationMod(0.6f).build();
}
