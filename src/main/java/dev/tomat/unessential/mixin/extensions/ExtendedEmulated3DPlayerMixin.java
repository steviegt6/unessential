package dev.tomat.unessential.mixin.extensions;

import dev.tomat.unessential.extensions.IExtendedEmulated3DPlayer;
import gg.essential.gui.common.EmulatedUI3DPlayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = EmulatedUI3DPlayer.class, remap = false)
public abstract class ExtendedEmulated3DPlayerMixin implements IExtendedEmulated3DPlayer {
    private boolean enabled = true;

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean getEnabled() {
        return this.enabled;
    }
}
