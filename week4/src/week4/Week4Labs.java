package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
				// 1. Why would we use a StringBuilder instead of a String?
		        //    each new string creates a new string but a stringbuilder is more efficient
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
                           StringBuilder sb = new StringBuilder();
                           for (int i = 0; i < 10; i++) {
                        	   
                        	   sb.append(i);  //as long as i !=9
                        	  if (i != 9) {
                        		   sb.append(" - ");
                        	   }
                           }
                        	   
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length

                           List <String> strings = new ArrayList<String>();
                           //remember to import list and arraylist 
				        strings.add("Tom");
				        strings.add("Sammy");
				        strings.add("Sara"); 
				        strings.add("I");  
				        strings.add("Me");
				        
				        //Arrays.asList("Tom", "Sammy" etc...);  can create a list in just one line!
				        
				        
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
                     
				        System.out.println(findShortestString(strings));
				        
				        
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched

				        List<String> swapped = swapFirstAndLast(strings);  //pass in strings array
				        for (String string : swapped) {
				        	System.out.println(string);
				        }
				        
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
                   System.out.println(combineStrings(swapped));
                   
				        
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
                
                   List<String> searchResults = search(strings, "a"); //here we search the list for the letter a
                   for (String result : searchResults) {    //loop through the list but not sure why we needed TWO loops in this one?!
                       System.out.println(result);   // then this will print out each name that contains the letter A, in this example
                   }
                   
                   
                   
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

                   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, etc..);
                   
                   List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
                   
                   for (List<Integer> list : sortedNumbers) {  //sortednumbers is a list of lists...
                	   for (Integer number : list) {    // this will loop thru each list inside of the list of sortednumbers
                		   System.out.println(number);
                	   }
                   
                   
				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string

                	   List<Integer> stringsLengths = calculateStringLengths(strings);
                	   for (Integer i : stringsLengths) {
                		   System.out.println(i);
                	   }
                	   
                	   

				// 9. Create a set of strings and add 5 values
                Set<String> set = new HashSet<String>();
                set.add("Hello");
                set.add("hi");
                set.add("whatever");
                set.add("blah");
                set.add("Hello");
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.

                set<String> startsWithH = findAllThatStartWith(set, 'H');
                for ( String word : startsWithH) {
                	System.out.println(word);
                }

				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
			     List<String> resultList = convertSetToList(set);
			     for (String listString : resultList) {
			    	 System.out.println(listString);
			    	
			     }
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set

			     Set<Integer> IntegerSet = new HashSet<Integer>();
			     integerSet.add(1);
			     integerSet.add(4);//etc.. we are just adding random even and odd numbers to test
			     
			     Set<Integer> extractedEvens = extractEvens(integerSet);
			     for (Integer number : extractedEvens) {
			    	 System.out.println(number);
			    	 
			     }

				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word

			     Map<String, String> dictionary = new HashMap<String, String>();
			     //remember to important map and hashmap
			     dictionary.put("Apple", "A delicious fruit");
			     dictionary.put("Banana", "A yellow, soft fruit");
			     dictionary.put("Java", "A programming language");
			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)

			     String value = lookupValue(dictionary, "Apple"); //assigned a value for this string
			     System.out.println(value);
			     
			     
			     
				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				 Map<Character, Integer> counts = countStartingLetters(resultList);
				 for (Character character : counts.keySet()) {
					 System.out.println(character + " - " + counts.get(character)); 
				 }

			}
			
			
			// Method 15:
			
                   public static Map<Character, Integer>  (List<String> ) {
                	   Map<Character, Integer> results = new HashMap<Character, Integer>();
                	   //need to iterate over list to find  character of each string in this list
                	   
                	   for (String string : list) {
                		   char c = string.charAt(0);
                		   if (results.get(c) = null) {
                			   //then we need to add a new entry
                			   results.put(c, 1);
                			   //if this does not exist the computer will pass this option
                		   } else { 
                			   results.put(c,  results.get(c) + 1);
                		   }
                		   
                	   }
                	   
                	   return results;
                   }
			
			
			// Method 14:
			 
                  public static String  lookupValue (Map<String, String> map, String string) {
                	  for (String key : map.keySet()) {
                		  if (key.equals(string)) {
                			  return map.get(key);
                		  }
                	  }
                	  return " ";
                  }

			
			// Method 12:
			public static Set<Integer> extractEvens (Set<Integer> set) {
				Set<Integer> results = new HashSet<Integer>();//we must create a new set that contains only the even numbers 
			    for (Integer number : set) {
			    	if (number % 2 == 0) {
			    		results.add(number);
			    	}
			    }
			    return results;
			}

			
			// Method 11:
			
                   public static List<String> convertSetToList (Set<String> set) {
                	   List<String> results = new ArrayList<String>();
                	   for (String string : set) {
                		   results.add(string);
                	   }
                	   return results;
                   }


			// Method 10:
			
                   public static Set<String> findAllThatStartWith (Set<String> set, char c) {
                	   Set<String> results = new HashSet<String>(); //this takes a set of strings so we need to create a set of strings 
                	    for (String string : set) {
                	    	if (string.charAt(0)) { //cannot use .startsWith for a character 
                	    		results.add(string);                	    	
                	    }
                   }
                	    return result;
                   }

			
			// Method 8:
			
             public static List<Integer> calculateStringLengths (List<String> list) {
            	 List<Integer> lengths = new ArrayList<Integer>();
            	 for (String string : list) {
            		 lengths.add(string.length());
            	 }
            	 return lengths;
             }
                   
                   
                   

			
			// Method 7:
			
	  public static List<List<Integer>> sortDivisibleNumbers (List<Integer> list) {
		  List<List<Integer>> results = new ArrayList<List<Integer>>(); //then we add 4 different arrayLists to this list
		  results.add(new ArrayList<Ineger>());
		  results.add(new ArrayList<Ineger>());
		  results.add(new ArrayList<Ineger>());
		  results.add(new ArrayList<Ineger>());
		  
		  for (Integer number : list) { //not doing else if because some numbers are divisble by multiple numbers 
			  if (number % 2 ==0 );
			  results.get(0).add(number); //can use .add method because it's an arraylist of integers
		  }
		  if (number % 3 ==0) {
		  results.get(1).add(number);   //numbers div by 3 are added to this list
	  }
	  if (number % 5 == 0) {
	  results.get(2).add(number);
}
if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
	results.get(3).add(number);   //numbers not div by any of these are added to this last list
}
}
	  return results;
}


	
	

			
			// Method 6:
			//returns a new list of strings with all strings from OG list that contain the second parameter (?!?!?)
     public static List<String> search (List<String> list, String query) {
    	 List<String> results = new ArrayList<String>();
    	 for (String string : list) {
    		 if (string.contains(query)) {  //this will loop through and search first list
    			 results.add(string);    //and add each string to the new list (only if the if statement is true)
    		 }
    	 }
    	 return results;
     }
	
	
			
			// Method 5:
			
		public static string combineStrings(List<String> strings) {
			StringBuilder result = new StringBuilder();
			for (String string : strings) {
				result.append(string + ", ");
			}
			return result.toString();
		}
	
	
	
	
	
	
			
			// Method 4:
			
          public static List<String> swapFirstAndLast(List<String> list) {
        	  String temp = list.get(0);   //we need a placeholder variable for while the first and last are switching
              list.set(0, list.get(list.size() - 1));
              //this will take the first item from the list and move it to the 10th item
              //then override the first element with the last element
              //then take the last element and make it the 10th variable
              list.set(list.size() - 1, temp);
              return list;
          }
	
	
			
			
			// Method 3:
			
	
	
		
		
       public static String findShortestString(List<String> list) {
    	   String shortest = list.get(0);  //must assign a variable
    	   for String string : list) {
    		   if (string.length() < shortest.length()) {
    			   shortest = string;  //so this would be replaced with the shortest string
    		   }
    	   }
    	   return shortest; //outside of the loop
		
		
		
		
		
		
		
	}

}
