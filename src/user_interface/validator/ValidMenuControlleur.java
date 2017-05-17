package user_interface.validator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ValidMenuControlleur implements ActionListener{
	
	private ValidatorMenu val;
	private JFrame j;
	
	public ValidMenuControlleur(ValidatorMenu val, JFrame j)
	{
		this.val = val;
		this.j = j;
	}
	
	 public void actionPerformed(ActionEvent e) 
	 {
		 if (e.getSource() == val.getButton2()) 
		 {
			 ExploreOrder x = new ExploreOrder(j);
			 j.remove(val);
			 j.add(x);
			 j.setVisible(true);
		 }
		 else if (e.getSource() == val.getButton3()) 
		 {
			 ScrapieTestMenu x = new ScrapieTestMenu();
			 j.remove(val);
			 j.add(x);
			 j.setVisible(true);
		 }
	 }
}