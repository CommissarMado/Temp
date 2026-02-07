package frontline.combat.fcp.init;

import frontline.combat.fcp.FCP;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> REGISTRY =
            DeferredRegister.create(ForgeRegistries.ITEMS, FCP.MODID);

    public static final RegistryObject<Item> TERRORIST_TAB_ICON = REGISTRY.register("terrorist_tab_icon", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPRAY = REGISTRY.register("spray",
            () -> new frontline.combat.fcp.item.varies.SprayItem());
}
