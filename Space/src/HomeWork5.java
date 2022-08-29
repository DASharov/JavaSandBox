
public class HomeWork5 {

	public static void main(String[] args) {
		String month = "Апрель";
		String text = "";
		
		switch (month) {
		case "Декабрь" :
			text = "Зима";
			break;
		case "Январь" :
			text = "Зима";
			break;
		case "Февраль" :
			text = "Зима";
			break;
		case "Март" :
			text = "Весна";
			break;
		case "Апрель" :
			text = "Весна";
			break;
		case "Май" :
			text = "Весна";
			break;
		case "Июнь" :
			text = "Лето";
			break;
		case "Июль" :
			text = "Лето";
			break;
		case "Август" :
			text = "Лето";
			break;
		case "Сентярь" :
			text = "Осень";
			break;
		case "Октябрь" :
			text = "Осень";
			break;
		case "Ноябрь" :
			text = "Осень";
			break;
		
		default :
			text = "Такого месяцв не существует";				
		}
		System.out.println(text);
		
	}

}
