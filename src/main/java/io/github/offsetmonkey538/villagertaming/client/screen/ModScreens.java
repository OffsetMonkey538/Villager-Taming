package io.github.offsetmonkey538.villagertaming.client.screen;


import net.minecraft.client.gui.screen.ingame.HandledScreens;

import static io.github.offsetmonkey538.villagertaming.screen.ModScreenHandlers.TAMED_VILLAGER;

public final class ModScreens {

    public static void register() {
        HandledScreens.register(TAMED_VILLAGER, TamedVillagerScreen::new);
    }
}
