package user_interface.secretary;

import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu May 18 09:25:28 CEST 2017
 */

import controllers.CreateCategoryController;

/**
 * @author Maxime Tanguy
 */
public class CreateCategory extends JPanel {
	private CreateCategoryController c;
	public CreateCategory(CreateCategoryController c) {
		this.c = c;
		initComponents();
		addListener();
		
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Maxime Tanguy
		label1 = new JLabel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label2 = new JLabel();
		textField1 = new JTextField();
		panel3 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setBackground(new Color(204, 0, 204));

		
		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {600, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {75, 425, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("CREATING CATEGORY");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 15f));
		add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
			new Insets(0, 0, 5, 0), 0, 0));

		//======== panel1 ========
		{
			panel1.setBackground(new Color(204, 0, 204));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {601, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {235, 190, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

			//======== panel2 ========
			{
				panel2.setBackground(new Color(204, 0, 204));
				panel2.setLayout(new GridBagLayout());
				((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {55, 205, 205, 50, 0};
				((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {100, 0};
				((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
				((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

				//---- label2 ----
				label2.setText("Name category:");
				label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
				panel2.add(label2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 0, 5), 0, 0));

				//---- textField1 ----
				textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getSize() + 5f));
				panel2.add(textField1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 0, 5), 0, 0));
			}
			panel1.add(panel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 5, 0), 0, 0));

			//======== panel3 ========
			{
				panel3.setBackground(new Color(204, 0, 204));
				panel3.setLayout(new GridBagLayout());
				((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {55, 205, 205, 50, 0};
				((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {100, 0};
				((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
				((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

				//---- button1 ----
				button1.setText("Create");
				button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
				panel3.add(button1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));

				//---- button2 ----
				button2.setText("Cancel");
				button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 5f));
				panel3.add(button2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));
			}
			panel1.add(panel3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Maxime Tanguy
	private JLabel label1;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label2;
	private JTextField textField1;
	private JPanel panel3;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	private void addListener(){
		button1.addActionListener(
				ae ->{
					  c.submitForm(textField1.getText());
					  });
		button2.addActionListener(
				ae ->{
					  c.goBack();
					  });
	}
	
	public void error() {
		JOptionPane.showMessageDialog(this, "The category already exists", "Error", JOptionPane.ERROR_MESSAGE);
		
	}
	
	public void validate() {
		JOptionPane.showMessageDialog(this, "The category has been created", "Validation", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
