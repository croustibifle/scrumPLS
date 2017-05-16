package user_interface.validator;
import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue May 16 15:59:14 CEST 2017
 */



/**
 * @author Hugo Muller
 */
public class Validator extends JPanel {
	public Validator() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hugo Muller
		label1 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[121,fill]" +
			"[182,fill]" +
			"[130,fill]",
			// rows
			"[68]" +
			"[192]" +
			"[43]"));

		//---- label1 ----
		label1.setText("Validator");
		label1.setMaximumSize(new Dimension(150, 14));
		label1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(label1, "cell 1 0,alignx center,growx 0");

		//---- button1 ----
		button1.setText("Visualize Order");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button1.setPreferredSize(new Dimension(120, 80));
		button1.setMaximumSize(new Dimension(180, 80));
		add(button1, "cell 0 1 3 1");

		//---- button2 ----
		button2.setText("Create Scrapie Test");
		button2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button2.setPreferredSize(new Dimension(120, 80));
		button2.setMaximumSize(new Dimension(180, 80));
		add(button2, "cell 0 1 3 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hugo Muller
	private JLabel label1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
