import javax.swing.*;

import java.awt.*;
public class TemperatureConverterDisplay {

	public void createAndDisplayGUI(){
		//frame
		JFrame frame = new JFrame("Temperature Converter");
		TemperatureConverterControl tcc = new TemperatureConverterControl();
		frame.setSize(1000,500);
		frame.getContentPane().add(tcc.getContent()); //ADD BACK ONCE YOU HAVE MADE IT!!!
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public TemperatureConverterDisplay(){
		createAndDisplayGUI();
	}
}
