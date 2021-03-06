/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.api.recipes;

import java.util.Collection;

import net.minecraftforge.fluids.FluidStack;

public interface IRefineryRecipeManager {

	void addRecipe(String id, FluidStack ingredient, FluidStack result, int energy, int delay);

	void addRecipe(String id, FluidStack ingredient1, FluidStack ingredient2, FluidStack result, int energy, int delay);

	Collection<IFlexibleRecipe<FluidStack>> getRecipes();

	IFlexibleRecipe<FluidStack> getRecipe(String currentRecipeId);

}
