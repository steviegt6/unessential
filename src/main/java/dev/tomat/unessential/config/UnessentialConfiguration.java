package dev.tomat.unessential.config;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.io.File;

public class UnessentialConfiguration extends Vigilant {
    @Property(
            type = PropertyType.CHECKBOX,
            name = "unessential.config.tos.name",
            description = "unessential.config.tos.description",
            category = "unessential.config.category.privacy"
    )
    public boolean acceptedEssentialTOS = false;

    public UnessentialConfiguration() {
        super(new File("./config/unessential_config.toml"));

        initialize();
    }
}
