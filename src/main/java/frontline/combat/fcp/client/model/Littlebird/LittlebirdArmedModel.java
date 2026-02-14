package frontline.combat.fcp.client.model.Littlebird;

import com.atsuishio.superbwarfare.client.model.entity.VehicleModel;
import frontline.combat.fcp.entity.vehicle.Littlebird.LittlebirdArmedEntity;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.Nullable;

public class LittlebirdArmedModel extends VehicleModel<LittlebirdArmedEntity> {

    @Override
    public @Nullable VehicleModel.TransformContext<LittlebirdArmedEntity> collectTransform(String boneName) {
        return switch (boneName) {
            case "propeller" ->
                    (bone, vehicle, state) -> bone.setRotY(-Mth.lerp(state.getPartialTick(), vehicle.getPropellerRotO(), vehicle.getPropellerRot()));
            case "tailPropeller" ->
                    (bone, vehicle, state) -> bone.setRotX(6 * Mth.lerp(state.getPartialTick(), vehicle.getPropellerRotO(), vehicle.getPropellerRot()));
            default -> super.collectTransform(boneName);
        };
    }
}
