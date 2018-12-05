package image;

import java.awt.*;
import javafx.scene.paint.Color;

public class BruteRasterImage implements Image{

    private int width;
    private int height;
    private Color[][] colors;
    public BruteRasterImage(Color color, int width, int height){
        this.height=height;
        this.width=width;
        this.createRepresentation();

    }
    public BruteRasterImage(Color[][] colors){

        this.colors=colors.clone();
        this.width=colors.length;
        this.height=colors[0].length;
    }
    public void createRepresentation(){

        Color[][] colors=new Color[width][height];

    }
    public Color getPixelColor(int x, int y){

        return this.colors[x][y];
    }
    public void setPixelColor(Color color, int x, int y){
          this.colors[y][x]=color;

    }
    private void setPixelsColor(Color[][] pixels){

        this.colors=pixels;
    }
    private void setPixelsColor(Color color){

        for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors[0].length;j++){
                this.setPixelColor(color, this.width,this.height);
            }
        }
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return height;
    }
    protected void setWidth(int width){

        this.width=width;

    }
    protected void setHeight(int height){

        this.height=height;

    }



}
