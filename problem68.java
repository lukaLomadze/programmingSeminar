import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;



public class problem68 extends GraphicsProgram {
	
	JButton btn = new JButton("enter");
		JTextField txt = new JTextField(10);
	
	public void run() {

		
		add(txt, SOUTH);
		add(btn, SOUTH);
		
		
		
	}
	public void actionPerformed(ActionEvent e){
		
		println(txt.getText());
		
		
	}
}
