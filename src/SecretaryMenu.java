import java.awt.*;
import javax.swing.*;

public class SecretaryMenu {

	public static void main ()
    {
	 JFrame myFrame = new JFrame("Secretary Menu");
     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     myFrame.setLayout(new BorderLayout());
     
     JPanel myPanel = new JPanel();
     myPanel.setLayout(new GridLayout(2,2));

     myPanel.add(new JButton("Order"));
     myPanel.add(new JButton("Species"));
     myPanel.add(new JButton("Customer"));
     myPanel.add(new JButton("Category"));

     myFrame.add(myPanel, BorderLayout.CENTER);

     myFrame.pack();
     myFrame.setVisible(true);
    }
}
