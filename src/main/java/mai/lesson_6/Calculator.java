package mai.lesson_6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator {
	// Объявляю элементы управления
	JPanel windowContent;
	JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonMult;
	JButton buttonDiv;
	JPanel p1;
	JTextField empty1;
	JTextField empty2;
	JTextField empty3;
	JTextField empty4;
	
	Calculator(){
		windowContent= new JPanel();
		// Добавил компановку
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		//Дисплей создал на севере
		displayField = new JTextField(10);
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		displayField.setFont(font1);
		windowContent.add("North", displayField);

		// Создаю кнопки
		button0=new JButton("0");
		button0.setFont(font1);
		button1=new JButton("1");
		button1.setFont(font1);
		button2=new JButton("2");
		button2.setFont(font1);
		button3=new JButton("3");
		button4=new JButton("4");
		button5=new JButton("5");
		button6=new JButton("6");
		button7=new JButton("7");
		button8=new JButton("8");
		button9=new JButton("9");
		buttonPlus=new JButton("+");
		buttonMinus=new JButton("-");
		buttonMult=new JButton("*");
		buttonDiv=new JButton("/");
		buttonPoint = new JButton(".");
		buttonEqual=new JButton("=");

		//Пустое  пространство
		empty1 = new JTextField();
		empty2 = new JTextField();
		empty3 = new JTextField();
		empty4 = new JTextField();
		empty1.setEditable(false);
		empty2.setEditable(false);
		empty3.setEditable(false);
		empty4.setEditable(false);
		// Создаю панель с цифровыми кнопками
		p1 = new JPanel();
		GridLayout gl =new GridLayout(5, 4, 2 , 2);
		p1.setLayout(gl);

		p1.add(empty1);
		p1.add(empty2);
		p1.add(empty3);
		p1.add(empty4);
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(buttonPlus);
		p1.add(button4);
		p1.add(button5);
		p1.add(button6);
		p1.add(buttonMinus);
		p1.add(button7);
		p1.add(button8);
		p1.add(button9);
		p1.add(buttonMult);
		p1.add(button0);
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		p1.add(buttonDiv);
		// Добавил панель, где размещаю кнопки в центр
		windowContent.add("Center", p1);

		//Назначаю события
		MyListener listener = new MyListener(this);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		buttonPoint.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = getDisplayFieldText(); 
				setDisplayFieldText(text + 0);
			}
		});
		
		//Создал фрейм
		JFrame frame = new JFrame("Калькулятор");
		frame.setContentPane(windowContent);
		// Автоподбор размера в соответствии с контентом
		frame.pack();
		// Отобразил главное окно
		frame.setBounds(100, 100, 300, 400);
		frame.setVisible(true);
		
	}
	
	public String getDisplayFieldText() {
		return displayField.getText();
	}

	public void setDisplayFieldText(String text) {
		this.displayField.setText(text);
	}
	

	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}

}


