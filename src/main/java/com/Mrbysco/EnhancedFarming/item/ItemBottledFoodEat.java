package com.Mrbysco.EnhancedFarming.item;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;

public class ItemBottledFoodEat extends ItemBowledFood{

	public ItemBottledFoodEat(int amount, float saturation, int stacksize, int useTime, boolean directHeal,
			boolean cureEffects, String registryName) {
		super(amount, saturation, stacksize, useTime, directHeal, cureEffects, registryName);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.EAT;
	}
}
