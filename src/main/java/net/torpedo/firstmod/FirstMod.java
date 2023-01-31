package net.torpedo.firstmod;

import net.fabricmc.api.ModInitializer;
import net.torpedo.firstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//teste
public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItems.addItemsToItemGroup();
	}
}
