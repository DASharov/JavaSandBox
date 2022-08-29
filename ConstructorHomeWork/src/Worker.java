
public class Worker {
	// Объявление полей класса
	String name;
	String post;
	double salary;
	
	// Создание конструктора - инициализация полей класса
	Worker(String name, String post, double salary) {
		this.name = name;
		this.post = post; 
		this.salary = salary;
	}
	
	// Возврат информации о сотруднике
	String getInfoAboutWorker(int month) { 
		double resSalary = month * salary;
		return "Сотрудник " + name + ", должность " + "\"" + post + "\"" + ", за поледние " + month 
				+ " месяцев получил " + resSalary + " рублей";
	}
	
}
