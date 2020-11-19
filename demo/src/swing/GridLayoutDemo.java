package swing;

import  javax.swing.*;
import  java.awt.*;
public class GridLayoutDemo extends javax.swing.JFrame {
  
    public GridLayoutDemo() {
      super("GridLayout Demo");
      Container c = getContentPane();
      c.setLayout( new GridLayout(0,3));
      
      for(int i = 1; i <= 10; i ++)
    	  c.add( new JButton("Button" + i));
      
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      setSize(350,200);
      setVisible(true);
   } // end of init
    
    public static void main(String args[]) {
        new  GridLayoutDemo();
    }

   
}
