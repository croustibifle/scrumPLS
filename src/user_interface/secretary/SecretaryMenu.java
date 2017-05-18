package user_interface.secretary;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

/*
 * Created by JFormDesigner on Wed May 17 15:25:15 CEST 2017
 */
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.SecretaryMenuController;



/**
 * @author Hugo Muller
 */
public class SecretaryMenu extends JPanel {
	
	private JLabel label1;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private SecretaryMenuController controller;
	
	public SecretaryMenu(SecretaryMenuController c) {
		initComponents();
		controller = c;
		addListener();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hugo Muller
		label1 = new JLabel();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();

		//======== this ========
		setBackground(new Color(102, 0, 102));

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {95, 578, 21, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {107, 276, 53, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("MENU");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label1.setForeground(Color.WHITE);
		add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel1 ========
		{
			panel1.setBackground(new Color(102, 0, 102));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {291, 279, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {137, 132, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

			//---- button1 ----
			button1.setText("Order");
			button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button2 ----
			button2.setText("Species");
			button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- button3 ----
			button3.setText("Customer");
			button3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(button3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));

			//---- button4 ----
			button4.setText("Category");
			button4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(button4, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));
		
		//---- button5 ----
		button5.setText("Log out");
		add(button5, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.NONE,
			new Insets(0, 0, 0, 5), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	private void addListener(){
		button1.addActionListener(
				ae ->{
					  controller.goCreateOrder();
					  });
		button2.addActionListener(
				ae ->{
					  controller.goCreateSpecies();
					  });
		button3.addActionListener(
				ae ->{
					  controller.goCreateCustomer();
					  });
		button4.addActionListener(
				ae ->{
					  controller.goCreateCategory();
					  });
		button5.addActionListener(
				ae ->{
					  controller.goBack();
					  });
	}

}
