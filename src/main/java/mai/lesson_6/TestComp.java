package mai.lesson_6;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.GridLayout;

public class TestComp extends JFrame{
	private JTextField textField;
	public TestComp() {
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		getContentPane().add(tglbtnNewToggleButton);
	}

}
