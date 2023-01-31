package net.torpedo.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.torpedo.firstmod.FirstMod;

public class ModItemGroup {
        public static ItemGroup MODITEM;

        public static void registerItemGroups(){
            MODITEM = FabricItemGroup.builder(new Identifier(FirstMod.MOD_ID,"mod_items"))
                    .displayName(Text.literal("Mod Items"))
                    .icon(() -> new ItemStack(ModItems.BALL_OF_YARN)).build();
        }

    }

}
