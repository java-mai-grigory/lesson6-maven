package mai.lesson_6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyListener implements ActionListener{

	Calculator calc;
	
	@Override
	public void actionPerformed(ActionEvent arg) {
		
		String command = arg.getActionCommand();
		Object obj = arg.getSource();
	/*	JOptionPane.showConfirmDialog(null,
				"Вы нажали " + command,
				"Тест",
				JOptionPane.PLAIN_MESSAGE);
		
		calc.setDisplayFieldText("O");*/
		
		switch(command)
		{
		case "1":
			calc.setDisplayFieldText("1");
			break;
		case "2":
			calc.setDisplayFieldText("2");
			break;
		}
	}
	
	public MyListener(Calculator calc)
	{
		this.calc = calc;
	}
	
}
