package main;

import entity.BlueBoy;
import entity.Chicken;
import entity.Lion;
import entity.NPC_OldMan;
import entity.Shinigami;
import object.OBJ_Door;
import entity.FemaleNPC;
import entity.MaleNPC;
import entity.FemaleNPC2;
import entity.MaleNPC2;

public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    // Sets the positions of various objects.
    public void setObject(){
        gp.obj[0] = new OBJ_Door(gp);
        gp.obj[0].worldX = gp.tileSize*10;
        gp.obj[0].worldY = gp.tileSize*6;

    }

    public void setNPC(){
        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize*21;
        gp.npc[0].worldY = gp.tileSize*21;

        gp.npc[1] = new Chicken(gp);
        gp.npc[1].worldX = gp.tileSize*27;
        gp.npc[1].worldY = gp.tileSize*21;

        gp.npc[2] = new FemaleNPC(gp);
        gp.npc[2].worldX = gp.tileSize*9;
        gp.npc[2].worldY = gp.tileSize*7;

        gp.npc[3] = new MaleNPC(gp);
        gp.npc[3].worldX = gp.tileSize*19;
        gp.npc[3].worldY = gp.tileSize*15;

        gp.npc[4] = new MaleNPC2(gp);
        gp.npc[4].worldX = gp.tileSize*35;
        gp.npc[4].worldY = gp.tileSize*6;

        gp.npc[5] = new FemaleNPC2(gp);
        gp.npc[5].worldX = gp.tileSize*40;
        gp.npc[5].worldY = gp.tileSize*15;
    }

    public void setEnemy(){
        gp.enemy[0] = new BlueBoy(gp);
        gp.enemy[0].worldX = gp.tileSize*25;
        gp.enemy[0].worldY = gp.tileSize*21;

        gp.enemy[1] = new NPC_OldMan(gp);
        gp.enemy[1].worldX = gp.tileSize*12;
        gp.enemy[1].worldY = gp.tileSize*11;

        gp.enemy[2] = new Lion(gp);
        gp.enemy[2].worldX = gp.tileSize*32;
        gp.enemy[2].worldY = gp.tileSize*3;

        gp.enemy[3] = new Shinigami(gp);
    }

}
