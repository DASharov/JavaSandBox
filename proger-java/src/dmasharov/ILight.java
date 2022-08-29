package dmasharov;

// Создание интерфейса
public interface ILight {
	
	// по умолчанию проставляется модификатор доступа public
	// в интерфейсе по умолчанию константа final
//	boolean isOn = false;
	
	void setLight(boolean set);
	void blinkLight();
	
}
