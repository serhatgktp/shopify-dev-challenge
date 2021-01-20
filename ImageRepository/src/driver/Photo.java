package driver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;

public class Photo {
  
  public static ArrayList<String> imageNames;
  
  private String path="";
  private BufferedImage image;
  private User user;
  
  public Photo(String imagePath, User person){
    path=imagePath;
    user=person;
    try {
      File pic = new File(path);
      if(ImageIO.read(pic)!=null) {
        image=ImageIO.read(pic);
      }
      else {System.out.println("Selected file is not an image.");
            image=null;
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public Photo(String imagePath){
    path=imagePath;
    user=null;
    try {
      File pic = new File(path);
      if(ImageIO.read(pic)!=null) {
        image=ImageIO.read(pic);
      }
      else {System.out.println("Selected file is not an image.");
            image=null;
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  
  public Photo(){
    user=null;
    image=null;
  }
  
  public String getPath() {
    return path;
  }
  
  public void setUser(User person){
    user=person;
  }
  
  public void setImage(File pic){
    try {
      if(ImageIO.read(pic)!=null) {
        image=ImageIO.read(pic);
      }
      else {System.out.println("Selected file is not an image.");}
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public BufferedImage getImage() {
    return image;
  }
}
