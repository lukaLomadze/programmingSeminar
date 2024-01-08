import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;



public class problem68 extends GraphicsProgram implements ComponentListener{
	
	private JButton btn = new JButton("enter");
	private JTextField txt = new JTextField(10);
	private int lastMessage = 0;
	public void run() {

		
		add(txt, SOUTH);
		add(btn, SOUTH);
		
		txt.addActionListener(this);
		addActionListeners();
		
		
	}
	public void actionPerformed(ActionEvent e){
	
		//System.out.println(txt.getText());
		
		GLabel tt = new GLabel(txt.getText());
		 lastMessage += (int)tt.getAscent() * 3;
		add(tt, 20, lastMessage);
		txt.setText("");
		
	}
	
	
	
	
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
