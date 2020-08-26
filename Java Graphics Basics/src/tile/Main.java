package tile;
import tile.Pan;
import tile.InfoPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 1000);
		frame.getContentPane().setBackground(new Color(224,224,224));
		InfoPanel info=new InfoPanel();
		frame.add(info, BorderLayout.EAST);
		Pan panel=new Pan();
		frame.add(panel, BorderLayout.CENTER);		
		frame.validate();
		frame.setVisible(true);  
	}

}
