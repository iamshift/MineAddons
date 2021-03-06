package com.iamshift.mineaddons.entities.renders;

import com.iamshift.mineaddons.References;
import com.iamshift.mineaddons.entities.VoidCreeper;

import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVoidCreeper extends RenderLiving<VoidCreeper>
{
	public RenderVoidCreeper(RenderManager rendermanagerIn) 
	{
		super(rendermanagerIn, new ModelCreeper(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(VoidCreeper entity) 
	{
		return new ResourceLocation(References.MODID, "textures/entities/voidcreeper.png");
	}
}
