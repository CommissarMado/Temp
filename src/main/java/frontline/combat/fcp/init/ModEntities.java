package frontline.combat.fcp.init;

import frontline.combat.fcp.FCP;
import frontline.combat.fcp.entity.vehicle.ToyotaHiluxEntity;
import frontline.combat.fcp.entity.vehicle.ToyotaHiluxRocketPodEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FCP.MODID);

    public static final RegistryObject<EntityType<ToyotaHiluxEntity>> TOYOTA_HILUX = register("toyota_hilux",
            EntityType.Builder.of(ToyotaHiluxEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));

    public static final RegistryObject<EntityType<ToyotaHiluxRocketPodEntity>> TOYOTA_HILUX_ROCKET_POD = register("toyota_hilux_rocket_pod",
            EntityType.Builder.of(ToyotaHiluxRocketPodEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));
    private static <T extends Entity> RegistryObject<EntityType<T>> register(String name, EntityType.Builder<T> entityTypeBuilder) {
        return ENTITY_TYPES.register(name, () -> entityTypeBuilder.build(name));

    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
