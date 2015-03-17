// Date: 3/6/15 3:57:39 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.camp.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTechnoCreeper extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
  
  public ModelTechnoCreeper()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, -3F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, -0.5792856F, 0.2979393F, -0.5419123F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 10F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 6F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 1.812603F, -1.252004F, 0.5979722F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-2F, 5F, -2F, 4, 6, 4);
      leg3.setRotationPoint(-2F, 12F, -4F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, -1.195944F, 0.915645F, 0.9717049F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(10F, -7F, -25F, 4, 6, 4);
      leg4.setRotationPoint(2F, 31F, -4F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, -1.364124F, 0.6540321F, 0.205553F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(0F, 0F, -2F, 4, 6, 4);
      leg1.setRotationPoint(-4F, 18F, 4F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 2.504009F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-1F, 0F, -2F, 4, 6, 4);
      leg2.setRotationPoint(2F, 18F, 4F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, -2.896428F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    leg1.render(f5);
    leg2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float f2, float par4, float par5, float f5, Entity entity) {
	  
	    super.setRotationAngles(par1, par2, f2, par4, par5, f5, entity);
	    
	    this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
	    this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
	    this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
	    this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
	    this.leg1.rotateAngleZ = 0.0F;
	    this.leg2.rotateAngleZ = 0.0F;
	    this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    this.leg3.rotateAngleY = 0.0F;
	    this.leg4.rotateAngleY = 0.0F;
	  }

}
