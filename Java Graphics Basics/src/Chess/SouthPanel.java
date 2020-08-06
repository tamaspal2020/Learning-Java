package Chess;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SouthPanel extends JPanel{
private static final long serialVersionUID = 1L;


	
	

public SouthPanel() {
	this.setBackground(new Color(128,128,210));
	this.setLayout(new FlowLayout(FlowLayout.LEFT));
	this.setBackground(new Color(128,128,128));
	JLabel label=new JLabel();
	label.setIcon(new ImageIcon("images/rlt.png"));
	this.add(label);
	JLabel label1=new JLabel();
	label1.setIcon(new ImageIcon("images/rdt60.png"));
	this.add(label1);
}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		int width=getWidth();
		int height=getHeight();
		Color color1=new Color(255,255,255);
		Color color2=new Color(0,0,0);
		GradientPaint gp=new GradientPaint(width/2,height,color1, width+100, height, color2);
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, width, height);
	}

}
