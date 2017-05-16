package user_interface.validator;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ValidatorMenu extends JPanel {
	private JButton button1;
	private JButton button2;
	private JLabel label1;

	public ValidatorMenu() {
		initComponents();
	}

	private void initComponents() {
		label1 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();	

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {76, 58, 94, 73, 77, 0, 76, 106, 56, 70, 0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {53, 61, 95, 49, 54, 55, 48, 54, 76, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		
		//---- label1 ----
		label1.setText("VALIDATOR");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));
		add(label1, new GridBagConstraints(3, 2, 6, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button1 ----
		button1.setText("Visualize order");
		button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 3f));
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(0, 153, 255));
		add(button1, new GridBagConstraints(9, 5, 2, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 0), 0, 0));
		
		//---- button2 ----
		button2.setText("Create Scrapie test");
		button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 3f));
		button2.setForeground(Color.WHITE);
		button2.setBackground(new Color(0, 153, 255));
		add(button2, new GridBagConstraints(9, 5, 2, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 0), 0, 0));
	}
}
