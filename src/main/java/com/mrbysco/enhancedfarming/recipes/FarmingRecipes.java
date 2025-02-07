package com.mrbysco.enhancedfarming.recipes;

import com.mrbysco.enhancedfarming.Reference;
import com.mrbysco.enhancedfarming.recipes.PistonRecipe.SerializerPistonRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FarmingRecipes {
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Reference.MOD_ID);
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registry.RECIPE_TYPE_REGISTRY, Reference.MOD_ID);

	public static final RegistryObject<RecipeType<PistonRecipe>> PISTON_CRAFTING_TYPE = RECIPE_TYPES.register("piston_crafting", () -> new RecipeType<>() {
	});

	public static final RegistryObject<SerializerPistonRecipe> PISTON_CRAFTING_SERIALIZER = RECIPE_SERIALIZERS.register("piston_crafting", SerializerPistonRecipe::new);
}
