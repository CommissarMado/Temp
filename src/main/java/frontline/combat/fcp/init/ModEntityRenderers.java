package frontline.combat.fcp.init;

import frontline.combat.fcp.FCP;
import frontline.combat.fcp.client.renderer.ToyotaHiluxRenderer;
import frontline.combat.fcp.client.renderer.ToyotaHiluxRocketPodRenderer;
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
    }
}
