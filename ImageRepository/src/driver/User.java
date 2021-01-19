package driver;

import java.util.Scanner;

public class User {
  
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
    System.out.print("Enter new username:");
    String str= sc.nextLine();
    username=str;
  }
  
  public void setPassword() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter new password:");
    String str= sc.nextLine();
    password=str;
  }
  
  public boolean checkPassword() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter the password for "+this.username+":");
    String str= sc.nextLine();
    return this.password.equals(str);
  }
}
