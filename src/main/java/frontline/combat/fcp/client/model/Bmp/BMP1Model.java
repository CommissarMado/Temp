package frontline.combat.fcp.client.model.Bmp;

import com.atsuishio.superbwarfare.client.model.entity.VehicleModel;
import frontline.combat.fcp.entity.vehicle.Bmp.BMP1Entity;
import frontline.combat.fcp.entity.vehicle.Uaz.UAZEntity;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.Nullable;

public class BMP1Model extends VehicleModel<BMP1Entity> {

    @Override
    public boolean hideForTurretControllerWhileZooming() {
        return false;
    }


    @Override
    public @Nullable VehicleModel.TransformContext<BMP1Entity> collectTransform(String boneName) {
        return switch (boneName) {

            case "WheelL0", "WheelL1", "WheelL2", "WheelL3", "WheelL4", "WheelL5", "WheelL6", "WheelL7",
                 "WheelR0", "WheelR1", "WheelR2", "WheelR3", "WheelR4", "WheelR5", "WheelR6", "WheelR7" -> (bone, vehicle, state) -> {
                float wheelRot = Mth.lerp(state.getPartialTick(), vehicle.getPrevWheelRotation(), vehicle.getWheelRotation());
                bone.setRotX((float) Math.toRadians(-wheelRot));
            };
            default -> super.collectTransform(boneName);
        };
    }
}
