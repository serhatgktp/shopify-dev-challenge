package driver;

import javax.swing.JFrame;

public class UI {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      ImageProcessing ip = new ImageProcessing();
      ip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ip.setSize(450, 300);
      ip.setVisible(true);

  }

}
