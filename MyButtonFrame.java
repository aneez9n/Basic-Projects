/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventbuttonframe;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author INAM
 */
public class MyButtonFrame extends JFrame
{
    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private JButton cancelButton;
    private JButton okButton;
    
    public MyButtonFrame()
    {
        Container contentPane = getContentPane( );
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program ButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //set the layout manager
        contentPane.setLayout(new FlowLayout());
        
        //create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
        
        ButtonHandler handler = new ButtonHandler();
        cancelButton.addActionListener(handler);
        okButton.addActionListener(handler);
        
        
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
