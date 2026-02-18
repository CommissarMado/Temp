package frontline.combat.fcp.init;

import frontline.combat.fcp.FCP;
import frontline.combat.fcp.entity.vehicle.Bmp.BMP1Entity;
import frontline.combat.fcp.entity.vehicle.Lav.Lav25Entity;
import frontline.combat.fcp.entity.vehicle.Littlebird.LittlebirdArmedEntity;
import frontline.combat.fcp.entity.vehicle.Littlebird.LittlebirdEntity;
import frontline.combat.fcp.entity.vehicle.Stryker.StrykerM2Entity;
import frontline.combat.fcp.entity.vehicle.Stryker.StrykerMGSEntity;
import frontline.combat.fcp.entity.vehicle.Toyota.ToyotaHiluxBMPEntity;
import frontline.combat.fcp.entity.vehicle.Toyota.ToyotaHiluxEntity;
import frontline.combat.fcp.entity.vehicle.Toyota.ToyotaHiluxRocketPodEntity;
import frontline.combat.fcp.entity.vehicle.Toyota.ToyotaHiluxSpg9Entity;
import frontline.combat.fcp.entity.vehicle.Uaz.UAZDSHKAEntity;
import frontline.combat.fcp.entity.vehicle.Uaz.UAZEntity;
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

    public static final RegistryObject<EntityType<ToyotaHiluxBMPEntity>> TOYOTA_HILUX_BMP = register("toyota_hilux_bmp",
            EntityType.Builder.of(ToyotaHiluxBMPEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));

    public static final RegistryObject<EntityType<ToyotaHiluxSpg9Entity>> TOYOTA_HILUX_SPG9 = register("toyota_hilux_spg9",
            EntityType.Builder.of(ToyotaHiluxSpg9Entity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));

    public static final RegistryObject<EntityType<UAZEntity>> UAZ = register("uaz",
            EntityType.Builder.of(UAZEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(2f,2f));

    public static final RegistryObject<EntityType<UAZDSHKAEntity>> UAZ_DSHKA = register("uaz_dshka",
            EntityType.Builder.of(UAZDSHKAEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(2f,2f));
    public static final RegistryObject<EntityType<StrykerMGSEntity>> STRYKER_MGS = register("stryker_mgs",
            EntityType.Builder.of(StrykerMGSEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));

    public static final RegistryObject<EntityType<StrykerM2Entity>> STRYKER_M2 = register("stryker_m2",
            EntityType.Builder.of(StrykerM2Entity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));

    public static final RegistryObject<EntityType<LittlebirdEntity>> LITTLEBIRD = register("littlebird",
            EntityType.Builder.of(LittlebirdEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(2f,2f));

    public static final RegistryObject<EntityType<LittlebirdArmedEntity>> LITTLEBIRD_ARMED = register("littlebird_armed",
            EntityType.Builder.of(LittlebirdArmedEntity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(2f,2f));

    public static final RegistryObject<EntityType<BMP1Entity>> BMP1 = register("bmp1",
            EntityType.Builder.of(BMP1Entity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));

    public static final RegistryObject<EntityType<Lav25Entity>> LAV25 = register("lav25",
            EntityType.Builder.of(Lav25Entity::new, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune().sized(3f,2f));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String name, EntityType.Builder<T> entityTypeBuilder) {
        return ENTITY_TYPES.register(name, () -> entityTypeBuilder.build(name));

    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
