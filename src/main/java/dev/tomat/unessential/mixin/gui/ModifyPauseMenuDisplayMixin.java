package dev.tomat.unessential.mixin.gui;

import dev.tomat.unessential.UnessentialMod;
import dev.tomat.unessential.extensions.IExtendedUIComponent;
import gg.essential.elementa.UIComponent;
import gg.essential.elementa.components.UIBlock;
import gg.essential.elementa.components.UIContainer;
import gg.essential.event.gui.GuiDrawScreenEvent;
import gg.essential.gui.common.EmulatedUI3DPlayer;
import gg.essential.gui.common.QuantityIndicator;
import gg.essential.gui.common.VanillaButton;
import gg.essential.handlers.PauseMenuDisplay;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;

@Mixin(value = PauseMenuDisplay.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class ModifyPauseMenuDisplayMixin {
    @Final
    @Shadow
    private EmulatedUI3DPlayer emulatedUI3DPlayer;

    // TODO: This is pretty close, is there a more reliable way to hide all of these? :p
    // TODO: Untested notifications and stuff, may not be necessary?

    // @Shadow
    // private QuantityIndicator joinableServers;

    @Shadow
    private QuantityIndicator onlineFriends;

    @Shadow
    private VanillaButton customize;

    @Shadow
    private UIComponent friends;

    @Shadow
    private UIComponent unreadIndicator;

    @Final
    @Shadow
    private UIBlock toggledOffWarningIndicatorContainer;

    @Final
    @Shadow
    private UIBlock toggledOffWarningIndicator;

    @ModifyVariable(
            method = "init",
            at = @At("HEAD"),
            ordinal = 0,
            argsOnly = true,
            remap = false
    )
    private boolean modifiedIsMainMenu(final boolean mainMenu) {
        return UnessentialMod.INSTANCE.CONFIG.buttonDisplay && mainMenu;
    }

    @Inject(
            method = "drawScreen",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    public void modifyDrawScreen(GuiDrawScreenEvent it, CallbackInfo ci) {
        boolean enabledButtons = UnessentialMod.INSTANCE.CONFIG.buttonDisplay;
        boolean enabledPlayer = UnessentialMod.INSTANCE.CONFIG.playerDisplay;

        // Straight-up cancel drawing if they're both disabled.
        if (!enabledButtons && !enabledPlayer) {
            ci.cancel();
            return;
        }

        toggle(getExtended(emulatedUI3DPlayer), enabledPlayer);

        // toggle(getExtended(joinableServers), enabledButtons);
        toggle(getExtended(onlineFriends), enabledButtons);
        toggle(getExtended(customize), enabledButtons);
        toggle(getExtended(friends), enabledButtons);
        toggle(getExtended(unreadIndicator), enabledButtons);
        toggle(getExtended(toggledOffWarningIndicatorContainer), enabledButtons);
        toggle(getExtended(toggledOffWarningIndicator), enabledButtons);
    }

    private static IExtendedUIComponent getExtended(@Nullable UIComponent component) {
        if (component == null)
            return null;

        return (IExtendedUIComponent) component;
    }

    private static void toggle(@Nullable IExtendedUIComponent component, boolean value) {
        if (component == null)
            return;

        component.setCanClick(value);
        component.setCanDraw(value);

        try {
            ((VanillaButton) (Object) component).setEnabled(value);
        }
        catch (ClassCastException e) {
            // ignore
        }
    }
}
