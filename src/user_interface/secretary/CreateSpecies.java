package user_interface.secretary;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
/*
 * Created by JFormDesigner on Wed May 17 16:01:57 CEST 2017
 */

import controllers.CreateSpeciesController;
import core.SpecieCategory;



/**
 * @author Maxime Tanguy
 */
public class CreateSpecies extends JPanel {
	
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
	private CreateSpeciesController controller;
	
	public CreateSpecies(CreateSpeciesController c) {
		controller = c;
		initComponents();
		addListener();
	}

	private void initComponents() {
		ArrayList<String> ls = new ArrayList<String>(); 
	    for (SpecieCategory c: controller.getApp().getDatas().getCatList().getListe()) {
	        ls.add(c.getName());
	    }
		panel1 = new JPanel();
		label1 = new JLabel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(ls.toArray()));
		panel4 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setBackground(new Color(102, 102, 255));

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {600, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {450, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

		//======== panel1 ========
		{
			panel1.setBackground(new Color(102, 102, 255));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {600, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {105, 345, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

			//---- label1 ----
			label1.setText("CREATING SPECIES");
			label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 15f));
			label1.setForeground(Color.WHITE);
			panel1.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 0), 0, 0));

			//======== panel2 ========
			{
				panel2.setBackground(new Color(102, 102, 255));
				panel2.setLayout(new GridBagLayout());
				((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {600, 0};
				((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {225, 120, 0};
				((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
				((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

				//======== panel3 ========
				{
					panel3.setBackground(new Color(102, 102, 255));
					panel3.setLayout(new GridBagLayout());
					((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {55, 249, 244, 50, 0};
					((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {110, 105, 0};
					((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
					((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

					//---- label2 ----
					label2.setText("Specie name :");
					label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
					label2.setForeground(Color.WHITE);
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
					label3.setForeground(Color.WHITE);
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
					panel4.setBackground(new Color(102, 102, 255));
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
	
	private void addListener() {
		button1.addActionListener(
				ae ->{
					  controller.submitForm(textField1.getText(), comboBox1.getSelectedItem().toString());
					  });
		button2.addActionListener(
				ae ->{
					  controller.goBack();
					  });
	}
	
	public void error(){
		JOptionPane.showMessageDialog(this, "The specie already exists", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void validate() {
		JOptionPane.showMessageDialog(this, "The specie has been created", "Validation", JOptionPane.INFORMATION_MESSAGE);
	}
}
