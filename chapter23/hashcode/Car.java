package chapter23.hashcode;

import java.util.Objects;

public class Car {
	private String model;
	private String color;
	
	public Car(String m, String c) {
		model = m;
		color = c;
	}
	
	@Override
	public String toString() {
		return model + ":" + color;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, color);
	}
	
	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		
		if(model.equals(m) && color.equals(c))
			return true;
		else
			return false;
	}
}
