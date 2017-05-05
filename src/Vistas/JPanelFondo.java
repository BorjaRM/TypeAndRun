package Vistas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JPanelFondo extends JPanel{

    private BufferedImage image;

    public JPanelFondo() {
       try {                
          image = ImageIO.read(new File("src/imgs/fondo.jpg"));
       } catch (IOException ex) {
    	 
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width=this.getWidth();
        int heigh=this.getHeight();
        g.drawImage(image, 0, 0, width, heigh, this); // see javadoc for more info on the parameters            
    }

}
