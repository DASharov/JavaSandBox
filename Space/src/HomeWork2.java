
public class HomeWork2 {

	public static void main(String[] args) {
		int monthNumber = 5;
		String text = "";
			if (monthNumber == 1) {
				text = "Январь";
			} else if (monthNumber == 2) {
				text = "Февраль";				
			} else if (monthNumber == 3) {
				text = "Март";
			} else if (monthNumber == 4) {
				text = "Апрель";
			} else if (monthNumber == 5) {
				text = "Май";
			} else if (monthNumber == 6) {
				text = "Июнь";
			} else if (monthNumber == 7) {
				text = "Июль"; 
			} else if (monthNumber == 8) {
				text = "Август";
			} else if (monthNumber == 9) {
				text = "Сентябрь";
			} else if (monthNumber == 10) {
				text = "Октябрь";
			} else if (monthNumber == 11) {
				text = "Ноябрь";
			} else if (monthNumber == 12) {
				text = "Декабрь";
			} else {
				text = "Месяц не существует";
			}	
		System.out.println(text);
	}

}
