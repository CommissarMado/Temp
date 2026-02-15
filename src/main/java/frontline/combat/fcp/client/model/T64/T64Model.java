package frontline.combat.fcp.client.model.T64;

import com.atsuishio.superbwarfare.client.model.entity.VehicleModel;
import frontline.combat.fcp.entity.vehicle.T64.T64Entity;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.Nullable;

public class T64Model extends VehicleModel<T64Entity> {

    @Override
    public boolean hideForTurretControllerWhileZooming() {
        return false;
    }


    @Override
    public @Nullable VehicleModel.TransformContext<T64Entity> collectTransform(String boneName) {
        return switch (boneName) {

            case "WheelL0", "WheelL1", "WheelL2", "WheelL3", "WheelL4", "WheelL5", "WheelL6",
                 "WheelR0", "WheelR1", "WheelR2", "WheelR3", "WheelR4", "WheelR5", "WheelR6" -> (bone, vehicle, state) -> {
                float wheelRot = Mth.lerp(state.getPartialTick(), vehicle.getPrevWheelRotation(), vehicle.getWheelRotation());
                bone.setRotX((float) Math.toRadians(-wheelRot));
            };
            default -> super.collectTransform(boneName);
        };
    }
}
