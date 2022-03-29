package dev.tomat.unessential.elementa.constraints;

import dev.tomat.unessential.UnessentialMod;
import gg.essential.gui.EssentialPalette;
import gg.essential.vigilance.gui.VigilancePalette;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;

/**
 * A simple class for overriding some ColorConstraint logic.
 * Functionality is added through a mixin.
 */
public final class ColorOverrideConstraint {
    public static Color getOverriddenColor(Color input) {
        // TODO: If someone sets an Essential color to a default Vigilance one, this will cause clashing.
        return getCustomColor(getVigilanceColor(getEssentialColor(input)));
    }

    public static Color getEssentialColor(Color input) {
        if (input == EssentialPalette.ACCENT_HOVER) {
            return UnessentialMod.INSTANCE.CONFIG.accentHover;
        }

        if (input == EssentialPalette.ESSENTIAL_BLUE) {
            return UnessentialMod.INSTANCE.CONFIG.essentialBlue;
        }

        if (input == EssentialPalette.ESSENTIAL_DARK_BLUE_OR_MAYBE_PURPLE_IDK) {
            return UnessentialMod.INSTANCE.CONFIG.essentialDarkBlueOrMaybePurpleIdk;
        }

        if (input == EssentialPalette.ESSENTIAL_GOLD) {
            return UnessentialMod.INSTANCE.CONFIG.essentialGold;
        }

        if (input == EssentialPalette.ESSENTIAL_GREEN) {
            return UnessentialMod.INSTANCE.CONFIG.essentialGreen;
        }

        if (input == EssentialPalette.ESSENTIAL_PUKE_GREEN) {
            return UnessentialMod.INSTANCE.CONFIG.essentialPukeGreen;
        }

        if (input == EssentialPalette.ESSENTIAL_RED) {
            return UnessentialMod.INSTANCE.CONFIG.essentialRed;
        }

        if (input == EssentialPalette.ESSENTIAL_YELLOW) {
            return UnessentialMod.INSTANCE.CONFIG.essentialYellow;
        }

        if (input == EssentialPalette.FAILED_MESSAGE_TEXT) {
            return UnessentialMod.INSTANCE.CONFIG.failedMessageText;
        }

        if (input == EssentialPalette.MESSAGE_UNREAD) {
            return UnessentialMod.INSTANCE.CONFIG.messageUnread;
        }

        if (input == EssentialPalette.MESSAGE_UNREAD_HOVER) {
            return UnessentialMod.INSTANCE.CONFIG.messageUnreadHover;
        }

        if (input == EssentialPalette.ONLINE) {
            return UnessentialMod.INSTANCE.CONFIG.online;
        }

        if (input == EssentialPalette.PENDING_MESSAGE_TEXT) {
            return UnessentialMod.INSTANCE.CONFIG.pendingMessageText;
        }

        if (input == EssentialPalette.RECEIVED_MESSAGE_BACKGROUND) {
            return UnessentialMod.INSTANCE.CONFIG.receivedMessageBackground;
        }

        if (input == EssentialPalette.RECEIVED_MESSAGE_TEXT) {
            return UnessentialMod.INSTANCE.CONFIG.receivedMessageText;
        }

        if (input == EssentialPalette.SENT_MESSAGE_BACKGROUND) {
            return UnessentialMod.INSTANCE.CONFIG.sentMessageBackground;
        }

        if (input == EssentialPalette.SENT_MESSAGE_TEXT) {
            return UnessentialMod.INSTANCE.CONFIG.sentMessageText;
        }

        return input;
    }

