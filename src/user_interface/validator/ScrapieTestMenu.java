package user_interface.validator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Created by JFormDesigner on Wed May 17 15:44:57 CEST 2017
 */

import controllers.ScrapieTestController;
import core.Specie;
import core.SpecieCategory;



/**
 * @author Hugo Muller
 */
public class ScrapieTestMenu extends JPanel {
	
	private JLabel label4;
	private JPanel panel1;
	private JLabel label1;
	private JComboBox comboBox1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private ScrapieTestController controller;
	
	public ScrapieTestMenu(ScrapieTestController c) {
		controller = c;
		initComponents();
		addListener();
	}

	private void initComponents() {
		
		ArrayList<String> ls = new ArrayList<String>(); 
	    for (SpecieCategory c: controller.getApp().getDatas().getCatList().getListe()) {
	        for (Specie s : c.getSpecies()){
	        	ls.add(s.getName());
	        }
	    }
	    
		label4 = new JLabel();
		panel1 = new JPanel();
		label1 = new JLabel();
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(ls.toArray()));
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		panel2 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setBackground(new Color(102, 0, 102));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {0, 607, 0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {104, 299, 79, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//---- label4 ----
		label4.setText("Creating Scrapie Test");
		label4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(label4, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel1 ========
		{
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {93, 228, 211, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {34, 75, 81, 68, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label1 ----
			label1.setText("Specie :");
			label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
			panel1.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(comboBox1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label2 ----
			label2.setText("Position :");
			label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
			panel1.add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(textField1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label3 ----
			label3.setText("Value :");
			label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
			panel1.add(label3, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 0, 5), 0, 0));
			panel1.add(textField2, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//======== panel2 ========
		{
			panel2.setBackground(new Color(204, 0, 204));
			panel2.setLayout(new GridBagLayout());
			((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {68, 238, 244, 51, 0};
			((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {78, 0};
			((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

			//---- button1 ----
			button1.setText("Create");
			button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
			panel2.add(button1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));

			//---- button2 ----
			button2.setText("Cancel");
			button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 5f));
			panel2.add(button2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));
		}
		add(panel2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 5), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	private void addListener() {
		button1.addActionListener(
				ae ->{
					  controller.submitForm(comboBox1.getSelectedItem().toString(), Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
					  });
		button2.addActionListener(
				ae ->{
					  controller.goBack();
					  });
	}
	
	public void validate() {
		JOptionPane.showMessageDialog(this, "The scrapie test has been created", "Validation", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
