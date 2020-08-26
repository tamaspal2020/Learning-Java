package tile;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

final  class InfoPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JLabel l2; 
	public static JButton b;
	 public  InfoPanel() {
		this.setLayout(new GridLayout(0,1,1,1));
		this.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		String szoveg="<html><p style='text-align:justify'>This is a 20x20 area with 300 soldiers. <br>"+
					   "Each soldier has a color (black or white) and a strength (1-10).<br>"+
					   "If the sum of the enemy soldiers around a soldier is bigger <br>than the sum of the strength of his friends<br>"
					   + "and the battle is not over yet, then the soldier disappears.<br>"
					   + "If the strength of the choosen soldier is bigger, then one of his enemies disappears.<br>"+
					   "If the strength is equal, then one of the enemies around the choosen soldier disapperars.<br>"+
					   "You can start the battle by clicking the start button</p></html>";
				
						
			JPanel toppanel=new JPanel();
			toppanel.setLayout(new GridLayout(0,1,1,1));
			this.add(toppanel);
		   JLabel l=new JLabel(szoveg);
		   l.setBackground(Color.LIGHT_GRAY);
		   l.setVerticalAlignment(SwingConstants.TOP);
		   l.setOpaque(true);
		   l.setBorder(BorderFactory.createEmptyBorder(2,2,2,20));
		   toppanel.add(l);
		   JPanel top2=new JPanel();
		   top2.setBackground(Color.LIGHT_GRAY);
		   top2.setLayout(new FlowLayout());
		   int width=this.getWidth();
		   int height=this.getHeight();
		   top2.setBorder(BorderFactory.createEmptyBorder(100,50,100,50));
		   top2.setAlignmentY(SwingConstants.CENTER);
		   top2.setAlignmentX(Component.CENTER_ALIGNMENT);
		   top2.setAlignmentY(Component.CENTER_ALIGNMENT);
		   toppanel.add(top2);
		 b=new JButton("START");
		b.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		b.setVerticalAlignment(SwingConstants.CENTER);
		top2.add(b);
		  
		   l2=new JLabel("sdfgsdfsgd");
		   l2.setBackground(Color.LIGHT_GRAY);
		   l2.setVerticalAlignment(SwingConstants.TOP);
		   l2.setOpaque(true);
		   this.add(l2);
	}
}
