package object;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Light_Tile extends SuperObject {
    GamePanel gp;

    public Light_Tile(GamePanel gp){
        name = "Light Tile";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/light.png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        collision = true;
    }
}
