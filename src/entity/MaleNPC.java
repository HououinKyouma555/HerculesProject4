package entity;

import main.GamePanel;

public class MaleNPC extends Entity{
    
    public MaleNPC(GamePanel gp){
        super(gp);

        name = "fatty";
        maxHealth = 100;
        health = maxHealth;

        direction = "down";
        appears = 0;

        getImage();
    }

    public void getImage(){
        down1 = setUp("maleNPC/male");
        up1 = setUp("maleNPC/male");
        right1 = setUp("maleNPC/male");
        left1 = setUp("maleNPC/male");
    }

    public void setDialogue()
    {
        dialogues[0] = "heres 20 bucks, buy me a pack of smokes";
    }

    public void speak()
    {
        super.speak();
    }

}
