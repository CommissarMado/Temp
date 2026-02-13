package frontline.combat.fcp.client.renderer.Littlebird;

import com.atsuishio.superbwarfare.client.renderer.entity.VehicleRenderer;
import frontline.combat.fcp.client.model.Littlebird.LittlebirdModel;
import frontline.combat.fcp.entity.vehicle.Littlebird.LittlebirdEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class LittlebirdRenderer extends VehicleRenderer<LittlebirdEntity> {
    public LittlebirdRenderer(EntityRendererProvider.Context renderManager) {super(renderManager, new LittlebirdModel());}

    @Override
    public ResourceLocation getTextureLocation(LittlebirdEntity entity) {
        ResourceLocation[] textures = entity.getCamoTextures();
        int camoType = entity.getCamoType();
        return (camoType >= 0 && camoType < textures.length) ? textures[camoType] : textures[0];
    }
}
