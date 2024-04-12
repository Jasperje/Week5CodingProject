package Week5;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student = new Student();
		student.setFirstName("Sally");   //if you just say "student.firstName" you'll get an error
		// that the field is not visible, if the method is private, that's the error
		student.setPhoneNumber("123");  //will print out phone number is null
		//because we set the length requirement in the student class
		//to be 9 digits long
		// student.checkLength("hello", 3);  //this is not visible because this method
		//only applicable within the class itself (because it is private)
		student.introduce();
		
		
		Rectangle rect = new Rectangle(10.0, 15.0);
		rect.setLength(10.0);   // if you simply change the length on this line
		//it will recalculate the area based on 10 x 10 with the updated length
		//instead of the first length given
		System.out.println(rect.getArea());
		
		
		
		
		
	}

}
