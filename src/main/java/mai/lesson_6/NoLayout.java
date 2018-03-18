package mai.lesson_6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoLayout extends JFrame {
	public NoLayout(){
		
		setSize(200,300);
		this.setBounds(100, 100, 290, 300);
		JPanel windowContent = new JPanel();
		windowContent.setLayout(null);
		JButton myButton = new JButton("Делать");
		myButton.setBounds(5,5,100,30);
		
		JButton myButton2 = new JButton("Делать2");
		myButton2.setBounds(115, 5, 100,30);
		windowContent.add(myButton);
		windowContent.add(myButton2);
		
		setContentPane(windowContent);
		setTitle("Мой первый графический интерфейс");
		setVisible(true);
	}

	public static void main(String[] args) {
		NoLayout f = new NoLayout();
	}
}
