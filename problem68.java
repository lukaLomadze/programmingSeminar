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
		
		txt.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		
		System.out.println(txt.getText());
		//println(e.getActionCommand());
		txt.setText("");
		
		
	}
}
