package dev.tomat.unessential;

import dev.tomat.unessential.command.UnessentialConfigCommand;
import dev.tomat.unessential.config.UnessentialConfiguration;
import gg.essential.vigilance.Vigilance;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = UnessentialMod.MOD_ID, version = UnessentialMod.VERSION)
public class UnessentialMod
{
    public static final String MOD_ID = "unessential";
    public static final String VERSION = "1.0.0";

    public static UnessentialMod INSTANCE;

    public final UnessentialConfiguration CONFIG = new UnessentialConfiguration();

    public UnessentialMod() {
        INSTANCE = this;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        INSTANCE = this;

        Vigilance.initialize();

        CONFIG.preload();

        new UnessentialConfigCommand("unessential").register();
        new UnessentialConfigCommand("une").register();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
