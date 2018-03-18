package mai.lesson_6;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorEnh {
	
	JPanel windowContent;
	JTextField displayField, emptyField;
	JButton buttonBS, buttonCE, buttonC;
	JButton mcButton, button7, button8, button9, buttonDivide, buttonSqrt;
	JButton mrButton, button4, button5, button6, buttonMultiply, buttonPercent;
	JButton msButton, button1, button2, button3, buttonSubtract, buttonDX;
	JButton mplusButton, button0, buttonSign, buttonPoint, buttonAdd, buttonEqual;
	
	
	CalculatorEnh()
	{
		windowContent = new JPanel();
		GridBagLayout gb = new GridBagLayout();
		windowContent.setLayout(gb);
		
		GridBagConstraints constr = new GridBagConstraints();
		//Экран
		constr.gridx = 0;
		constr.gridy = 0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(10,10,20,10); 
		
		displayField = new JTextField();
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		gb.setConstraints(displayField, constr);
		windowContent.add(displayField);
		
		// перый ряд кнопок
		constr.gridx = 0;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,10,10,20); 
		
		emptyField = new JTextField();
		emptyField.setEditable(false);
		gb.setConstraints(emptyField, constr);
		windowContent.add(emptyField);
		
		constr.gridx = 1;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,0,10,10); 
		
		buttonBS = new JButton("Стереть");
		gb.setConstraints(buttonBS, constr);
		windowContent.add(buttonBS);
		
		constr.gridx = 3;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonCE = new JButton("CE");
		gb.setConstraints(buttonCE, constr);
		windowContent.add(buttonCE);
		
		constr.gridx = 5;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonC = new JButton("C");
		gb.setConstraints(buttonC, constr);
		windowContent.add(buttonC);
		
		//Создал фрейм
		JFrame frame = new JFrame("Калькулятор");
		frame.setContentPane(windowContent);
		// Автоподбор размера в соответствии с контентом
		frame.pack();
		// Отобразил главное окно
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		CalculatorEnh calc = new CalculatorEnh();
	}
	

}
