package frontline.combat.fcp.client.renderer.Stryker;

import com.atsuishio.superbwarfare.client.renderer.entity.VehicleRenderer;
import frontline.combat.fcp.client.model.Stryker.StrykerDragoonModel;
import frontline.combat.fcp.client.model.Stryker.StrykerMGSModel;
import frontline.combat.fcp.entity.vehicle.Stryker.StrykerDragoonEntity;
import frontline.combat.fcp.entity.vehicle.Stryker.StrykerMGSEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class StrykerMGSRenderer extends VehicleRenderer<StrykerMGSEntity> {

    public StrykerMGSRenderer(EntityRendererProvider.Context renderManager) { super(renderManager, new StrykerMGSModel());}

    @Override
    public ResourceLocation getTextureLocation(StrykerMGSEntity entity) {
        ResourceLocation[] textures = entity.getCamoTextures();
        int camoType = entity.getCamoType();

        if (camoType >= 0 && camoType < textures.length) {
            return textures[camoType];
        } else {
            return textures[0];
        }
    }
}
