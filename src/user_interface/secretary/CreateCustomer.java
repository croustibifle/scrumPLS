package user_interface.secretary;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Created by JFormDesigner on Wed May 17 14:53:17 CEST 2017 
 */

import controllers.CreateCustomerController;
import core.Datas;



/**
 * @author Hugo Muller
 */
public class CreateCustomer extends JPanel {
	
	private JLabel label1;
	private JPanel panel1;
	private JLabel label2;
	private JTextField clientNameField;
	private JLabel label3;
	private JTextField cityClientField;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private CreateCustomerController controller;
	
	public CreateCustomer(CreateCustomerController c) {
		controller = c;
		initComponents();
		addListener();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hugo Muller
		label1 = new JLabel();
		panel1 = new JPanel();
		label2 = new JLabel();
		clientNameField = new JTextField();
		label3 = new JLabel();
		cityClientField = new JTextField();
		panel2 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setForeground(Color.white);
		setBackground(new Color(102, 102, 255));

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {20, 624, 0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {91, 241, 149, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("CREATING CUSTOMER");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label1.setForeground(Color.WHITE);
		add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel1 ========
		{
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {69, 298, 165, 82, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 92, 97, 0, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label2 ----
			label2.setText("Client name :");
			label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(label2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(clientNameField, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label3 ----
			label3.setText("City :");
			label3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel1.add(label3, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(cityClientField, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		add(panel1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel2 ========
		{
			panel2.setBackground(new Color(102, 102, 255));
			panel2.setLayout(new GridBagLayout());
			((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {80, 206, 206, 121, 0};
			((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {46, 52, 46, 0};
			((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

			//---- button1 ----
			button1.setText("Create");
			button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel2.add(button1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button2 ----
			button2.setText("Cancel");
			button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel2.add(button2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		add(panel2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 5), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	private void addListener(){
		button1.addActionListener(
				ae ->{
					  controller.submitForm(clientNameField.getText(), cityClientField.getText());
					  });
		button2.addActionListener(
				ae ->{
					  controller.goBack();
					  });
	}
	public void error(){
		JOptionPane.showMessageDialog(this, "The customer already exists", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void validate() {
		JOptionPane.showMessageDialog(this, "The customer has been created", "Validation", JOptionPane.INFORMATION_MESSAGE);
	}
}
