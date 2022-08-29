
public class Rect {
	double lenght;
	double width;
	
	void setParameters (double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
	}
	
	double perimCalc() {
		return 2 * (lenght + width);
	}
	
	double sqrCalc() { 
		return lenght * width;
	}
}
