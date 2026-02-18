package frontline.combat.fcp.init;

import frontline.combat.fcp.FCP;
import frontline.combat.fcp.client.renderer.Bmp.BMP1Renderer;
import frontline.combat.fcp.client.renderer.Lav.Lav25Renderer;
import frontline.combat.fcp.client.renderer.Littlebird.LittlebirdArmedRenderer;
import frontline.combat.fcp.client.renderer.Littlebird.LittlebirdRenderer;
import frontline.combat.fcp.client.renderer.Stryker.StrykerM2Renderer;
import frontline.combat.fcp.client.renderer.Stryker.StrykerMGSRenderer;
import frontline.combat.fcp.client.renderer.Toyota.ToyotaHiluxBMPRenderer;
import frontline.combat.fcp.client.renderer.Toyota.ToyotaHiluxRenderer;
import frontline.combat.fcp.client.renderer.Toyota.ToyotaHiluxRocketPodRenderer;
import frontline.combat.fcp.client.renderer.Toyota.ToyotaHiluxSpg9Renderer;
import frontline.combat.fcp.client.renderer.Uaz.UAZDSHKARenderer;
import frontline.combat.fcp.client.renderer.Uaz.UAZRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = FCP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEntityRenderers {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.TOYOTA_HILUX.get(), ToyotaHiluxRenderer::new);
        event.registerEntityRenderer(ModEntities.TOYOTA_HILUX_ROCKET_POD.get(), ToyotaHiluxRocketPodRenderer::new);
        event.registerEntityRenderer(ModEntities.TOYOTA_HILUX_BMP.get(), ToyotaHiluxBMPRenderer::new);
        event.registerEntityRenderer(ModEntities.TOYOTA_HILUX_SPG9.get(), ToyotaHiluxSpg9Renderer::new);

        event.registerEntityRenderer(ModEntities.UAZ.get(), UAZRenderer::new);
        event.registerEntityRenderer(ModEntities.UAZ_DSHKA.get(), UAZDSHKARenderer::new);

        event.registerEntityRenderer(ModEntities.STRYKER_MGS.get(), StrykerMGSRenderer::new);
        event.registerEntityRenderer(ModEntities.STRYKER_M2.get(), StrykerM2Renderer::new);

        event.registerEntityRenderer(ModEntities.LITTLEBIRD.get(), LittlebirdRenderer::new);
        event.registerEntityRenderer(ModEntities.LITTLEBIRD_ARMED.get(), LittlebirdArmedRenderer::new);

        event.registerEntityRenderer(ModEntities.BMP1.get(), BMP1Renderer::new);

        event.registerEntityRenderer(ModEntities.LAV25.get(), Lav25Renderer::new);
    }
}
