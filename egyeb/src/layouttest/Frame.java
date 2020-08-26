package layouttest;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;

import layouttest.CenterPanel;
public class Frame {

	public static void main(String[] args) {
		drawpanels();
	}
public static void drawpanels() {
	JFrame board=new JFrame("Board");
	board.setLayout(new BorderLayout());
	board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	board.setSize(1000, 1000);
	///board.setUndecorated(true);
	board.getContentPane().setBackground(new Color(224,224,224));
	
	
	CenterPanel p3=new CenterPanel();
	
	

	board.add(p3, BorderLayout.CENTER);
	
	board.validate();
	
	board.setVisible(true);   /// ide a végére kell tenni
	
	}

}
