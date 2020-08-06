package Chess;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;

import Chess.NorthPanel;
public class Frame {

	public static void main(String[] args) {
		drawpanels();
	}
public static void drawpanels() {
	JFrame board=new JFrame("Board");
	board.setLayout(new BorderLayout());
	board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	board.setSize(1000, 1000);
	board.getContentPane().setBackground(new Color(224,224,224));
	
	NorthPanel p1=new NorthPanel();
	SouthPanel p2=new SouthPanel();	
	CenterPanel p3=new CenterPanel();
	WestPanel p4=new WestPanel();
	
	JPanel p5=new JPanel();
	
	p4.setBackground(Color.green);
	p5.setBackground(Color.red);
		
	board.add(p1, BorderLayout.NORTH);
	board.add(p2, BorderLayout.SOUTH);
	JPanel cent=new JPanel();    // adding p3 simply to the borderlayout center: nothing happens with the size of p3, we need to put p3 first in another jpanel with another layout type  in this case Flowlayout
	cent.setLayout(new FlowLayout());
	cent.add(p3);
	board.add(cent, BorderLayout.CENTER);
	board.add(p4, BorderLayout.WEST);
	
	p3.setBounds(p3.getParent().getWidth()-100, p3.getParent().getHeight()-100, 100, 100);
	p3.setSize(100, 100);
	p3.setMinimumSize(new Dimension(100,100));
	p3.setBounds(new Rectangle(100,100,100,100));
	p3.setAlignmentX(100);
	p3.setAlignmentY(100);
	p3.setPreferredSize(new Dimension(500,500));
	
	board.add(p5, BorderLayout.EAST);
	board.validate();
	
	board.setVisible(true);   /// ide a végére kell tenni
	
	}

}
