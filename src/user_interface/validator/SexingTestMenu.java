package user_interface.validator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Created by JFormDesigner on Thu May 18 15:12:55 CEST 2017
 */

import controllers.SexingTestController;



/**
 * @author Hugo Muller
 */
public class SexingTestMenu extends JPanel {
	
	private JLabel label1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label2;
	private JComboBox comboBox1;
	private JPanel panel4;
	private JLabel label7;
	private JLabel label8;
	private JLabel label3;
	private JTextField textField1;
	private JLabel label5;
	private JTextField textField3;
	private JLabel label4;
	private JTextField textField2;
	private JLabel label6;
	private JTextField textField4;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private SexingTestController controller;
	
	public SexingTestMenu(SexingTestController c) {
		initComponents();
		controller = c;
		addListener();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hugo Muller
		label1 = new JLabel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label2 = new JLabel();
		comboBox1 = new JComboBox();
		panel4 = new JPanel();
		label7 = new JLabel();
		label8 = new JLabel();
		label3 = new JLabel();
		textField1 = new JTextField();
		label5 = new JLabel();
		textField3 = new JTextField();
		label4 = new JLabel();
		textField2 = new JTextField();
		label6 = new JLabel();
		textField4 = new JTextField();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setBackground(new Color(102, 102, 255));

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {35, 742, 25, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {99, 408, 67, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("Creating Sexing Test");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label1.setForeground(Color.white);
		add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel2 ========
		{
			panel2.setBackground(new Color(102, 102, 255));
			panel2.setLayout(new GridBagLayout());
			((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {64, 568, 0};
			((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {65, 264, 0};
			((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

			//======== panel3 ========
			{
				panel3.setLayout(new GridBagLayout());
				((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {290, 275, 0};
				((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {56, 0};
				((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
				((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

				//---- label2 ----
				label2.setText("Specie :");
				label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
				panel3.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.NONE,
					new Insets(0, 0, 0, 5), 0, 0));
				panel3.add(comboBox1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			panel2.add(panel3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//======== panel4 ========
			{
				panel4.setLayout(new GridBagLayout());
				((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {0, 145, 116, 59, 115, 113, 0, 0};
				((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {35, 86, 99, 0};
				((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
				((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

				//---- label7 ----
				label7.setText("Male");
				label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 7f));
				panel4.add(label7, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label8 ----
				label8.setText("Female");
				label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 7f));
				panel4.add(label8, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label3 ----
				label3.setText("Position :");
				label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
				panel4.add(label3, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 5), 0, 0));
				panel4.add(textField1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label5 ----
				label5.setText("Position :");
				label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
				panel4.add(label5, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 5), 0, 0));
				panel4.add(textField3, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label4 ----
				label4.setText("Value :");
				label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));
				panel4.add(label4, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 0, 5), 0, 0));
				panel4.add(textField2, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 0, 5), 0, 0));

				//---- label6 ----
				label6.setText("Value :");
				label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
				panel4.add(label6, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 0, 5), 0, 0));
				panel4.add(textField4, new GridBagConstraints(5, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 0, 5), 0, 0));
			}
			panel2.add(panel4, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel1 ========
		{
			panel1.setBackground(new Color(102, 102, 255));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {131, 203, 71, 219, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {63, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

			//---- button1 ----
			button1.setText("Create");
			button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
			panel1.add(button1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));

			//---- button2 ----
			button2.setText("Cancel");
			button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 5f));
			panel1.add(button2, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 5), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	private void addListener() {
		button1.addActionListener(
				ae ->{
					  });
		button2.addActionListener(
				ae ->{
					  controller.goBack();
					  });
	}
	
	public void validate() {
		JOptionPane.showMessageDialog(this, "The scrapie test has been created.", "Validation", JOptionPane.INFORMATION_MESSAGE);		
	}
	
	public void error() {
		JOptionPane.showMessageDialog(this, "Please enter a positive integer for position and value.", "Error", JOptionPane.INFORMATION_MESSAGE);
		//b = 0;
	}
}
