package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.UnessentialMod;
import dev.tomat.unessential.extensions.IExtendedEmulated3DPlayer;
import gg.essential.event.gui.GuiDrawScreenEvent;
import gg.essential.gui.common.EmulatedUI3DPlayer;
import gg.essential.handlers.PauseMenuDisplay;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = PauseMenuDisplay.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class ModifyPauseMenuDisplayMixin {
    @Final
    @Shadow
    private EmulatedUI3DPlayer emulatedUI3DPlayer;

    @Inject(
            method = "drawScreen",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    public void modifyDrawScreen(GuiDrawScreenEvent it, CallbackInfo ci) {
        boolean disabledButtons = !UnessentialMod.INSTANCE.CONFIG.buttonDisplay;
        boolean disabledPlayer = !UnessentialMod.INSTANCE.CONFIG.playerDisplay;
        IExtendedEmulated3DPlayer extendedEmulated3DPlayer = (IExtendedEmulated3DPlayer) (Object) emulatedUI3DPlayer;

        extendedEmulated3DPlayer.setEnabled(!disabledPlayer);

        // Straight-up cancel drawing if they're both disabled.
        if (disabledButtons && disabledPlayer)
        {
            ci.cancel();
            return;
        }
    }
}
