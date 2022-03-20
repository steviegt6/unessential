package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.elementa.constraints.ColorOverrideConstraint;
import gg.essential.elementa.UIComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.awt.*;

@Mixin(value = UIComponent.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class OverrideEssentialPaletteComponentMixin {

    @Inject(
            method = "getColor",
            at = @At("RETURN"),
            cancellable = true
    )
    public void getOverriddenColor(CallbackInfoReturnable<Color> ci) {
        ci.setReturnValue(ColorOverrideConstraint.getOverriddenColor(ci.getReturnValue()));
    }
}
