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
            name = "unessential.config.accent.name",
            description = "unessential.config.accent.description",
            category = "unessential.config.category.visuals"
    )
    public Color overriddenAccentColor = EssentialPalette.ESSENTIAL_GREEN;

    public UnessentialConfiguration() {
        super(new File("./config/unessential_config.toml"));

        initialize();
    }
}