    public static Color getVigilanceColor(Color input) {
        if (input == VigilancePalette.INSTANCE.getAccent()) {
            return UnessentialMod.INSTANCE.CONFIG.accent;
        }

        if (input == VigilancePalette.INSTANCE.getBackground()) {
            return UnessentialMod.INSTANCE.CONFIG.background;
        }

        if (input == VigilancePalette.INSTANCE.getBrightDivider()) {
            return UnessentialMod.INSTANCE.CONFIG.brightDivider;
        }

        if (input == VigilancePalette.INSTANCE.getBrightHighlight()) {
            return UnessentialMod.INSTANCE.CONFIG.brightHighlight;
        }

        if (input == VigilancePalette.INSTANCE.getBrightText()) {
            return UnessentialMod.INSTANCE.CONFIG.brightText;
        }

        if (input == VigilancePalette.INSTANCE.getDarkBackground()) {
            return UnessentialMod.INSTANCE.CONFIG.darkBackground;
        }

        if (input == VigilancePalette.INSTANCE.getDarkDivider()) {
            return UnessentialMod.INSTANCE.CONFIG.darkDivider;
        }

        if (input == VigilancePalette.INSTANCE.getDarkHighlight()) {
            return UnessentialMod.INSTANCE.CONFIG.darkHighlight;
        }

        if (input == VigilancePalette.INSTANCE.getDarkText()) {
            return UnessentialMod.INSTANCE.CONFIG.darkText;
        }

        if (input == VigilancePalette.INSTANCE.getDisabled()) {
            return UnessentialMod.INSTANCE.CONFIG.disabled;
        }

        if (input == VigilancePalette.INSTANCE.getDarkDivider()) {
            return UnessentialMod.INSTANCE.CONFIG.darkDivider;
        }

        if (input == VigilancePalette.INSTANCE.getHighlight()) {
            return UnessentialMod.INSTANCE.CONFIG.highlight;
        }

        if (input == VigilancePalette.INSTANCE.getLightBackground()) {
            return UnessentialMod.INSTANCE.CONFIG.lightBackground;
        }

        if (input == VigilancePalette.INSTANCE.getMidText()) {
            return UnessentialMod.INSTANCE.CONFIG.midText;
        }

        if (input == VigilancePalette.INSTANCE.getModalBackground()) {
            return UnessentialMod.INSTANCE.CONFIG.modalBackground;
        }

        if (input == VigilancePalette.INSTANCE.getOutline()) {
            return UnessentialMod.INSTANCE.CONFIG.outline;
        }

        if (input == VigilancePalette.INSTANCE.getScrollBar()) {
            return UnessentialMod.INSTANCE.CONFIG.scrollBar;
        }

        if (input == VigilancePalette.INSTANCE.getSearchBarBackground()) {
            return UnessentialMod.INSTANCE.CONFIG.searchBarBackground;
        }

        if (input == VigilancePalette.INSTANCE.getSuccess()) {
            return UnessentialMod.INSTANCE.CONFIG.success;
        }

        if (input == VigilancePalette.INSTANCE.getTransparent()) {
            return UnessentialMod.INSTANCE.CONFIG.transparent;
        }

        if (input == VigilancePalette.INSTANCE.getWarning()) {
            return UnessentialMod.INSTANCE.CONFIG.warning;
        }

        return input;
    }

    public static Color getCustomColor(Color input) {
        String custom = UnessentialMod.INSTANCE.CONFIG.customColorOverride;
        String[] colorOverrides = custom.split(";");

        for (String colorOverride : colorOverrides) {
            String[] parts = colorOverride.split(":");

            if (parts.length != 2)
                continue;

            try {
                if (Objects.equals(input, safeDecode(parts[0]))) {
                    Color decoded = safeDecode(parts[1]);

                    if (decoded != null) {
                        input = safeDecode(parts[1]);
                    }
                }
            } catch (Exception ignore) {

            }
        }

        return input;
    }

    public static @Nullable Color safeDecode(String hex) {
        if (hex == null || hex.length() == 0) {
            return null;
        }

        hex = hex.toUpperCase(Locale.ROOT);

        if (!hex.startsWith("#")) {
            hex = "#" + hex;
        }

        long color = Long.parseLong(hex.substring(1), 16);

        if (hex.length() == 7) {
            return new Color(
                    (int) ((color >> 16) & 0xFF),
                    (int) ((color >> 8) & 0xFF),
                    (int) (color & 0xFF)
            );
        }

        if (hex.length() == 9) {
            return new Color(
                    (int) ((color >> 24) & 0xFF),
                    (int) ((color >> 16) & 0xFF),
                    (int) ((color >> 8) & 0xFF),
                    (int) (color & 0xFF)
            );
        }

        return null;
    }
}
