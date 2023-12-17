
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.runecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.runecraft.RunecraftMod;

public class RunecraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RunecraftMod.MODID);
	public static final RegistryObject<Item> TERRA_ELM_LOG = block(RunecraftModBlocks.TERRA_ELM_LOG);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
