
public class HomeWork3 {

	public static void main(String[] args) {
		int monthNumber = 13;
		String text = "";
			
		switch (monthNumber) {
		case 1:
			text = "Январь";
			break;
		case 2:
			text = "Февраль";
			break;
		case 3:
			text = "Март";
			break;
		case 4:
			text = "Апрель";
			break;
		case 5:
			text = "Май";
			break;
		case 6:
			text = "Июнь";
			break;
		case 7:
			text = "Июль";
			break;
		case 8:
			text = "Август";
			break;
		case 9:
			text = "Сентябрь";
			break;
		case 10:
			text = "Октябрь";
			break;
		case 11:
			text = "Ноябрь";
			break;
		case 12:
			text = "Декабрь";
			break;
		default:
			text = "Месяц не существует";
			break;
		
		}		
		
		System.out.println(text);
	}


	

}
