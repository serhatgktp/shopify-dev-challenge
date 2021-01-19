package driver;

import java.util.*;

public class Photo {
  
  private String path="";
  private User user;
  
  public Photo(String imagePath, User username){
    path=imagePath;
    user=username;
  }
  
  public Photo(String imagePath){
    path=imagePath;
  }
  
  public String getPath() {
    return path;
  }
  
  public void setUser(User username){
    user=username;
  }
}
