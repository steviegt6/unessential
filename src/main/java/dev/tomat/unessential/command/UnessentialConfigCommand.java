package dev.tomat.unessential.command;

import dev.tomat.unessential.UnessentialMod;
import gg.essential.api.EssentialAPI;
import gg.essential.api.commands.Command;
import gg.essential.api.commands.DefaultHandler;
import org.jetbrains.annotations.NotNull;

public class UnessentialConfigCommand extends Command {
    public UnessentialConfigCommand(@NotNull String name) {
        super(name);
    }

    @DefaultHandler
    public void handle() {
        EssentialAPI.getGuiUtil().openScreen(UnessentialMod.INSTANCE.CONFIG.gui());
    }
}
