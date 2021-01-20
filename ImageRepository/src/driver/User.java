package driver;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
  
  private static ArrayList<String> users;
  private String username="";
  private String password="";
  
  public User() {
    username="";
    password="";
    this.setUsername();
    this.setPassword();
  }
  
  public void setUsername() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter your username:");
    String str= sc.nextLine();
    username=str;
  }
  
  public void setPassword() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter your password:");
    String str= sc.nextLine();
    password=str;
  }
  
  public boolean checkPassword(String str) {
    return this.password.equals(str);
  }
}
