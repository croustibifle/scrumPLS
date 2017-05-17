package user_interface.secretary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import user_interface.validator.ValidatorMenu;

public class CreateCustomerListener implements ActionListener{
	
	private CreateCustomer cre;
	private JFrame j;
	
	public CreateCustomerListener(CreateCustomer cre, JFrame j)
	{
		this.cre = cre;
		this.j = j;
	}

	public void actionPerformed(ActionEvent e) 
	 {
		if (e.getSource() == cre.getButton1()) 
		{
			String name = cre.getField1().getText();
			String city = cre.getField2().getText();
			
		}
		else if (e.getSource() == cre.getButton2())
		{
			SecretaryMenu sm = new SecretaryMenu(j);
			j.remove(cre);
			 j.add(sm);
			 j.setVisible(true);
			
		}
		 
	 }
}
