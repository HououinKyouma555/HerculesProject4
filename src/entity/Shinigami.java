package entity;

import main.GamePanel;

public class Shinigami extends Entity{
    
    public Shinigami(GamePanel gp){
        super(gp);

        name = "Ryuk";
        maxHealth = 100;
        health = maxHealth;

        direction = "left";
        appears = 0;

        getImage();
    }

    public void getImage(){
        left1 = setUp("GrimReaper/GrimReaper_left");
        right1 = setUp("GrimReaper/GrimReaper_right");
        up1 = setUp("GrimReaper/GrimReaper_left");
        down1 = setUp("GrimReaper/GrimReaper_right");
    }
}
