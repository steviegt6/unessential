package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.elementa.constraints.ColorOverrideConstraint;
import gg.essential.elementa.UIComponent;
import gg.essential.elementa.constraints.ColorConstraint;
import gg.essential.elementa.constraints.ConstantColorConstraint;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.awt.*;

@Mixin(value = ConstantColorConstraint.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class OverrideEssentialPaletteConstantConstraintMixin implements ColorConstraint {
    @Inject(
            method = "getColor",
            at = @At("RETURN"),
            cancellable = true
    )
    public void getOverridenColor(CallbackInfoReturnable<Color> ci) {
        ci.setReturnValue(ColorOverrideConstraint.getOverriddenColor(ci.getReturnValue()));
    }

    @Inject(
            method = "getColorImpl",
            at = @At("RETURN"),
            cancellable = true
    )
    public void getOverridenColorImpl(UIComponent component, CallbackInfoReturnable<Color> ci) {
        ci.setReturnValue(ColorOverrideConstraint.getOverriddenColor(ci.getReturnValue()));
    }
}
