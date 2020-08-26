package tile;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;
import tile.Field;
import tile.InfoPanel;

public class Pan extends JPanel{

	private static final long serialVersionUID = 1L;
	//ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
	 
	public static Field field;

public static JLabel[][] labelek=new JLabel[20][20];
	public Pan() {
		this.setLayout(new GridLayout(20,20,1,1));
		this.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		 

		       
	for(int m = 0; m < 20; m++) {
			   for(int n = 0; n <20; n++) {
				   JLabel l=new JLabel();
				   l.setBackground(Color.GREEN);
				   l.setOpaque(true);
				   this.add(l);
				   labelek[m][n]=l;
				   
			   }
	}
	 field=new Field();
	field.populate(labelek);
	
	InfoPanel.b.addActionListener(e -> belso());
	
	 

    


	}
	public void belso() {
		field.chooseASoldier();
		  Timer t = new Timer();
		   TimerTask tt = new TimerTask() {
	    @Override
	    public void run() {
	    	for (int i=0; i<2; i++) {
				labelek[i][5].setBackground(Color.BLACK);
				//startbattle();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				        }  
	    };
	};
	t.scheduleAtFixedRate(tt,500,1000);  
	/*			       */

	}

}
