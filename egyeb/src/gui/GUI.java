package gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
private int count=0;
private JButton button;
private JLabel label;
private JPanel panel;


public GUI()   {
	JFrame frame = new JFrame();
	panel= new JPanel();
	
	button =new JButton("Click");
	button.addActionListener(this);
	
	label=new JLabel("Number of clicks: 0");
	
	
	panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
	panel.setLayout(new GridLayout(0,1));
	panel.add(button);
	panel.add(label);
	
	frame.add(panel, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("GUI");
	frame.pack();
	frame.setVisible(true);
	
	
}
	public static void main(String[] args) {
		new GUI();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of clicks: "+count);
		
	}

}
