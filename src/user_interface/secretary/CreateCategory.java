package user_interface.secretary;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateCategory extends JPanel{ 
	
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
		// Generated using JFormDesigner Evaluation license - Maxime Tanguy
		private JPanel panel4;
		private JLabel label2;
		private JPanel panel5;
		private JPanel panel6;
		private JLabel label3;
		private JTextField textField1;
		private JPanel panel7;
		private JButton button2;
		private JButton button3;
		// JFormDesigner - End of variables declaration  //GEN-END:variables
		
		
	public CreateCategory(){
		
	    this.setLayout(new BorderLayout());
	    
	    JLabel title = new JLabel("CATEGORY CREATION",JLabel.NORTH);
	    
	    JPanel entryPanel = new JPanel();
	    entryPanel.setLayout(new GridLayout(2,1));
	    JLabel categoryLabel = new JLabel("Category : ");
	    JTextField newCategory = new JTextField();
	    
	    entryPanel.add(categoryLabel);
	    entryPanel.add(newCategory);
	    
	    JPanel buttonPanel = new JPanel();
	    buttonPanel.setLayout(new GridLayout(2,1));
	    JButton createButton = new JButton("Create");
	    JButton cancelButton = new JButton("Cancel");
	    
	    buttonPanel.add(createButton);
	    buttonPanel.add(cancelButton);
	    
	    this.add(title, BorderLayout.NORTH);
	    this.add(buttonPanel, BorderLayout.SOUTH);
	    this.add(entryPanel, BorderLayout.CENTER);
		

		this.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Maxime Tanguy
		panel4 = new JPanel();
		label2 = new JLabel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		label3 = new JLabel();
		textField1 = new JTextField();
		panel7 = new JPanel();
		button2 = new JButton();
		button3 = new JButton();

		//======== panel4 ========
		{
			panel4.setBackground(new Color(204, 0, 204));

			panel4.setLayout(new GridBagLayout());
			((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {595, 0};
			((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {70, 382, 0};
			((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
			((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

			//---- label2 ----
			label2.setText("CREATE CATEGORY");
			label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 15f));
			panel4.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 0), 0, 0));

			//======== panel5 ========
			{
				panel5.setBackground(new Color(204, 0, 204));
				panel5.setLayout(new GridBagLayout());
				((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {596, 0};
				((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {184, 191, 0};
				((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
				((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

				//======== panel6 ========
				{
					panel6.setBackground(new Color(204, 0, 204));
					panel6.setLayout(new GridBagLayout());
					((GridBagLayout)panel6.getLayout()).columnWidths = new int[] {54, 235, 235, 50, 0};
					((GridBagLayout)panel6.getLayout()).rowHeights = new int[] {108, 0};
					((GridBagLayout)panel6.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
					((GridBagLayout)panel6.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

					//---- label3 ----
					label3.setText("Name Category :");
					label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
					panel6.add(label3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(0, 0, 0, 5), 0, 0));

					//---- textField1 ----
					textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getSize() + 5f));
					panel6.add(textField1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
						new Insets(0, 0, 0, 5), 0, 0));
				}
				panel5.add(panel6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.NONE,
					new Insets(0, 0, 5, 0), 0, 0));

				//======== panel7 ========
				{
					panel7.setBackground(new Color(204, 0, 204));
					panel7.setLayout(new GridBagLayout());
					((GridBagLayout)panel7.getLayout()).columnWidths = new int[] {54, 224, 225, 50, 0};
					((GridBagLayout)panel7.getLayout()).rowHeights = new int[] {112, 0};
					((GridBagLayout)panel7.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
					((GridBagLayout)panel7.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

					//---- button2 ----
					button2.setText("Create");
					button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 5f));
					panel7.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));

					//---- button3 ----
					button3.setText("Cancel");
					button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 5f));
					panel7.add(button3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));
				}
				panel5.add(panel7, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.NONE,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			panel4.add(panel5, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	
}
