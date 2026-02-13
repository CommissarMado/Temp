package frontline.combat.fcp.init;

import com.atsuishio.superbwarfare.block.ContainerBlock;
import com.atsuishio.superbwarfare.item.common.container.ContainerBlockItem;
import frontline.combat.fcp.FCP;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FCP.MODID);

    public static final RegistryObject<CreativeModeTab> TERRORIST_VEHICLE_TAB = TABS.register("terrorist_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.TERRORIST_TAB_ICON.get()))
            .title(Component.translatable("terroristtab.fc_terrorist_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ContainerBlockItem.createInstance(ModEntities.TOYOTA_HILUX.get()));
                output.accept(ContainerBlockItem.createInstance(ModEntities.TOYOTA_HILUX_ROCKET_POD.get()));
                output.accept(ContainerBlockItem.createInstance(ModEntities.TOYOTA_HILUX_BMP.get()));
                output.accept(ContainerBlockItem.createInstance(ModEntities.TOYOTA_HILUX_SPG9.get()));
            }).build());

    public static final RegistryObject<CreativeModeTab> RUSSIAN_VEHICLE_TAB = TABS.register("russian_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.RUSSIAN_TAB_ICON.get()))
            .title(Component.translatable("russiantab.fc_russian_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ContainerBlockItem.createInstance(ModEntities.UAZ.get()));
                output.accept(ContainerBlockItem.createInstance(ModEntities.UAZ_DSHKA.get()));
            }).build());

    public static final RegistryObject<CreativeModeTab> AMERICAN_VEHICLE_TAB = TABS.register("american_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.AMERICAN_TAB_ICON.get()))
            .title(Component.translatable("americantab.fc_american_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ContainerBlockItem.createInstance(ModEntities.STRYKER_DRAGOON.get()));
                output.accept(ContainerBlockItem.createInstance(ModEntities.LITTLEBIRD.get()));
            }).build());

    @Mod.EventBusSubscriber(modid = FCP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration {
        @SubscribeEvent
        public static void register(BuildCreativeModeTabContentsEvent event) {
        }
    }
}
