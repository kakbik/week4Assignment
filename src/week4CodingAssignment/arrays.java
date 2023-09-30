package week4CodingAssignment;

public class arrays {

	public static void main(String[] args) {
		System.out.println("Part 1: ");
		//create an array and instantiate it with the required values
		int [] ages = {3,9,23,64,2,8,28,93};
		//subtract the first element from the last element and store it to the last element
		ages[ages.length-1]-=ages[0];
		//print the new value of the last element of the array to the console
		System.out.println("The last element in the first array is: "  + ages[ages.length-1]);
		int [] ages9 = {3,9,23,64,2,8,28,93,70};
		//subtract the first element from the last element
		ages9[ages9.length-1]-=ages9[0];
		//print the new value of the last element of the array to the console
		System.out.println("The last element in the second array is: "+ages9[ages9.length-1]);
		//create an enhanced for loop to calculate the average value of the array elements
		double averageAge = 0;
		for (int age : ages) {
			averageAge+=age;
		}
		//divide the sum of ages by the number of ages
		averageAge = averageAge/ages.length;
		//print out the average age to the console
		System.out.println("The average age in the first array is: " + averageAge);
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
		System.out.println("Part 2: ");
		//create an array and instantiate it with the required values
		String [] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		//enhanced for loop to iterate through the array of names and sum of all letters in all names:
		int averageLength = 0;
		for (String name : names) {
			averageLength += name.length();
		}
		//divide the sum of all letters by the number of names in the array names to get the average:
		averageLength = averageLength / names.length;
		//print out the average to the console:
		System.out.println("The average number of letters per name is: "+ averageLength);
		//concatenate all names using String Builder because String is immutable
		StringBuilder allNames = new StringBuilder();
		for (String name : names) {
			allNames.append(name+" ");
		}
		//print out concatenated names:
		System.out.println(allNames);
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
		
		System.out.println("Part 3: ");
		System.out.println("to access the last element of any array use: array[array.length-1]");
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		System.out.println("Part 4: ");
		System.out.println("to access the first element of any array use: array[0]"); 
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		System.out.println("Part 5: ");
		//create a new array nameLengths
		int [] nameLengths = new int[names.length];
		System.out.println("The array of name lengths is: ");
		//use for loop to add name length to new nameLengths and print to console 
		for (int i=0;i<names.length;i++) {
			nameLengths[i]=names[i].length();
			System.out.println(names[i].length());
		}
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
		
		System.out.println("Part 6: ");
		int sum = 0;
		//for loop to sum the name lengths
		for (int nameLength : nameLengths) {
			sum+= nameLength;
		}
		//print out the sum to the console
		System.out.println("The sume of all name legths = "+sum);
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
		System.out.println("Part 7: ");
		System.out.println(wordMultiply("Hello",3));
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		System.out.println("Part 8: ");
		System.out.println(fullName ("John","Doe"));
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		System.out.println("Part 9: ");
		System.out.println(GreaterThanHundred(nameLengths));
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
		System.out.println("Part 10: ");
		double [] array = {3.2,9.2,23.4,64.6,2.4,8.44,28.4,93.0};
		System.out.println(arrAverage(array));
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		System.out.println("Part 11: ");
		double [] firstArray = {3.2,9.2,23.4,64.6,2.4,8.44,28.4,93.0};
		double [] secondArray = {0.0,9.2,23.4,64.6,2.4,8.44,28.4,93.0};
		System.out.println(FirstArrGreater(firstArray,secondArray));
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		System.out.println("Part 12: ");
		System.out.println(willBuyDrink(false,11));
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
		System.out.println("Part 13: ");
		System.out.println(nand(false,false));
	}

	//Part 7:
	//method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
	static String wordMultiply(String word, int n) {
	
		StringBuilder wordMultiply = new StringBuilder();
		for (int i=0;i<n;i++) {
			wordMultiply.append(word);
		}
		return wordMultiply.toString();
	}
	//Part 8:
	//method that takes two Strings, firstName and lastName, and returns a full name
	//(the full name should be the first and the last name as a String separated by a space
	static String fullName(String firstName, String lastName) {
		
		return firstName+" "+lastName;
	}
	//Part 9:
	//method that takes an array of int and returns true if the sum of all the ints
	//in the array is greater than 100
	static boolean GreaterThanHundred(int[] numbers) { 
		int sum=0;
		for (int number:numbers) {
			sum+=number;
	}
		return sum>100;
	}
	//Part 10:
	//method that takes an array of double and returns the average of all the elements in the array.
	
	static double arrAverage (double[] numbers) {
		double arrAverage = 0;
		for (double number : numbers) {
			arrAverage += number;
	}
		return arrAverage/numbers.length;
	
	}
	//Part 11:
	//method that takes two arrays of double and returns true if the average of the elements
	//in the first array is greater than the average of the elements in the second array
	
	//uses method created in part 10
	static boolean FirstArrGreater (double[] firstArray, double[] secondArray) {
		//calculate the average of the first array:
		return arrAverage (firstArray)>arrAverage(secondArray);
		
	}
	//Part 12:
	//method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		//calculate the average of the first array:
		return (isHotOutside&&moneyInPocket>10.50);
}
	//Part 13:
	//method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	//This method will take two boolean values and return true if they are both false
	//this represents an logic NAND gate
	static boolean nand (boolean input1, boolean input2) {
	return (!input1&&!input2);	
	}
	}
	
