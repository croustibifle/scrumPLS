package user_interface.secretary;

import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed May 17 16:01:57 CEST 2017
 */



/**
 * @author Maxime Tanguy
 */
public class CreateSpecies extends JPanel {
	
	public CreateSpecies() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Maxime Tanguy
		panel1 = new JPanel();
		label1 = new JLabel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		comboBox1 = new JComboBox();
		panel4 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setBackground(new Color(204, 0, 204));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {600, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {450, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

		//======== panel1 ========
		{
			panel1.setBackground(new Color(204, 0, 204));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {600, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {105, 345, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

			//---- label1 ----
			label1.setText("CREATING SPECIES");
			label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 15f));
			panel1.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 0), 0, 0));

			//======== panel2 ========
			{
				panel2.setBackground(new Color(204, 0, 204));
				panel2.setLayout(new GridBagLayout());
				((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {600, 0};
				((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {225, 120, 0};
				((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
				((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

				//======== panel3 ========
				{
					panel3.setBackground(new Color(204, 0, 204));
					panel3.setLayout(new GridBagLayout());
					((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {55, 249, 244, 50, 0};
					((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {110, 105, 0};
					((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
					((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

					//---- label2 ----
					label2.setText("Name new specie :");
					label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
					panel3.add(label2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- textField1 ----
					textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getSize() + 5f));
					panel3.add(textField1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- label3 ----
					label3.setText("Specie category :");
					label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
					panel3.add(label3, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
						new Insets(0, 0, 0, 5), 0, 0));

					//---- comboBox1 ----
					comboBox1.setFont(comboBox1.getFont().deriveFont(comboBox1.getFont().getSize() + 6f));
					panel3.add(comboBox1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
						new Insets(0, 0, 0, 5), 0, 0));
				}
				panel2.add(panel3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 0), 0, 0));

				//======== panel4 ========
				{
					panel4.setBackground(new Color(204, 0, 204));
					panel4.setLayout(new GridBagLayout());
					((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {55, 249, 245, 50, 0};
					((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {79, 0};
					((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
					((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

					//---- button1 ----
					button1.setText("Create");
					button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
					panel4.add(button1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));

					//---- button2 ----
					button2.setText("Cancel");
					button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 5f));
					panel4.add(button2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));
				}
				panel2.add(panel4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			panel1.add(panel2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Maxime Tanguy
	private JPanel panel1;
	private JLabel label1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JComboBox comboBox1;
	private JPanel panel4;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
