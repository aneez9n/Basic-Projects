package eventbuttonframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author INAM
 */
public class ButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent event) 
    {
        JButton clickedButton = (JButton) event.getSource();
        JRootPane rootPane = clickedButton.getRootPane();
        JFrame     frame    = (JFrame) rootPane.getParent();
        String  buttonText = clickedButton.getText();
        frame.setTitle("You clicked " + buttonText);
        
        
        Container C = frame.getContentPane();
        if(buttonText.equalsIgnoreCase("ok"))
        {
            C.setBackground(Color.YELLOW);
            
        }
        else if(buttonText.equalsIgnoreCase("CANCEL"))
        {
             C.setBackground(Color.MAGENTA);
        }
    }

    
}
