
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.runecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.runecraft.block.TerraElmLogBlock;
import net.mcreator.runecraft.RunecraftMod;

public class RunecraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RunecraftMod.MODID);
	public static final RegistryObject<Block> TERRA_ELM_LOG = REGISTRY.register("terra_elm_log", () -> new TerraElmLogBlock());
}
