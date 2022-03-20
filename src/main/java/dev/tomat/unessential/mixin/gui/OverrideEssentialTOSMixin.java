package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.UnessentialMod;
import gg.essential.data.OnboardingData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = OnboardingData.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class OverrideEssentialTOSMixin implements gg.essential.api.data.OnboardingData {
    @Inject(
            method = "hasAcceptedTos",
            at = @At("HEAD"),
            remap = false,
            cancellable = true
    )
    private static void overrideHasAcceptedTos(CallbackInfoReturnable<Boolean> ci) {
        ci.setReturnValue(UnessentialMod.INSTANCE.CONFIG.acceptedEssentialTOS);
        ci.cancel();
    }

    @Inject(
            method = "hasDeniedTos",
            at = @At("HEAD"),
            remap = false,
            cancellable = true
    )
    private static void overrideHasDeniedTos(CallbackInfoReturnable<Boolean> ci) {
        ci.setReturnValue(!UnessentialMod.INSTANCE.CONFIG.acceptedEssentialTOS);
        ci.cancel();
    }
}
