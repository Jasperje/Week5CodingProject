package Week5;

public class Week5ClassVideos {

		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			StringBuilder name = new StringBuilder(); 
			StringBuilder name2 = new StringBuilder(); //stringbuilder()is a method because of the parantheses
			//we can also "overload" constructors and have diff versions of them
			
			//Stringbuilder is a class - "new stringbuilder" creates an instance of a class,
			// so it becomes our new object. now we can build multiple instances of stringbuilders
			
			//now we can create our OWN classes! whoa.
			//variables we use camel case (first letter lowercase)
			//classes we use pascal case - the first letter capitalized in addition to all other words
			
			Student student1 = new Student();
			student1.firstName = "Tom";
			student1.lastName = "Smith";
			student1.gradeLevel = 12;
			student1.phoneNumber = "480-123-4567";
			
			student1.introduce();
			
			Student student2 = new Student ("Sam", "Jones");
			student2.introduce();
			
			Student student3 = new Student ("Tom", "Riddle", "980-123-4566", 11);
			student3.introduce();
			
		
			
			
			
			
			
			
			
			
	
		
		
		
		
		
		
		
		
		
	}

}
