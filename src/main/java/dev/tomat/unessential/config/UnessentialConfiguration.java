package dev.tomat.unessential.config;

import gg.essential.gui.EssentialPalette;
import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.awt.*;
import java.io.File;

public class UnessentialConfiguration extends Vigilant {
    @Property(
            type = PropertyType.CHECKBOX,
            name = "unessential.config.tos.name",
            description = "unessential.config.tos.description",
            category = "unessential.config.category.privacy"
    )
    public boolean acceptedEssentialTOS = false;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.accent_hover.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color accentHover = EssentialPalette.ACCENT_HOVER;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.essential_blue.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color essentialBlue = EssentialPalette.ESSENTIAL_BLUE;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.essential_dark_blue_or_maybe_purple_idk.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color essentialDarkBlueOrMaybePurpleIdk = EssentialPalette.ESSENTIAL_DARK_BLUE_OR_MAYBE_PURPLE_IDK;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.essential_gold.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color essentialGold = EssentialPalette.ESSENTIAL_GOLD;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.essential_green.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color essentialGreen = EssentialPalette.ESSENTIAL_GREEN;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.essential_puke_green.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color essentialPukeGreen = EssentialPalette.ESSENTIAL_PUKE_GREEN;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.essential_red.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color essentialRed = EssentialPalette.ESSENTIAL_RED;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.essential_yellow.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color essentialYellow = EssentialPalette.ESSENTIAL_YELLOW;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.failed_message_text.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color failedMessageText = EssentialPalette.FAILED_MESSAGE_TEXT;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.message_unread.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color messageUnread = EssentialPalette.MESSAGE_UNREAD;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.message_unread_hover.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color messageUnreadHover = EssentialPalette.MESSAGE_UNREAD_HOVER;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.online.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color online = EssentialPalette.ONLINE;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.pending_message_text.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color pendingMessageText = EssentialPalette.PENDING_MESSAGE_TEXT;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.received_message_background.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color receivedMessageBackground = EssentialPalette.RECEIVED_MESSAGE_BACKGROUND;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.received_message_text.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color receivedMessageText = EssentialPalette.RECEIVED_MESSAGE_TEXT;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.sent_message_background.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color sentMessageBackground = EssentialPalette.SENT_MESSAGE_BACKGROUND;

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.sent_message_text.name",
            description = "unessential.config.color_override.description",
            category = "unessential.config.category.visuals"
    )
    public Color sentMessageText = EssentialPalette.SENT_MESSAGE_TEXT;

    public UnessentialConfiguration() {
        super(new File("./config/unessential_config.toml"));

        initialize();
    }
}
