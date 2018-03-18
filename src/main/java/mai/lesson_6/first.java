package mai.lesson_6;

import javax.swing.JFrame;

public class first extends JFrame {
	public first(){
		setSize(200,300);
		this.setBounds(100, 100, 200, 300);
		setTitle("Мой первый графический интерфейс");
		setVisible(true);
	}

	public static void main(String[] args) {
		//first f = new first();
		JFrame frame = new JFrame();
		frame.setVisible(true);
	}
}