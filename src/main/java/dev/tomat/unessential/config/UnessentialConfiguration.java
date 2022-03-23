package dev.tomat.unessential.config;

import gg.essential.gui.EssentialPalette;
import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;
import gg.essential.vigilance.gui.VigilancePalette;

import java.awt.*;
import java.io.File;

public class UnessentialConfiguration extends Vigilant {

    /** PRIVACY **/

    // region

    @Property(
            type = PropertyType.SWITCH,
            name = "unessential.config.tos.name",
            description = "unessential.config.tos.description",
            category = "unessential.config.category.privacy"
    )
    public boolean acceptedEssentialTOS = false;

    // endregion

    /** ESSENTIAL VISUALS **/

    // region

    @Property(
            type = PropertyType.SWITCH,
            name = "unessential.config.player_display.name",
            description = "unessential.config.player_display.description",
            category = "unessential.config.category.visuals"
    )
    public boolean playerDisplay = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "unessential.config.button_display.name",
            description = "unessential.config.button_display.description",
            category = "unessential.config.category.visuals"
    )
    public boolean buttonDisplay = true;

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

    // endregion

    /** VIGILANCE VISUALS **/

    // region

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.accent.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color accent = VigilancePalette.INSTANCE.getAccent();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.background.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color background = VigilancePalette.INSTANCE.getBackground();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.bright_divider.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color brightDivider = VigilancePalette.INSTANCE.getBrightDivider();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.bright_highlight.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color brightHighlight = VigilancePalette.INSTANCE.getBrightHighlight();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.bright_text.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color brightText = VigilancePalette.INSTANCE.getBrightText();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.dark_background.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color darkBackground = VigilancePalette.INSTANCE.getDarkBackground();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.dark_divider.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color darkDivider = VigilancePalette.INSTANCE.getDarkDivider();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.dark_highlight.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color darkHighlight = VigilancePalette.INSTANCE.getDarkHighlight();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.dark_text.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color darkText = VigilancePalette.INSTANCE.getDarkText();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.disabled.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color disabled = VigilancePalette.INSTANCE.getDisabled();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.divider.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color divider = VigilancePalette.INSTANCE.getDivider();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.highlight.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color highlight = VigilancePalette.INSTANCE.getHighlight();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.light_background.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color lightBackground = VigilancePalette.INSTANCE.getLightBackground();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.mid_text.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color midText = VigilancePalette.INSTANCE.getMidText();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.modal_background.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color modalBackground = VigilancePalette.INSTANCE.getModalBackground();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.outline.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color outline = VigilancePalette.INSTANCE.getOutline();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.scroll_bar.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color scrollBar = VigilancePalette.INSTANCE.getScrollBar();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.search_bar_background.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color searchBarBackground = VigilancePalette.INSTANCE.getSearchBarBackground();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.success.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color success = VigilancePalette.INSTANCE.getSuccess();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.transparent.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color transparent = VigilancePalette.INSTANCE.getTransparent();

    @Property(
            type = PropertyType.COLOR,
            name = "unessential.config.warning.name",
            description = "unessential.config.color_override_vigilance.description",
            category = "unessential.config.category.vigilance_visuals"
    )
    public Color warning = VigilancePalette.INSTANCE.getWarning();

    // endregion

    public UnessentialConfiguration() {
        super(new File("./config/unessential_config.toml"));

        initialize();
    }
}
