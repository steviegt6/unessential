package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.extensions.IExtendedEmulated3DPlayer;
import gg.essential.gui.common.EmulatedUI3DPlayer;
import gg.essential.universal.UMatrixStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EmulatedUI3DPlayer.class, remap = false)
@SideOnly(Side.CLIENT)
public class ToggleableEmulated3DPlayerMixin {
    @Inject(
            method = "draw",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    public void toggleDraw(UMatrixStack matrixStack, CallbackInfo ci) {
        IExtendedEmulated3DPlayer extended = (IExtendedEmulated3DPlayer) this;

        if (!extended.getEnabled())
            ci.cancel();
    }
}