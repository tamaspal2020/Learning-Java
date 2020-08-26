package Chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WestPanel extends JPanel{
private static final long serialVersionUID = 1L;

public WestPanel() {
	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	this.setPreferredSize(new Dimension(100,this.getHeight()));
	int width=this.getWidth();
	this.add(Box.createVerticalStrut(30));  /// creates space between elements
	JButton reset=new JButton("Reset");
	reset.setPreferredSize(new Dimension(width,40));
	
	this.add(reset);
	this.add(Box.createVerticalStrut(30));
	
	JButton start=new JButton("Start");
	Dimension dim=new Dimension(200,40);
	start.setMaximumSize(dim);
	this.add(start);
	
}

/*public void paint(Graphics g) {
	     putting this code here, the second jbutton wont show up
}*/
}
