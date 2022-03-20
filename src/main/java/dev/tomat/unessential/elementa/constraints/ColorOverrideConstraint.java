package dev.tomat.unessential.elementa.constraints;

import dev.tomat.unessential.UnessentialMod;
import gg.essential.gui.EssentialPalette;

import java.awt.*;

/**
 * A simple class for overriding some ColorConstraint logic.
 * Functionality is added through a mixin.
 */
public final class ColorOverrideConstraint {
    public static Color getOverriddenColor(Color input) {
        if (input == EssentialPalette.ESSENTIAL_GREEN) {
            return UnessentialMod.INSTANCE.CONFIG.overriddenAccentColor;
        }

        return input;
    }
}
