package driver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageProcessing extends JFrame {
   private static final long serialVersionUID = 1L;
   private final JPanel buttonPanel;
   private ImagePanel imagePanel;   
   private final JButton loadButton;
   
   public ImageProcessing() {
     Photo base = new Photo();
     imagePanel = new ImagePanel(base);
     buttonPanel = new JPanel();
     buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
     loadButton = new JButton("Load Image");
     loadButton.addActionListener(new ButtonHandler());

     buttonPanel.add(loadButton);

     getContentPane().add(imagePanel, BorderLayout.CENTER);
     getContentPane().add(buttonPanel, BorderLayout.NORTH);
  }
   
   private class ButtonHandler implements ActionListener {

     @Override
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadButton) { 
           Photo photo = null;
           JFileChooser fc = new JFileChooser("/home");
           FileNameExtensionFilter filter = new
              FileNameExtensionFilter("JPG, PNG & GIF Images",
                                      "jpg", "gif", "png");
           fc.setFileFilter(filter);
           int ret = fc.showOpenDialog(null);
           if (ret == JFileChooser.APPROVE_OPTION) {
              photo.setImage(fc.getSelectedFile());
           }
           if (photo.getImage() != null) {
              imagePanel.loadImage(photo);
              imagePanel.repaint();
           }
        }
     }
   }
}
