/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fullscreen extends Window 
{
  private Button button;

  public fullscreen() 
  {
    super(new Frame());
    button = new Button("Close");
    button.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent e) 
      {
        System.exit(0);
      }
    });

    setLayout(new FlowLayout());
    add(button);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds(0,0,screenSize.width, screenSize.height);
  }

  public static void main(String[] args) 
  {
    // This will take over your whole screen tested and works in my:
    // Fedora 12/13/14
    // CentOS 5.0
    // if this works for you, in other platforms, please leave a comments which OS it worked.
    // happy coding!
    new fullscreen().setVisible(true);
  }

}