import javax.swing.*;

import java.awt.*;
public class DiceDisplay extends JPanel {
	public void createAndDisplayGUI(){
		//frame
		JFrame frame = new JFrame("Dice");
		DiceControl dc = new DiceControl();
		frame.setSize(1000,500);
		frame.getContentPane().add(dc.getContent());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public DiceDisplay(){
		createAndDisplayGUI();
	}

}
