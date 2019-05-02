package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class RunningCharacter extends Character {

    public RunningCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
        setSprite2();
    }
    
    public void setSprite() throws FileNotFoundException{
        ArrayList<Image> sprite = super.getSprite();
         for (int i = 0; i <20; i++) {
           for(int x = 0; x < 8; x++){
                sprite.add(new Image(new FileInputStream("src/Assets/Running"+x+".png")));
            } 
        }
        

        
        super.setSprite(sprite);

      
        
    }
    public void setSprite2() throws FileNotFoundException{
        ArrayList<Image> sprite2= super.getSprite2();
       for (int i = 0; i <20; i++) {
           for(int x = 1; x < 8; x++){
                sprite2.add(new Image(new FileInputStream("src/Assets/image ("+x+").png")));
            } 
        }
        super.setSprite2(sprite2);
    }

    @Override
    public void run() {
        
        
        ArrayList<Image> sprite = super.getSprite();
        ArrayList<Image> sprite2 = super.getSprite2();

        
        while (true) {
            int count=0,  x1=300, x2=110;
            try {
                for (int i = 0; i < 790; i+=20) {
                    super.setImage(sprite.get(count));
                super.setX(i);
                Thread.sleep(100);
                super.setX(i+10);
                Thread.sleep(100);
                count++;
                }
                
                for (int i = 790; i > 0; i-=20) {
                super.setImage(sprite2.get(count));
                super.setX(i);
                Thread.sleep(100);
                super.setX(i-10);
                Thread.sleep(100);
                count++;
                }
                
            } 
            catch (InterruptedException ex) {}
        }
        
    }
}
