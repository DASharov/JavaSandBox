package main;

public class MyArrayListHome {
	private String[] array = new String[10];
	int size = 0;
	
	public void add(String s) {		
		if (size == array.length) {
			String[] newArray = new String[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];				
			}
			array = newArray;
		}
		array[size] = s;
		size++;				
	}
	
	public void remove(int index) { 
		if (index > 0 && index <= size) {
			for (int i = index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			size--;
		}
	}
	
	public void remove(String s) { 
		for (int i = 0; i < size; i++) {
			if (s.equals(array[i])) {
				remove(i);
				break;
			}
		}
	}
	
	
	public int getSize() {
		return size;
	}
	
	public String getArray(int index) { 
		if (index >= 0 && index <= size) {
			return array[index];	
		} else {
			return "Значение с таким индексом не найдена";
		}
		
	}
}
