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
}
