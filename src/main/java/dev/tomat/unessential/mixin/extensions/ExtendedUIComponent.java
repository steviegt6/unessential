package dev.tomat.unessential.mixin.extensions;

import dev.tomat.unessential.extensions.IExtendedUIComponent;
import gg.essential.elementa.UIComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = UIComponent.class, remap = false)
@SideOnly(Side.CLIENT)
public abstract class ExtendedUIComponent implements IExtendedUIComponent {
    private boolean canDraw = true;
    private boolean canClick = true;

    @Override
    public void setCanDraw(boolean value) {
        canDraw = value;
    }

    @Override
    public boolean getCanDraw() {
        return canDraw;
    }

    @Override
    public void setCanClick(boolean value) {
        canClick = value;
    }

    @Override
    public boolean getCanClick() {
        return canClick;
    }
}
