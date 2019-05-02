package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class JumpingCharacter extends Character {
     
    public JumpingCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }
    
    public void setSprite() throws FileNotFoundException{
        ArrayList<Image> sprite = super.getSprite();
        for (int i = 0; i < 3; i++) {
           sprite.add(new Image(new FileInputStream("src/Assets/Jumping"+i+".png")));  
        }
       super.setSprite(sprite);
    }

    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();
        int x1=290, x2=350;
        while (true) {
        
            try {
                
                super.setImage(sprite.get(2));
                Thread.sleep(200);
                this.setY(380);
                Thread.sleep(200);
                this.setY(380);
                
                

                for (int i = 370; i >250 ; i-=20) {
                 super.setImage(sprite.get(0));
                Thread.sleep(200);
                this.setY(i);
                Thread.sleep(200);
                this.setY(i-20); 
                x2-=20;
                }
                
                for (int i = 270; i < 390; i+=20) {
                super.setImage(sprite.get(1));
                Thread.sleep(200);
                this.setY(i);
                Thread.sleep(200);
                this.setY(i+20);  
                x1+=20;
                }

            } 
            catch (InterruptedException ex) {} 
        }
    }
}
