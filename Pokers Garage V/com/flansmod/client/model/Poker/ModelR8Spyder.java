//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.Poker; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelR8Spyder extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelR8Spyder() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[49];
		bodyModel[0] = new ModelRendererTurbo(this, 2, 453, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 2, 422, textureX, textureY); // Import Shape2
		bodyModel[2] = new ModelRendererTurbo(this, 2, 422, textureX, textureY); // Import Shape2
		bodyModel[3] = new ModelRendererTurbo(this, 371, 39, textureX, textureY); // Import Shape41
		bodyModel[4] = new ModelRendererTurbo(this, 371, 39, textureX, textureY); // Import Shape41
		bodyModel[5] = new ModelRendererTurbo(this, 383, 57, textureX, textureY); // Import Shape42
		bodyModel[6] = new ModelRendererTurbo(this, 383, 57, textureX, textureY); // Import Shape42
		bodyModel[7] = new ModelRendererTurbo(this, 387, 85, textureX, textureY); // Import Shape43
		bodyModel[8] = new ModelRendererTurbo(this, 387, 85, textureX, textureY); // Import Shape43
		bodyModel[9] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[10] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[11] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[12] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[13] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[14] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[15] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[16] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Import Shape44
		bodyModel[17] = new ModelRendererTurbo(this, 386, 136, textureX, textureY); // Import Kierownica
		bodyModel[18] = new ModelRendererTurbo(this, 52, 491, textureX, textureY); // Import Shape3
		bodyModel[19] = new ModelRendererTurbo(this, 150, 491, textureX, textureY); // Import Shape3
		bodyModel[20] = new ModelRendererTurbo(this, 2, 377, textureX, textureY); // Import Shape4
		bodyModel[21] = new ModelRendererTurbo(this, 2, 340, textureX, textureY); // Import Shape6
		bodyModel[22] = new ModelRendererTurbo(this, 2, 264, textureX, textureY); // Import Shape7
		bodyModel[23] = new ModelRendererTurbo(this, 2, 229, textureX, textureY); // Import Shape8
		bodyModel[24] = new ModelRendererTurbo(this, 2, 194, textureX, textureY); // Import Shape9
		bodyModel[25] = new ModelRendererTurbo(this, 46, 152, textureX, textureY); // Import SlupekLewy
		bodyModel[26] = new ModelRendererTurbo(this, 153, 47, textureX, textureY); // Import Shape16
		bodyModel[27] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Import Shape17
		bodyModel[28] = new ModelRendererTurbo(this, 3, 39, textureX, textureY); // Import Shape18
		bodyModel[29] = new ModelRendererTurbo(this, 76, 39, textureX, textureY); // Import Shape19
		bodyModel[30] = new ModelRendererTurbo(this, 133, 2, textureX, textureY); // Import Shape20
		bodyModel[31] = new ModelRendererTurbo(this, 76, 86, textureX, textureY); // Import Shape21
		bodyModel[32] = new ModelRendererTurbo(this, 78, 131, textureX, textureY); // Import Shape22
		bodyModel[33] = new ModelRendererTurbo(this, 440, 17, textureX, textureY); // Import Shape25
		bodyModel[34] = new ModelRendererTurbo(this, 434, 55, textureX, textureY); // Import Shape26
		bodyModel[35] = new ModelRendererTurbo(this, 369, 2, textureX, textureY); // Import Shape27
		bodyModel[36] = new ModelRendererTurbo(this, 420, 2, textureX, textureY); // Import Shape28
		bodyModel[37] = new ModelRendererTurbo(this, 168, 110, textureX, textureY); // Import Shape29
		bodyModel[38] = new ModelRendererTurbo(this, 58, 83, textureX, textureY); // Import Shape32
		bodyModel[39] = new ModelRendererTurbo(this, 58, 83, textureX, textureY); // Import Shape32
		bodyModel[40] = new ModelRendererTurbo(this, 53, 93, textureX, textureY); // Import LusterkoLewe
		bodyModel[41] = new ModelRendererTurbo(this, 53, 93, textureX, textureY); // Import LusterkoPrawe
		bodyModel[42] = new ModelRendererTurbo(this, 2, 303, textureX, textureY); // Import Shape5
		bodyModel[43] = new ModelRendererTurbo(this, 47, 110, textureX, textureY); // Import Shape10
		bodyModel[44] = new ModelRendererTurbo(this, 250, 250, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 250, 250, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 250, 250, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 250, 250, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 46, 152, textureX, textureY); // Box 61

		bodyModel[0].addBox(0F, 0F, 0F, 42, 1, 31, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(-16F, 8F, -16F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 1, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Import Shape2
		bodyModel[1].setRotationPoint(-29F, -2F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 1, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Import Shape2
		bodyModel[2].setRotationPoint(26F, -2F, -13F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // Import Shape41
		bodyModel[3].setRotationPoint(0F, 5F, 2F);

		bodyModel[4].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // Import Shape41
		bodyModel[4].setRotationPoint(0F, 5F, -13F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 12, 10, 0F); // Import Shape42
		bodyModel[5].setRotationPoint(-2F, -6F, 2F);
		bodyModel[5].rotateAngleZ = 0.15707963F;

		bodyModel[6].addBox(0F, 0F, 0F, 1, 12, 10, 0F); // Import Shape42
		bodyModel[6].setRotationPoint(-2F, -6F, -13F);
		bodyModel[6].rotateAngleZ = 0.15707963F;

		bodyModel[7].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Import Shape43
		bodyModel[7].setRotationPoint(-2F, -8.73333333333334F, 4F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Import Shape43
		bodyModel[8].setRotationPoint(-2F, -8.7F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[9].setRotationPoint(2F, 4F, -4F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[10].setRotationPoint(2F, 4F, -13F);

		bodyModel[11].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[11].setRotationPoint(2F, 4F, 11F);

		bodyModel[12].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[12].setRotationPoint(2F, 4F, 2F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[13].setRotationPoint(-0.26666666666667F, -5F, 2F);
		bodyModel[13].rotateAngleZ = -1.41371669F;

		bodyModel[14].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[14].setRotationPoint(-0.3F, -5F, 11F);
		bodyModel[14].rotateAngleZ = -1.41371669F;

		bodyModel[15].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[15].setRotationPoint(-0.3F, -5F, -13F);
		bodyModel[15].rotateAngleZ = -1.41371669F;

		bodyModel[16].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Shape44
		bodyModel[16].setRotationPoint(-0.3F, -5F, -4F);
		bodyModel[16].rotateAngleZ = -1.41371669F;

		bodyModel[17].addBox(0F, -1F, -1F, 7, 2, 2, 0F); // Import Kierownica
		bodyModel[17].setRotationPoint(13F, -1F, 7F);

		bodyModel[18].addBox(0F, 0F, 0F, 42, 12, 2, 0F); // Import Shape3
		bodyModel[18].setRotationPoint(-16F, -4F, 13F);

		bodyModel[19].addBox(0F, 0F, 0F, 42, 12, 2, 0F); // Import Shape3
		bodyModel[19].setRotationPoint(-16F, -4F, -16F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 8, 31, 0F); // Import Shape4
		bodyModel[20].setRotationPoint(39F, 1F, -16F);

		bodyModel[21].addBox(0F, 0F, 0F, 10, 3, 31, 0F); // Import Shape6
		bodyModel[21].setRotationPoint(44.8F, -1.3F, -16F);
		bodyModel[21].rotateAngleZ = -1.44629617F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 2, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Shape7
		bodyModel[22].setRotationPoint(36F, -3F, -16F);
		bodyModel[22].rotateAngleZ = -0.19198622F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Shape8
		bodyModel[23].setRotationPoint(26F, -4F, -16F);
		bodyModel[23].rotateAngleZ = -0.10471976F;

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 31, 0F); // Import Shape9
		bodyModel[24].setRotationPoint(39F, -0.8F, -16F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Import SlupekLewy
		bodyModel[25].setRotationPoint(15F, -10F, 10F);
		bodyModel[25].rotateAngleX = 0.15707963F;
		bodyModel[25].rotateAngleZ = 1.09955743F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape16
		bodyModel[26].setRotationPoint(14.53F, -10.9F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 30, 2, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Shape17
		bodyModel[27].setRotationPoint(-32F, -3.5F, -16F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 11, 29, 0F); // Import Shape18
		bodyModel[28].setRotationPoint(-3F, -3F, -15F);
		bodyModel[28].rotateAngleZ = 0.12217305F;

		bodyModel[29].addBox(0F, 0F, 0F, 3, 9, 31, 0F); // Import Shape19
		bodyModel[29].setRotationPoint(-32F, -3.66666666666667F, -16F);
		bodyModel[29].rotateAngleZ = -0.18325957F;

		bodyModel[30].addBox(0F, 0F, 0F, 30, 2, 31, 0F); // Import Shape20
		bodyModel[30].setRotationPoint(-32F, -3.7F, -16F);
		bodyModel[30].rotateAngleZ = 0.03490659F;

		bodyModel[31].addBox(0F, 0F, 0F, 3, 4, 31, 0F); // Import Shape21
		bodyModel[31].setRotationPoint(-33.65F, 5F, -16F);
		bodyModel[31].rotateAngleZ = 0.26179939F;

		bodyModel[32].addBox(0F, 0F, 0F, 3, 11, 31, 0F); // Import Shape22
		bodyModel[32].setRotationPoint(-32F, -2F, -16F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 7, 27, 0F); // Import Shape25
		bodyModel[33].setRotationPoint(21F, -4F, -14F);
		bodyModel[33].rotateAngleZ = -0.85521133F;

		bodyModel[34].addBox(0F, 0F, 0F, 5, 4, 27, 0F); // Import Shape26
		bodyModel[34].setRotationPoint(21F, -4F, -14F);

		bodyModel[35].addBox(0F, 0F, 0F, 17, 5, 5, 0F); // Import Shape27
		bodyModel[35].setRotationPoint(0F, 3.6F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Import Shape28
		bodyModel[36].setRotationPoint(13.1333333333334F, 3.6F, -3F);
		bodyModel[36].rotateAngleZ = 0.82030475F;

		bodyModel[37].addBox(0F, 0F, 0F, 4, 5, 10, 0F); // Import Shape29
		bodyModel[37].setRotationPoint(17F, -4F, 2F);
		bodyModel[37].rotateAngleZ = -0.26179939F;

		bodyModel[38].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Shape32
		bodyModel[38].setRotationPoint(25F, -5.66666666666667F, 13F);
		bodyModel[38].rotateAngleZ = 0.36651914F;

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Shape32
		bodyModel[39].setRotationPoint(25F, -5.7F, -15F);
		bodyModel[39].rotateAngleZ = 0.36651914F;

		bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Import LusterkoLewe
		bodyModel[40].setRotationPoint(25F, -6.13333333333335F, 13.5333333333333F);
		bodyModel[40].rotateAngleY = 0.17453293F;

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Import LusterkoPrawe
		bodyModel[41].setRotationPoint(24.5F, -6.1F, -17.8F);
		bodyModel[41].rotateAngleY = -0.15707963F;

		bodyModel[42].addBox(0F, 0F, 0F, 2, 1, 31, 0F); // Import Shape5
		bodyModel[42].setRotationPoint(44F, 8F, -16F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Import Shape10
		bodyModel[43].setRotationPoint(10F, 0F, -1F);
		bodyModel[43].rotateAngleZ = 0.08726646F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 3, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 56
		bodyModel[44].setRotationPoint(-19F, -2F, -16F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 3, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[45].setRotationPoint(-30F, -2F, -16F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[46].setRotationPoint(25F, -2F, -16F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 3, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 59
		bodyModel[47].setRotationPoint(36F, -2F, -16F);

		bodyModel[48].addBox(0F, 0F, -1F, 1, 18, 1, 0F); // Box 61
		bodyModel[48].setRotationPoint(15F, -10F, -11F);
		bodyModel[48].rotateAngleX = -0.15707963F;
		bodyModel[48].rotateAngleZ = 1.09955743F;


		bodyDoorOpenModel = new ModelRendererTurbo[3];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 220, 47, textureX, textureY); // Box 53
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 250, 100, textureX, textureY); // Box 54
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 250, 100, textureX, textureY); // Box 55

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 17, 1, 22, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyDoorOpenModel[0].setRotationPoint(-2.5F, -10.9F, -11F);

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 54
		bodyDoorOpenModel[1].setRotationPoint(-12.5F, -10.9F, 8F);

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F, 0F, -6.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyDoorOpenModel[2].setRotationPoint(-12.5F, -10.9F, -12F);


		leftFrontWheelModel = new ModelRendererTurbo[13];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 450, 450, textureX, textureY); // Box 13
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 484, 450, textureX, textureY); // Box 14
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 450, 480, textureX, textureY); // Box 15
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 450, 459, textureX, textureY); // Box 16
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 488, 459, textureX, textureY); // Box 17
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 18
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 19
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 20
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 21
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 22
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 23
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 24
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 25

		leftFrontWheelModel[0].addShapeBox(-2F, -6F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftFrontWheelModel[0].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[1].addShapeBox(-2F, 5F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftFrontWheelModel[1].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[2].addShapeBox(-5F, -5F, 1F, 10, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftFrontWheelModel[2].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[3].addShapeBox(5F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftFrontWheelModel[3].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[4].addShapeBox(-6F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftFrontWheelModel[4].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[5].addShapeBox(4F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 18
		leftFrontWheelModel[5].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[6].addShapeBox(-5F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 19
		leftFrontWheelModel[6].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[7].addShapeBox(-5F, 2F, -1.5F, 1, 2, 3, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftFrontWheelModel[7].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[8].addShapeBox(4F, 2F, -1.5F, 1, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftFrontWheelModel[8].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[9].addShapeBox(2F, -5F, -1.5F, 2, 1, 3, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F); // Box 22
		leftFrontWheelModel[9].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[10].addShapeBox(-4F, -5F, -1.5F, 2, 1, 3, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F); // Box 23
		leftFrontWheelModel[10].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[11].addShapeBox(-4F, 4F, -1.5F, 2, 1, 3, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F); // Box 24
		leftFrontWheelModel[11].setRotationPoint(32.5F, 4F, 13.5F);

		leftFrontWheelModel[12].addShapeBox(2F, 4F, -1.5F, 2, 1, 3, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F); // Box 25
		leftFrontWheelModel[12].setRotationPoint(32.5F, 4F, 13.5F);


		rightFrontWheelModel = new ModelRendererTurbo[13];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 450, 450, textureX, textureY); // Box 0
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 484, 450, textureX, textureY); // Box 1
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 450, 480, textureX, textureY); // Box 2
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 450, 459, textureX, textureY); // Box 3
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 488, 459, textureX, textureY); // Box 4
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 5
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 6
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 7
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 8
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 9
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 10
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 11
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 12

		rightFrontWheelModel[0].addShapeBox(-2F, -6F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[0].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[1].addShapeBox(-2F, 5F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rightFrontWheelModel[1].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[2].addShapeBox(-5F, -5F, -1F, 10, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightFrontWheelModel[2].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[3].addShapeBox(5F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		rightFrontWheelModel[3].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[4].addShapeBox(-6F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightFrontWheelModel[4].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[5].addShapeBox(4F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 5
		rightFrontWheelModel[5].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[6].addShapeBox(-5F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 6
		rightFrontWheelModel[6].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[7].addShapeBox(-5F, 2F, -1.5F, 1, 2, 3, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightFrontWheelModel[7].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[8].addShapeBox(4F, 2F, -1.5F, 1, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightFrontWheelModel[8].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[9].addShapeBox(2F, -5F, -1.5F, 2, 1, 3, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F); // Box 9
		rightFrontWheelModel[9].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[10].addShapeBox(-4F, -5F, -1.5F, 2, 1, 3, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F); // Box 10
		rightFrontWheelModel[10].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[11].addShapeBox(-4F, 4F, -1.5F, 2, 1, 3, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F); // Box 11
		rightFrontWheelModel[11].setRotationPoint(32.5F, 4F, -14.5F);

		rightFrontWheelModel[12].addShapeBox(2F, 4F, -1.5F, 2, 1, 3, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F); // Box 12
		rightFrontWheelModel[12].setRotationPoint(32.5F, 4F, -14.5F);


		leftBackWheelModel = new ModelRendererTurbo[13];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 450, 450, textureX, textureY); // Box 26
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 484, 450, textureX, textureY); // Box 27
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 450, 480, textureX, textureY); // Box 28
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 450, 459, textureX, textureY); // Box 29
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 488, 459, textureX, textureY); // Box 30
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 31
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 32
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 33
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 34
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 35
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 36
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 37
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 38

		leftBackWheelModel[0].addShapeBox(-2F, -6F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		leftBackWheelModel[0].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[1].addShapeBox(-2F, 5F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[1].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[2].addShapeBox(-5F, -5F, 1F, 10, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftBackWheelModel[2].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[3].addShapeBox(5F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		leftBackWheelModel[3].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[4].addShapeBox(-6F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftBackWheelModel[4].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[5].addShapeBox(4F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		leftBackWheelModel[5].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[6].addShapeBox(-5F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 32
		leftBackWheelModel[6].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[7].addShapeBox(-5F, 2F, -1.5F, 1, 2, 3, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		leftBackWheelModel[7].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[8].addShapeBox(4F, 2F, -1.5F, 1, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftBackWheelModel[8].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[9].addShapeBox(2F, -5F, -1.5F, 2, 1, 3, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F); // Box 35
		leftBackWheelModel[9].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[10].addShapeBox(-4F, -5F, -1.5F, 2, 1, 3, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F); // Box 36
		leftBackWheelModel[10].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[11].addShapeBox(-4F, 4F, -1.5F, 2, 1, 3, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F); // Box 37
		leftBackWheelModel[11].setRotationPoint(-22.5F, 4F, 13.5F);

		leftBackWheelModel[12].addShapeBox(2F, 4F, -1.5F, 2, 1, 3, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F); // Box 38
		leftBackWheelModel[12].setRotationPoint(-22.5F, 4F, 13.5F);


		rightBackWheelModel = new ModelRendererTurbo[13];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 450, 450, textureX, textureY); // Box 96
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 484, 450, textureX, textureY); // Box 97
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 450, 480, textureX, textureY); // Box 98
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 450, 459, textureX, textureY); // Box 99
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 488, 459, textureX, textureY); // Box 100
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 101
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 102
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 475, 459, textureX, textureY); // Box 103
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 461, 459, textureX, textureY); // Box 104
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 105
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 455, 440, textureX, textureY); // Box 106
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 107
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 487, 440, textureX, textureY); // Box 108

		rightBackWheelModel[0].addShapeBox(-2F, -6F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		rightBackWheelModel[0].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[1].addShapeBox(-2F, 5F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightBackWheelModel[1].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[2].addShapeBox(-5F, -5F, -1F, 10, 10, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		rightBackWheelModel[2].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[3].addShapeBox(5F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightBackWheelModel[3].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[4].addShapeBox(-6F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightBackWheelModel[4].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[5].addShapeBox(4F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 101
		rightBackWheelModel[5].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[6].addShapeBox(-5F, -4F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 102
		rightBackWheelModel[6].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[7].addShapeBox(-5F, 2F, -1.5F, 1, 2, 3, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightBackWheelModel[7].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[8].addShapeBox(4F, 2F, -1.5F, 1, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rightBackWheelModel[8].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[9].addShapeBox(2F, -5F, -1.5F, 2, 1, 3, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F); // Box 105
		rightBackWheelModel[9].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[10].addShapeBox(-4F, -5F, -1.5F, 2, 1, 3, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F); // Box 106
		rightBackWheelModel[10].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[11].addShapeBox(-4F, 4F, -1.5F, 2, 1, 3, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F); // Box 107
		rightBackWheelModel[11].setRotationPoint(-22.5F, 4F, -14.5F);

		rightBackWheelModel[12].addShapeBox(2F, 4F, -1.5F, 2, 1, 3, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F); // Box 108
		rightBackWheelModel[12].setRotationPoint(-22.5F, 4F, -14.5F);


		steeringWheelModel = new ModelRendererTurbo[1];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 414, 136, textureX, textureY); // Box 60

		steeringWheelModel[0].addBox(0F, -4F, -4F, 0, 8, 8, 0F); // Box 60
		steeringWheelModel[0].setRotationPoint(12.9F, -1F, 7F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}