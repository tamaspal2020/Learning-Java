package layouttest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CenterPanel extends JPanel{
private static final long serialVersionUID = 1L;

public CenterPanel() {
	this.setLayout(new GridLayout(8,8));
	int row=1;
	int col=1;
		for (int i=0; i<8; i++) {
		for (int j=0; j<8; j++) {
			JLabel l=new JLabel();
			this.add(l);
			if((row%2==1 && col%2==1) || (row%2==0 && col%2==0)) {
				l.setBackground(Color.WHITE);
			} 
			else {
				l.setBackground(Color.BLACK);
			}
			l.setOpaque(true);col++;
		}
		row++;
	}
	/*JLabel l1=new JLabel();
	JLabel l2=new JLabel("sfdgsdfgs");
	JLabel l3=new JLabel("sdfgsdfgsdfg");
	JLabel l4=new JLabel("sfdgsdfgs");
	this.add(l1); l1.setBackground(Color.BLACK); l1.setOpaque(true);
	this.add(l2); l2.setBackground(Color.WHITE); l2.setOpaque(true);
	this.add(l3); l3.setBackground(Color.BLACK); l3.setOpaque(true);
	this.add(l4); l4.setBackground(Color.WHITE); l4.setOpaque(true);*/
}

/*public void paint(Graphics g) {
	super.paint(g);
	int width=getWidth()-100;
    int height=getHeight()-100;
    int y=(getHeight()-height)/2;
    int x=(getWidth()-width)/2;
	//g.fillRect(x, y, width, height);
	
	   g.fillRect(x, y, 400, 400);
       for(int i = x; i <= 400; i+=100){
           for(int j = y; j <= 400; j+=100){
               g.clearRect(i, j, 50, 50);
           }
       }
       
       for(int i = x+50; i <= 450; i+=100){
           for(int j = y+50; j <= 450; j+=100){
               g.clearRect(i, j, 50, 50);
           }
       }
	
	
	g.drawString("sfgsfg", 400, 800);
}*/
}


