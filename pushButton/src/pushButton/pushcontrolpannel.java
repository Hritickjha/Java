package GUI;
import java.awt.;
import java.awt.event.;

import javax.swing.*;

public class PushCounterPanel extends JPanel
{
   private static final long serialVersionUID = 1L;
   private int count;
   private JButton push;
   private JLabel label;
   
   public PushCounterPanel()
   {
      count = 0;

      push = new JButton("Push Me!");
      push.addActionListener((ActionListener) new ButtonListener());
      setBackground(Color.yellow);
      setPreferredSize(new Dimension(300, 40));
   }
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         count++;
         label.setText("Pushes: " + count);
      }
   }
}
   