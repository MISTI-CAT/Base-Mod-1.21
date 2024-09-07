package net.yanay.basemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.yanay.basemod.BaseMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BaseMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {

                    }).build());


    public static void registerItemGroups() {
        BaseMod.LOGGER.info("Registering Item Groups for " + BaseMod.MOD_ID);
    }
}
