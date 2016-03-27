import javax.swing.*;

import java.awt.*;
public class VotingSystemDisplay {
	public void createAndDisplayGUI(){
		//frame
		JFrame frame = new JFrame("Voting booth");
		VotingSystemControl vsc = new VotingSystemControl();
		frame.setSize(1000,500);
		frame.getContentPane().add(vsc.getContent()); //ADD BACK ONCE YOU HAVE MADE IT!!!
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public VotingSystemDisplay(){
		createAndDisplayGUI();
	}

}
