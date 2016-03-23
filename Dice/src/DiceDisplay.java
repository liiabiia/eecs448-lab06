import javax.swing.*;

import java.awt.*;
public class DiceDisplay extends JPanel {
	public void createAndDisplayGUI(){
		//frame
		JFrame frame = new JFrame("Dice");
		DiceControl dc = new DiceControl();
		frame.getContentPane().add(dc.getContent());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//label
		JLabel label = new JLabel("Dice");
		frame.getContentPane().add(label);
		
		//make button
		JButton rollButton = new JButton("Roll Button");
		JPanel content = new JPanel();
		content.add(rollButton);
				
		//display window
		frame.getContentPane().add(content);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public DiceDisplay(){
		createAndDisplayGUI();
	}

}
