package dmasharovWork20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

	// Создание полей в классе для использования в обработчике события
	JTextField name_field, email_field;
	JRadioButton male, female;
	JCheckBox check;
		
	public ContactForm() {
		// Создание заголовка окна
		super("Контактная форма");
		// Определение расположения окна относителбьно левого верхнего края
		super.setBounds(200, 100, 300, 230);
		// Описания действия при закрытии окна
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Создение контейнера то на чем будет расположен интерфейс
		Container container = super.getContentPane();
		// Выбор структуры контейнера - мы выбрали сетку
		container.setLayout(new GridLayout(5, 2, 2, 10));
		
		// Создание объеутов на форме
		// Создание надписи
		JLabel name = new JLabel("Введите имя:");
		// Создание текстового поля для ввода текста
		name_field = new JTextField("", 1);
		
		// Создание надписи
		JLabel email = new JLabel("Введите email:");
		// Создание текстового поля для ввода текста
		email_field = new JTextField("@", 1);
		
		// Добаление данных в контейнер
		container.add(name);
		container.add(name_field);
		container.add(email);
		container.add(email_field);
		
		// Кнопка 
		male = new JRadioButton("Мужской"); 
		female = new JRadioButton("Женский"); 
		
		// Кнопка с галочкой 
		check = new JCheckBox("Согласен?", false);
		
		// Создание кнопки
		JButton send_button = new JButton("Отправить"); 
		
		// По умолчанию галка установлена на Мужской
		male.setSelected(true);
		
		container.add(male);
		container.add(female);
		
		// Чтобы можно было выбрать 1 значение. Создание группы
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
		
		container.add(check);
		container.add(send_button);
		
		// Обработчик события
		send_button.addActionListener(new ButtonEventManager());				
		
	}

	// Создание обработчика события
	class ButtonEventManager implements ActionListener {
		// Вызывается каждый раз, когда нажимаем кнопку
		@Override
		public void actionPerformed(ActionEvent e) {
			// Получение значений из текстовых полей
			String name = name_field.getText();
			String email = email_field.getText();
			
			// Установка значения в зависимости от выбранного поля
			String isMale = "Мужской";
			if(!male.isSelected())
				isMale = "Женский";
			
			boolean checkBox = check.isSelected();
			
			
			// Всплывающее окно
			JOptionPane.showMessageDialog(null, "Ваша почта: " + email + 
					"\nВаш пол " + isMale + "\nВы согласны? " + checkBox, "Привет, " + 
					name, JOptionPane.PLAIN_MESSAGE);
			
			
			
			
			
		}
		
	}
	
}
