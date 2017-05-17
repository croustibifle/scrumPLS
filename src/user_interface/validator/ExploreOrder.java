package user_interface.validator;

import javax.swing.*;
import java.awt.*;

public class ExploreOrder extends JPanel{
	
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Zouaoui Cyprien
	private JScrollPane scrollPane1;
	private JTree tree1;
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label7;
	private JLabel label3;
	private JLabel label11;
	private JLabel label4;
	private JLabel label12;
	private JLabel label5;
	private JLabel label13;
	private JLabel label6;
	private JLabel label15;
	private JLabel label9;
	private JLabel label14;
	private JLabel label8;
	private JLabel label16;
	private JLabel label10;
	private JLabel label17;
	private JButton button1;
	private JFrame j;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	public ExploreOrder(JFrame j) {
		this.j = j;
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Zouaoui Cyprien
		scrollPane1 = new JScrollPane();
		tree1 = new JTree();
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label7 = new JLabel();
		label3 = new JLabel();
		label11 = new JLabel();
		label4 = new JLabel();
		label12 = new JLabel();
		label5 = new JLabel();
		label13 = new JLabel();
		label6 = new JLabel();
		label15 = new JLabel();
		label9 = new JLabel();
		label14 = new JLabel();
		label8 = new JLabel();
		label16 = new JLabel();
		label10 = new JLabel();
		label17 = new JLabel();
		button1 = new JButton();

		//======== this ========
		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {206, 268, 212, 253, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {184, 123, 243, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(tree1);
		}
		add(scrollPane1, new GridBagConstraints(0, 0, 1, 3, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 5), 0, 0));

		//======== panel1 ========
		{
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {62, 193, 51, 70, 59, 45, 51, 53, 52, 49, 46, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {68, 49, 46, 49, 49, 46, 46, 46, 45, 48, 51, 8, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label1 ----
			label1.setText("Explorating Order");
			label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 15f));
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			panel1.add(label1, new GridBagConstraints(0, 0, 11, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label2 ----
			label2.setText("Order :");
			label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));
			panel1.add(label2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label7 ----
			label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 5f));
			panel1.add(label7, new GridBagConstraints(2, 1, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label3 ----
			label3.setText("Customer :");
			label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 6f));
			panel1.add(label3, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label11 ----
			label11.setFont(label11.getFont().deriveFont(label11.getFont().getSize() + 5f));
			panel1.add(label11, new GridBagConstraints(2, 2, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label4 ----
			label4.setText("Category :");
			label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 6f));
			panel1.add(label4, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label12 ----
			label12.setFont(label12.getFont().deriveFont(label12.getFont().getSize() + 5f));
			panel1.add(label12, new GridBagConstraints(2, 3, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label5 ----
			label5.setText("Specie :");
			label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 6f));
			panel1.add(label5, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label13 ----
			label13.setFont(label13.getFont().deriveFont(label13.getFont().getSize() + 5f));
			panel1.add(label13, new GridBagConstraints(2, 4, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label6 ----
			label6.setText("Analysis :");
			label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 6f));
			panel1.add(label6, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label15 ----
			label15.setFont(label15.getFont().deriveFont(label15.getFont().getSize() + 5f));
			panel1.add(label15, new GridBagConstraints(2, 5, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label9 ----
			label9.setText("Number of samples :");
			label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 6f));
			panel1.add(label9, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label14 ----
			label14.setFont(label14.getFont().deriveFont(label14.getFont().getSize() + 5f));
			panel1.add(label14, new GridBagConstraints(2, 6, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label8 ----
			label8.setText("Status :");
			label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 6f));
			panel1.add(label8, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label16 ----
			label16.setFont(label16.getFont().deriveFont(label16.getFont().getSize() + 5f));
			panel1.add(label16, new GridBagConstraints(2, 7, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label10 ----
			label10.setText("% of samples analyzed :");
			label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 6f));
			panel1.add(label10, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label17 ----
			label17.setFont(label17.getFont().deriveFont(label17.getFont().getStyle() | Font.BOLD, label17.getFont().getSize() + 5f));
			label17.setForeground(new Color(0, 102, 204));
			panel1.add(label17, new GridBagConstraints(2, 8, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button1 ----
			button1.setText("Menu");
			button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 3f));
			button1.setBackground(new Color(0, 153, 255));
			button1.setForeground(Color.WHITE);
			panel1.add(button1, new GridBagConstraints(2, 10, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		add(panel1, new GridBagConstraints(1, 0, 3, 3, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
}
