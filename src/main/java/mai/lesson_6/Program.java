package mai.lesson_6;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Program  {
	
	
	public static void main(String args[])
	{
		JPanel windowContent = new JPanel();
		GridLayout gl = new GridLayout(4, 2, 5, 5);
		windowContent.setLayout(gl);
		JLabel label1 = new JLabel("Число 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Число 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Сумма:");
		JButton go = new JButton("Рассчет");
		
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(go);
		JFrame frame = new JFrame("My first program");
		frame.setContentPane(windowContent);
		frame.setSize(200, 300);
		frame.setTitle("Hello world");
		frame.setVisible(true);
	}
}
