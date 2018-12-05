package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {
    private int width;
    private int height;
    private Color[][] colors;

    public PaletteRasterImage(Color color, int width, int height){

        this.width=width;
        this.height=height;
    }
    public PaletteRasterImage(Color[][] pixels){

    }
}
