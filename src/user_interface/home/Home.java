package user_interface.home;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.HomeController;

public class Home extends JPanel{
	
	private JLabel label3;
	private JLabel label1;
	private JTextField loginField;
	private JLabel label2;
	private JTextField passwordField;
	private JButton button1;
	private HomeController controller;

	public Home(HomeController c) {
		initComponents();
		controller = c;
		addListener();
	}

	private void initComponents() {
		label3 = new JLabel();
		label1 = new JLabel();
		loginField = new JTextField();
		label2 = new JLabel();
		passwordField = new JPasswordField ();
		button1 = new JButton();

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {76, 58, 94, 73, 77, 0, 76, 106, 56, 70, 0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {53, 61, 95, 49, 54, 55, 48, 54, 76, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

		//---- label3 ----
		label3.setText("GENINDEXE LABORATORY");
		label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 10f));
		add(label3, new GridBagConstraints(3, 2, 6, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- label1 ----
		label1.setText("Login :");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 3f));
		add(label1, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));
		add(loginField, new GridBagConstraints(4, 3, 4, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- label2 ----
		label2.setText("Password :");
		label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 3f));
		add(label2, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));
		add(passwordField, new GridBagConstraints(4, 5, 4, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button1 ----
		button1.setText("Login");
		button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 3f));
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(0, 153, 255));
		add(button1, new GridBagConstraints(9, 5, 2, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 0), 0, 0));
	}
	

	private void addListener(){
		button1.addActionListener(
				ae ->{
					  controller.submitForm();
					  });
	}
	
	public void error(){
		JOptionPane.showMessageDialog(this, "Les identifiants sont incorrects", "Error", JOptionPane.ERROR_MESSAGE);
	}

	public String getLoginField() {
		return loginField.getText();
	}

	public String getPasswordField() {
		return passwordField.getText();
	}
	
	
}
