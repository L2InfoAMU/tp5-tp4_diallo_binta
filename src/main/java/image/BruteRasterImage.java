package image;

import java.awt.*;

public class BruteRasterImage implements Image{

    int width;
    int height;
    Color[][] colors;
    public BruteRasterImage(Color color, int width, int height){
        this.height=height;
        this.width=width;

    }
    public BruteRasterImage(Color[][] colors){

        this.colors=colors.clone();
        this.width=colors.length;
        this.height=colors[0].length;
    }

}
