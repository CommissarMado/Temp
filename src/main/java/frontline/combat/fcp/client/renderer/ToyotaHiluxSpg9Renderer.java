package frontline.combat.fcp.client.renderer;

import com.atsuishio.superbwarfare.client.renderer.entity.VehicleRenderer;
import frontline.combat.fcp.client.model.ToyotaHiluxSpg9Model;
import frontline.combat.fcp.entity.vehicle.ToyotaHiluxSpg9Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class ToyotaHiluxSpg9Renderer extends VehicleRenderer<ToyotaHiluxSpg9Entity> {

    public ToyotaHiluxSpg9Renderer(EntityRendererProvider.Context renderManager) { super(renderManager, new ToyotaHiluxSpg9Model());}

    @Override
    public ResourceLocation getTextureLocation(ToyotaHiluxSpg9Entity entity) {
        ResourceLocation[] textures = entity.getCamoTextures();
        int camoType = entity.getCamoType();

        if (camoType >= 0 && camoType < textures.length) {
            return textures[camoType];
        } else {
            return textures[0];
        }
    }
}
