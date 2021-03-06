package Domain;

import java.util.ArrayList;
import javafx.scene.image.Image;

public class Character extends Thread{

    private int x;
    private int y;
    private int imgNum;
    private Image image;
    private ArrayList<Image> sprite;
    private ArrayList<Image> sprite2;

    public Character(int x, int y, int imgNum) {
        this.x = x;
        this.y = y;
        this.imgNum = imgNum;
        this.sprite = new ArrayList<Image>();
        this.sprite2 = new ArrayList<Image>();
    }

    public Character() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getImgNum() {
        return imgNum;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    public void setImgNum(int imgNum) {
        this.imgNum = imgNum;
    }

    public ArrayList<Image> getSprite() {
        return sprite;
    }

    public void setSprite(ArrayList<Image> sprite) {
        this.sprite = sprite;
    }

    public ArrayList<Image> getSprite2() {
        return sprite2;
    }

    public void setSprite2(ArrayList<Image> sprite2) {
        this.sprite2 = sprite2;
    }
    
}
