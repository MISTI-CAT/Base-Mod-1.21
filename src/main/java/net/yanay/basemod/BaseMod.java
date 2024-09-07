package net.yanay.basemod;

import net.fabricmc.api.ModInitializer;

import net.yanay.basemod.block.ModBlocks;
import net.yanay.basemod.item.ModItemGroups;
import net.yanay.basemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseMod implements ModInitializer {
	public static String MOD_ID = "basemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModItemGroups.registerItemGroups();
	}
}