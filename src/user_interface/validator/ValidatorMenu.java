package user_interface.validator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.ValidMenuController;
/*
 * Created by JFormDesigner on Tue May 16 17:10:57 CEST 2017
 */

/**
 * @author Hugo Muller
 */
public class ValidatorMenu extends JPanel {
	
	private JLabel label1;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel panel2;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private ValidMenuController controller;
	
	public ValidatorMenu(ValidMenuController c) {
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

		//======== this ========
		setBackground(new Color(102, 0, 102));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"                  ", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM), getBorder())); 
		addPropertyChangeListener(new java.beans.PropertyChangeListener(){
			public void propertyChange(java.beans.PropertyChangeEvent e){
				if("border".equals(e.getPropertyName()))
					throw new RuntimeException();
				}
			});

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {0, 236, 264, 256, 17, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {133, 255, 114, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("Validator");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label1.setBackground(Color.black);
		label1.setForeground(Color.white);
		add(label1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));
		
		//---- button1 ----
		button1.setText("Log out");
		add(button1, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));
		
		//======== panel1 ========
		{
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {33, 302, 107, 276, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {248, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

			//---- button2 ----
			button2.setText("   Visualize Order   ");
			button2.setMaximumSize(new Dimension(160, 90));
			button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 0, 5), 100, 80));

			//---- button3 ----
			button3.setText("Create Scrapie Test");
			button3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(button3, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 0, 0), 100, 80));
		}
		add(panel1, new GridBagConstraints(1, 1, 3, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	
	private void addListener(){
		button3.addActionListener(
				ae ->{
					  controller.goScrapieTest();
					  });
		button2.addActionListener(
				ae ->{
					  controller.goOrderVizualisation();
					  });
		button1.addActionListener(
				ae ->{
					  controller.goBack();
					  });
	}
}
