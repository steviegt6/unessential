package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.extensions.IExtendedUIComponent;
import gg.essential.elementa.UIComponent;
import gg.essential.universal.UMatrixStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Observable;

@Mixin(value = UIComponent.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class ToggleableUIComponentMixin extends Observable {
    @Inject(
            method = "draw(Lgg/essential/universal/UMatrixStack;)V",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    public void toggleDraw(UMatrixStack matrixStack, CallbackInfo ci) {
        IExtendedUIComponent extended = (IExtendedUIComponent) this;

        if (!extended.getCanDraw())
            ci.cancel();
    }

    @Inject(
            method = "mouseClick",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    public void toggleMouseClick(double mouseX, double mouseY, int button, CallbackInfo ci) {
        IExtendedUIComponent extended = (IExtendedUIComponent) this;

        if (!extended.getCanClick())
            ci.cancel();
    }
}
