package user_interface.secretary;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Created by JFormDesigner on Wed May 17 15:27:04 CEST 2017
 */



/**
 * @author Hugo Muller
 */
public class CreateOrder extends JPanel {
	
	public CreateOrder() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hugo Muller
		label1 = new JLabel();
		panel2 = new JPanel();
		label2 = new JLabel();
		comboBox1 = new JComboBox();
		button3 = new JButton();
		label3 = new JLabel();
		comboBox2 = new JComboBox();
		button4 = new JButton();
		label4 = new JLabel();
		comboBox3 = new JComboBox();
		button5 = new JButton();
		label5 = new JLabel();
		comboBox4 = new JComboBox();
		label6 = new JLabel();
		textField1 = new JTextField();
		panel1 = new JPanel();
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
		((GridBagLayout)getLayout()).columnWidths = new int[] {21, 576, 0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {80, 293, 81, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("CREATING ORDER");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel2 ========
		{
			panel2.setLayout(new GridBagLayout());
			((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {68, 173, 206, 50, 0};
			((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {53, 57, 58, 52, 52, 0};
			((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label2 ----
			label2.setText("Name Client");
			label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
			panel2.add(label2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel2.add(comboBox1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button3 ----
			button3.setText("+");
			panel2.add(button3, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label3 ----
			label3.setText("Category");
			label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
			panel2.add(label3, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel2.add(comboBox2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button4 ----
			button4.setText("+");
			panel2.add(button4, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label4 ----
			label4.setText("Species");
			label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));
			panel2.add(label4, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel2.add(comboBox3, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button5 ----
			button5.setText("+");
			panel2.add(button5, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label5 ----
			label5.setText("Analysis");
			label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
			panel2.add(label5, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel2.add(comboBox4, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label6 ----
			label6.setText("Number of Sample");
			label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
			panel2.add(label6, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 0, 5), 0, 0));
			panel2.add(textField1, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 0, 5), 0, 0));
		}
		add(panel2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel1 ========
		{
			panel1.setBackground(new Color(204, 0, 204));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {98, 188, 174, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {79, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
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
			panel1.add(button2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 5), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hugo Muller
	private JLabel label1;
	private JPanel panel2;
	private JLabel label2;
	private JComboBox comboBox1;
	private JButton button3;
	private JLabel label3;
	private JComboBox comboBox2;
	private JButton button4;
	private JLabel label4;
	private JComboBox comboBox3;
	private JButton button5;
	private JLabel label5;
	private JComboBox comboBox4;
	private JLabel label6;
	private JTextField textField1;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
