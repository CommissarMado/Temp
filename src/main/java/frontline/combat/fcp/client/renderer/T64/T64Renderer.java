package frontline.combat.fcp.client.renderer.T64;

import com.atsuishio.superbwarfare.client.renderer.entity.VehicleRenderer;
import frontline.combat.fcp.client.model.T64.T64Model;
import frontline.combat.fcp.entity.vehicle.T64.T64Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class T64Renderer extends VehicleRenderer<T64Entity> {

    public T64Renderer(EntityRendererProvider.Context renderManager) { super(renderManager, new T64Model());}

    @Override
    public ResourceLocation getTextureLocation(T64Entity entity) {
        ResourceLocation[] textures = entity.getCamoTextures();
        int camoType = entity.getCamoType();

        if (camoType >= 0 && camoType < textures.length) {
            return textures[camoType];
        } else {
            return textures[0];
        }
    }
}
