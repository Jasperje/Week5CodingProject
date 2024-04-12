package Week5;

public class Rectangle {

	
	private double width;   //at first there were yellow underline errors here
	// java will create getters and setters for you!!!
	private double length;
	private double area;
	
	//constructor:
	public Rectangle(double width, double length) { //not taking the area here
		//because area will be calculated based on width and length
		this.width = width; //width that is getting passed in
		this.length = length; // equals length that is getting passed in
		this.area = width*length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		area = width * length; //need to have this calculation here for anytime the length is set
		//we need to update the area
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		area = width * length; //same with anytime the width is changed we need to update the area
	}

	public double getArea() {
		return area;
	}

	//we DO NOT want a setter for area :
	//because we don't need to provide access for it.
	//it will be calculated based on length and width
	//public void setArea(double area) {  
	//	this.area = area;
	//}
	
	
	
	
	
	
	
	
	
	
	
	
}
