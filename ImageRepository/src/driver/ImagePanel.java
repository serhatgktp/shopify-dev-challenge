package driver;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.io.*;
import java.net.URL;

public class ImagePanel extends JPanel{
  
  private BufferedImage image;
  
  public ImagePanel(Photo photo) {
    try {
        image = ImageIO.read(new File(photo.getPath()));
    } catch (IOException e) {
      System.out.println("An image could not be found at path: " + photo.getPath());
    }
  }
  
  public ImagePanel(String url) {
    BufferedImage img = null;
    try {
      URL link = new URL(url);
      img = ImageIO.read(link);
      image=img;
    } catch (IOException e) {
      System.out.println("An image could not be found at URL: " + url);
    }
  }
  
  public BufferedImage getImage() {
    return image;
 }
  
  public void loadImage(Photo photo) {
    try {
      image = ImageIO.read(new File(photo.getPath()));
    } catch (IOException e) {
      System.out.println("An image could not be found at path: " + photo.getPath());
    }
 }
  
  
  
}
