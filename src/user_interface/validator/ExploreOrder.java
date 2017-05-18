package user_interface.validator;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import controllers.OrderVizuController;
import core.Customer;
import core.Order;

import java.awt.*;

public class ExploreOrder extends JPanel{
	
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Zouaoui Cyprien
	private JScrollPane scrollPane1;
	private JTree tree1;
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JLabel labelOrder;
	private JLabel label3;
	private JLabel labelCustomer;
	private JLabel label4;
	private JLabel labelCategory;
	private JLabel label5;
	private JLabel labelSpecie;
	private JLabel label9;
	private JLabel labelNbSamples;
	private JLabel label8;
	private JLabel labelStatus;
	private JLabel label10;
	private JLabel labelSampleStat;
	private JButton button1;
	private OrderVizuController controller;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	public ExploreOrder(OrderVizuController c) {
		controller = c;
		initComponents();
		addListener();
	}

	private void initComponents() {
		DefaultMutableTreeNode root = addOrders();
		tree1 = new JTree(root);
		tree1.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		scrollPane1 = new JScrollPane();
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		labelOrder = new JLabel();
		label3 = new JLabel();
		labelCustomer = new JLabel();
		label4 = new JLabel();
		labelCategory = new JLabel();
		label5 = new JLabel();
		labelSpecie = new JLabel();
		label9 = new JLabel();
		labelNbSamples = new JLabel();
		label8 = new JLabel();
		labelStatus = new JLabel();
		label10 = new JLabel();
		labelSampleStat = new JLabel();
		button1 = new JButton();
		

		//======== this ========
				setBackground(new Color(102, 102, 255));
				panel1.setBackground(new Color(102, 102, 255));
				setPreferredSize(new Dimension(800, 600));

				setLayout(new GridBagLayout());
				((GridBagLayout)getLayout()).columnWidths = new int[] {283, 268, 212, 144, 0};
				((GridBagLayout)getLayout()).rowHeights = new int[] {195, 123, 243, 0};
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
					((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {62, 193, 51, 70, 59, 23, 51, 53, 52, 49, 11, 0};
					((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {68, 49, 46, 49, 49, 46, 46, 46, 45, 48, 51, 8, 0};
					((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
					((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

					//---- label1 ----
					label1.setText("Explorating Orders");
					label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 15f));
					label1.setHorizontalAlignment(SwingConstants.CENTER);
					label1.setForeground(Color.white);
					panel1.add(label1, new GridBagConstraints(0, 0, 11, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 0), 0, 0));

					//---- label2 ----
					label2.setText("Order :");
					label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));
					label2.setForeground(Color.white);
					label2.setVisible(false);
					panel1.add(label2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- labelOrder ----
					labelOrder.setFont(labelOrder.getFont().deriveFont(labelOrder.getFont().getSize() + 5f));
					labelOrder.setForeground(Color.WHITE);
					panel1.add(labelOrder, new GridBagConstraints(2, 1, 6, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- label3 ----
					label3.setText("Customer :");
					label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 6f));
					label3.setForeground(Color.white);
					label3.setVisible(false);
					panel1.add(label3, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- labelCustomer ----
					labelCustomer.setFont(labelCustomer.getFont().deriveFont(labelCustomer.getFont().getSize() + 5f));
					labelCustomer.setForeground(Color.WHITE);
					panel1.add(labelCustomer, new GridBagConstraints(2, 2, 6, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- label4 ----
					label4.setText("Category :");
					label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 6f));
					label4.setForeground(Color.white);
					label4.setVisible(false);
					panel1.add(label4, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- labelCategory ----
					labelCategory.setFont(labelCategory.getFont().deriveFont(labelCategory.getFont().getSize() + 5f));
					labelCategory.setForeground(Color.WHITE);
					panel1.add(labelCategory, new GridBagConstraints(2, 3, 6, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- label5 ----
					label5.setText("Specie :");
					label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 6f));
					label5.setForeground(Color.white);
					label5.setVisible(false);
					panel1.add(label5, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- labelSpecie ----
					labelSpecie.setFont(labelSpecie.getFont().deriveFont(labelSpecie.getFont().getSize() + 5f));
					labelSpecie.setForeground(Color.WHITE);
					panel1.add(labelSpecie, new GridBagConstraints(2, 4, 6, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- label9 ----
					label9.setText("Number of samples :");
					label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 6f));
					label9.setForeground(Color.white);
					label9.setVisible(false);
					panel1.add(label9, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- labelNbSamples ----
					labelNbSamples.setFont(labelNbSamples.getFont().deriveFont(labelNbSamples.getFont().getSize() + 5f));
					labelNbSamples.setForeground(Color.WHITE);
					panel1.add(labelNbSamples, new GridBagConstraints(2, 5, 6, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- label8 ----
					label8.setText("Status :");
					label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 6f));
					label8.setForeground(Color.white);
					label8.setVisible(false);
					panel1.add(label8, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- labelStatus ----
					labelStatus.setFont(labelStatus.getFont().deriveFont(labelStatus.getFont().getSize() + 5f));
					labelStatus.setForeground(Color.WHITE);
					panel1.add(labelStatus, new GridBagConstraints(2, 6, 6, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- label10 ----
					label10.setText("% of samples analyzed :");
					label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 6f));
					label10.setForeground(Color.white);
					label10.setVisible(false);
					panel1.add(label10, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- labelSampleStat ----
					labelSampleStat.setFont(labelSampleStat.getFont().deriveFont(labelSampleStat.getFont().getSize() + 5f));
					labelSampleStat.setForeground(Color.WHITE);
					panel1.add(labelSampleStat, new GridBagConstraints(2, 7, 6, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));

					//---- button1 ----
					button1.setText("Return to Menu");
					button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 3f));
					panel1.add(button1, new GridBagConstraints(2, 9, 3, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5), 0, 0));
				}
				add(panel1, new GridBagConstraints(1, 0, 3, 3, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
				// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	private void addListener(){
		button1.addActionListener(
				ae ->{
					  controller.goBack();
				});
		tree1.addTreeSelectionListener(
				ae ->{
					DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree1.getLastSelectedPathComponent();
					if (node != null){
						if (node.getUserObject() instanceof Order){
							Order o = (Order) node.getUserObject();
							displayFields(o);
						}
					}
				});
	}
	

	public DefaultMutableTreeNode addOrders(){
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Customer list");
		for(Customer c : controller.getApp().getDatas().getCustList().getListe()){
			DefaultMutableTreeNode customer = new DefaultMutableTreeNode(c);
			for(Order o : c.getOrders()){
				DefaultMutableTreeNode order = new DefaultMutableTreeNode(o);
				customer.add(order);
			}
			if(c.getOrders().size() > 0)
				root.add(customer);
		}
		return(root);
	}
	
	private void displayFields(Order o) {
		setFieldsVisible();
		labelOrder.setText(o.toString());
		labelCustomer.setText(o.getCustomer().getName());
		labelCategory.setText(o.getCategory().getName());
		labelSpecie.setText(o.getSpecies().getName());
		labelNbSamples.setText(String.valueOf(o.getSamples().size()));
		labelStatus.setText(o.getStatus().name());
	}
	
	private void setFieldsVisible(){
		label2.setVisible(true);
		label3.setVisible(true);
		label4.setVisible(true);
		label5.setVisible(true);
		label9.setVisible(true);
		label8.setVisible(true);
		label10.setVisible(true);
	}
}
