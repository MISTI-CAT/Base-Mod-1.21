package net.yanay.basemod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yanay.basemod.BaseMod;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BaseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BaseMod.LOGGER.info("Registering Mod Items for " + BaseMod.MOD_ID);

    }
}