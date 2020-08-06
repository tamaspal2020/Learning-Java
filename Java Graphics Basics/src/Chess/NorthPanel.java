package Chess;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class NorthPanel extends JLayeredPane {      /// layeredpane hogy a drag megoldható legyen mouslistener stb https://stackoverflow.com/questions/4893265/dragging-a-jlabel-around-the-screen
private static final long serialVersionUID = 1L;      /// drag sample: egyeb project  default package : DragLabelOnLayeredPane
public int x2;
public int y2;
public int MouseX;
public int MouseY;
public JLabel label;
public NorthPanel() {
	this.setLayout(new FlowLayout(FlowLayout.LEFT));
	this.setBackground(new Color(128,128,128));
	label=new JLabel();
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
	Color color2=new Color(9,127,201);
	Color color1=new Color(40,41,68);
	GradientPaint gp=new GradientPaint(0,height,color1, width/2, height, color2);   //
	///width/2,height,color1, width+100, height, color2);
	g2d.setPaint(gp);
	g2d.fillRect(0, 0, width, height);
}

}

