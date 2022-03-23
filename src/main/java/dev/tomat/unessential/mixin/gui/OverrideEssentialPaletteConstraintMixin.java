package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.elementa.constraints.ColorOverrideConstraint;
import gg.essential.elementa.UIComponent;
import gg.essential.elementa.constraints.ColorConstraint;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.awt.*;

@Mixin(value = ColorConstraint.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class OverrideEssentialPaletteConstraintMixin implements ColorConstraint {
    @Inject(
            method = "getColor",
            at = @At("RETURN"),
            cancellable = true
    )
    public void getOverridenColor(UIComponent component, CallbackInfoReturnable<Color> ci) {
        ci.setReturnValue(ColorOverrideConstraint.getOverriddenColor(ci.getReturnValue()));
    }
}
