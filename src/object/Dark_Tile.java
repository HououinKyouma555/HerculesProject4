package object;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Dark_Tile extends SuperObject {
    GamePanel gp;

    public Dark_Tile(GamePanel gp){
        name = "Dark Tile";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/dark.png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        collision = true;
    }
}
