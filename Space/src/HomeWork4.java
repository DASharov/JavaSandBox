
public class HomeWork4 {

	public static void main(String[] args) {
		String month = "Сентябрь";
		String text = "";
		if (month.equals("Декабрь") || month.equals("Январь") || month.equals("Февраль")) {
			text = "Зима";
		} else if (month.equals("Март") || month.equals("Апрель") || month.equals("Май")) {
			text = "Весна";
		} else if (month.equals("Июнь") || month.equals("Июль") || month.equals("Август")) {
			text = "Лето";
		} else if (month.equals("Сентябрь") || month.equals("Октябрь") || month.equals("Ноябрь")) {
			text = "Осень";
		} else { 
			text = "Такого месяцв не существует";
		}			
		System.out.println(text);
	}

}
