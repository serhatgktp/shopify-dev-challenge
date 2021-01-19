package driver;

import java.util.*;

public class Photo {
  
  private String path="";
  private User user;
  
  public Photo(String imagePath, User person){
    path=imagePath;
    user=person;
  }
  
  public Photo(String imagePath){
    path=imagePath;
  }
  
  public String getPath() {
    return path;
  }
  
  public void setUser(User person){
    user=person;
  }
}
