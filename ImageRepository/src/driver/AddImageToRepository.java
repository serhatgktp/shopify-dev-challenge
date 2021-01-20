package driver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class AddImageToRepository {
  
  public void addImage() {
    User user = new User();
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter the path of the image:");
    String path= sc.nextLine();
    Photo image = new Photo(path, user);
    if(image.getImage()!=null) {
      String name = "";
      while(Photo.imageNames.contains(name)) {
        System.out.print("Please enter the path of the image:");
        name = sc.nextLine();
        if(Photo.imageNames.contains(name)) {System.out.println("An image with this name already"
            + " exists in the repository. Please choose a new name.");}
      }
      String xtn="";
      while(!(xtn.equals("png") || (xtn.equals("jpg")) || (xtn.equals("jpeg")))) {
        System.out.print("Please enter the desired file extension:");
        xtn = sc.nextLine();
        if(!(xtn.equals("png") || (xtn.equals("jpg")) || (xtn.equals("jpeg")))) {
          System.out.println("Please enter a valid extension. (JPG, JPEG, PNG)");
        }
      }
      try {
        BufferedImage bi = image.getImage();
        File outputfile = new File(name+"."+xtn);
        ImageIO.write(bi, xtn, outputfile);
      }
      catch (IOException e) {
      }
    }
  }

}
