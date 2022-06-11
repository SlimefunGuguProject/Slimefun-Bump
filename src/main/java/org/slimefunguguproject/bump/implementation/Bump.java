package org.slimefunguguproject.bump.implementation;

import net.guizhanss.guizhanlib.bstats.charts.SimplePie;
import net.guizhanss.guizhanlib.slimefun.addon.AbstractAddon;
import net.guizhanss.guizhanlib.slimefun.addon.AddonConfig;
import org.bukkit.configuration.Configuration;
import org.slimefunguguproject.bump.core.services.LocalizationService;
import org.slimefunguguproject.bump.implementation.appraise.AppraiseManager;
import org.slimefunguguproject.bump.implementation.listeners.BowShootListener;
import org.slimefunguguproject.bump.implementation.setup.ItemsSetup;
import org.slimefunguguproject.bump.implementation.setup.ResearchSetup;
import org.slimefunguguproject.bump.implementation.tasks.WitherSkullBowTask;

import javax.annotation.Nonnull;

/**
 * Main class for {@link Bump}.
 *
 * @author ybw0014
 */
public final class Bump extends AbstractAddon {

    // localization
    private LocalizationService localization;
    private String lang;

    // appraise
    private AppraiseManager appraiseManager;

    public Bump() {
        super("SlimefunGuguProject", "Bump", "main", "options.auto-update", "options.lang");
        enableMetrics(14870);
    }

    @Override
    public void enable() {
        sendConsole("&6&l  _____");
        sendConsole("&6&l /\\   _`\\             ");
        sendConsole("&6&l \\ \\ \\L\\ \\  __  __    ___ ___   _____   ");
        sendConsole("&6&l  \\ \\  _ <'/\\ \\/\\ \\ /' __` __`\\/\\ '__`\\ ");
        sendConsole("&6&l   \\ \\ \\L\\ \\ \\ \\_\\ \\/\\ \\/\\ \\/\\ \\ \\ \\L\\ \\");
        sendConsole("&6&l    \\ \\____/\\ \\____/\\ \\_\\ \\_\\ \\_\\ \\ ,__/");
        sendConsole("&6&l     \\/___/  \\/___/  \\/_/\\/_/\\/_/\\ \\ \\/ ");
        sendConsole("&6&l                                  \\ \\_\\ ");
        sendConsole("&6&l                                   \\/_/ ");
        sendConsole("&a&l  Bump 2 for Slimefun4 RC-30+");
        sendConsole("&a&l  Powered By bxx2004");
        sendConsole("&a&l  GitHub: https://github.com/SlimefunGuguProject/Bump");
        sendConsole("&a&l  Issues: https://github.com/SlimefunGuguProject/Bump/issues");

        // config
        AddonConfig config = getAddonConfig();
        Configuration defaultConfig = config.getDefaults();
        for (String key : defaultConfig.getKeys(true)) {
            if (!config.contains(key)) {
                config.set(key, defaultConfig.get(key));
            }
        }
        config.save();

        // localization
        lang = config.getString("options.lang", "en-US");
        localization = new LocalizationService(this);
        localization.addLanguage(lang);
        if (!lang.equals("en-US")) {
            localization.addLanguage("en-US");
        }
        sendConsole("&eLoaded language {0}", lang);

        // items setup
        ItemsSetup.setup();

        // researches setup
        boolean enableResearch = config.getBoolean("options.enable-research");
        if (enableResearch) {
            ResearchSetup.setup();
        }

        // appraise setup
        appraiseManager = new AppraiseManager();

        // listeners
        getServer().getPluginManager().registerEvents(new BowShootListener(), this);

        // tasks
        WitherSkullBowTask.start();

        // Metrics setup
        getMetrics().addCustomChart(new SimplePie("server_language", () -> lang));
        getMetrics().addCustomChart(new SimplePie("enable_research", () -> enableResearch ? "enabled" : "disabled"));
    }

    @Override
    public void disable() {
    }

    @Nonnull
    private static Bump inst() {
        return getInstance();
    }

    @Nonnull
    public static LocalizationService getLocalization() {
        return inst().localization;
    }

    @Nonnull
    public static AppraiseManager getAppraiseManager() {
        return inst().appraiseManager;
    }
}
