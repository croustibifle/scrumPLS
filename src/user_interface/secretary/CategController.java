package user_interface.secretary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * This class allow to create a functionnal counter using the external listeners
 * 
 * @author Group 4
 * @version 13/10/2016
 */
public class CategController implements ActionListener
{
	private CreateCategory panel;
    
	public CategController(CreateCategory cg)
	{
		panel = cg;
	}
	
    /**
     * action from buttons
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == panel.createButton)// add 1 button
        {
            compteur.plusUn();
        }
        else if(e.getSource() == compteur.myButton2)// reset button
        {
            compteur.reset();
        }
    }
    
}