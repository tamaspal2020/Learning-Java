package Chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.View;

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
		
			if(((row%2==1 && col%2==1) || (row%2==0 && col%2==0)) ) {
				l.setBackground(Color.WHITE);
			} 
			else {
				l.setBackground(Color.BLACK);
			}
			l.setOpaque(true);col++;
		}
		row++;
	}
		int width= this.getWidth()-100;
		int height= this.getHeight()-100;
	this.setLocation(width, height);
	this.setBounds(width, height, 500, 500);
	
	this.setSize(100, 100);
	this.setMinimumSize(new Dimension(100,100));
	this.setBounds(new Rectangle(100,100,100,100));
	this.setAlignmentX(100);
	this.setAlignmentY(100);
	this.setPreferredSize(new Dimension(500,500));
	
	this.revalidate();
	this.setVisible(true);
	
	/*this.setLayout(new BorderLayout());
	this.setBackground(new Color(128,200,128));
	JPanel pan=new JPanel();
	pan.setBackground(Color.blue);
	pan.getMaximumSize();
	JLabel lab=new JLabel("gsdfgdfg");
	lab.setForeground(Color.WHITE);
	this.add(lab, BorderLayout.CENTER);
	lab.setLocation(10, 200);
	this.add(pan, BorderLayout.SOUTH);*/
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
