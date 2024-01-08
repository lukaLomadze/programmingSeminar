import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;



public class problem68 extends GraphicsProgram {
	
	private JButton btn;
	private JTextField txt;
	private int lastMessage = 0;
	
	
	
	public void init(){
		btn = new JButton("enter");
		 txt = new JTextField(10);
		add(txt, SOUTH);
		add(btn, SOUTH);
		
		txt.addActionListener(this);
		addActionListeners();
		
	}
	public void run() {

		
		
		
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(!txt.getText().equals("")){
		GLabel tt = new GLabel(txt.getText());
		tt.setFont("-15");
		tt.setColor(Color.red);
		 lastMessage += (int)tt.getAscent() * 3;
		add(tt, 20, lastMessage);
		}
		txt.setText("");
		
	}
	
	
	
}
