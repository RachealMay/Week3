
public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Array for ints of ages
		int [] age = new int [9];
		age[0] = 3;
		age[1] = 9;
		age[2] = 23;
		age[3] = 64;
		age[4] = 2;
		age[5] = 8;
		age[6] = 28;
		age[7] = 92;
		age[8] = 52;
		System.out.println(sums(age));
		System.out.println(average(age));
		//2. Create an array of names
		String [] names = new String [6];
		names[0] = "Sam"; 
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		System.out.println(letterAverage(names)); 
		System.out.println(namesTogether(names)); 
		//5. Create new nameLengths array and create a loop to add the name lengths of the names array to this array.  
		int[] nameLengths = new int[6]; 
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length(); 
			System.out.println(nameLengths[i]);  
		}
		System.out.println(lengthSum(nameLengths)); 
		System.out.println(wordsbythree("Goodbye", 3)); 
		System.out.println(fullName("Racheal", "Mayhugh")); 
		//9 Method that takes an Array of ints and returns true if sum is over 100
		int [] numbers = new int [5];
		numbers[0] = 25;
		numbers[1] = 62; 
		numbers[2] = 5;
		numbers[3] = 2;
		numbers[4] = 35; 
		System.out.println(isOver100(numbers)); 
		//10. Method that takes a double array and returns average. 
		double[] doubleNumbers = new double [6];
		doubleNumbers[0] = 25.30;
		doubleNumbers[1] = 45.90;
		doubleNumbers[2] = 54.27; 
		doubleNumbers[3] = 74.29; 
		doubleNumbers[4] = 89.10; 
		doubleNumbers[5] = 3.50;
		System.out.println(doubleAverage(doubleNumbers)); 
		//11. Method that takes two double arrays and returns true if sum of first is larger than second
		double [] secondDouble = new double [6]; 
		secondDouble [0] = 56.21; 
		secondDouble [1] = 111.52;
		secondDouble [2] = 1.25;
		secondDouble [3] = 0.53;
		secondDouble [4] = 7.14;
		secondDouble [5] = 21.35;
		System.out.println(isLarger(doubleNumbers, secondDouble)); 
		//12. Method that returns true if Hotoutside and money is above 10.50
		boolean isHotoutside = true; 
		double moneyInpocket = 30.23; 
		System.out.println(willBuydrink(isHotoutside, moneyInpocket)); 
		//13. Create your own method. Dice rolls during a game of dungeon and dragons,returns number of successful rolls. 
        int [] diceRolls = new int [11];
        diceRolls[0] = 11;
        diceRolls[1] = 4;
        diceRolls[2] = 14;
        diceRolls[3] = 18;
        diceRolls[4] = 10;
        diceRolls[5] = 7;
        diceRolls[6] = 1;
        diceRolls[7] = 5;
        diceRolls[8] = 17;
        diceRolls[9] = 12;
        diceRolls[10] = 20; 
        System.out.println(successAverage(diceRolls));   
	}
	private static int successAverage(int diceRolls[]) {
		// TODO Auto-generated method stub
		int success = 0;
		for(int i = 0; i < diceRolls.length; i++) {
			if (diceRolls[i] > 10) {
				success++; 
			} 
			}
		return success;
}
	//12. Method for 12
	private static boolean willBuydrink(boolean hotOutside, double moneyInpocket) {
		// TODO Auto-generated method stub
		boolean buyDrink = hotOutside && moneyInpocket > 10.50;
		return buyDrink;
	}
	//11. Method for 11
	private static boolean isLarger(double doubleNumbers[], double secondDouble[]) {
		// TODO Auto-generated method stub
		double sum1 = 0;
		double sum2 = 0; 
		for (double number : doubleNumbers) {
			sum1 += number;			
			}
		for (double number : secondDouble) {
			sum2 += number; 
		}
		boolean isLarger = sum1 > sum2; 
		return isLarger;
	}
	//10. Method for 10
	private static double doubleAverage(double doubleNumbers[]) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < doubleNumbers.length; i++ ) {
			sum = sum += doubleNumbers[i]; 
		}
		int averageDouble = sum / doubleNumbers.length; 
		return averageDouble;
	}
	//9. Method for 9. 
	private static boolean isOver100(int[] numbers){
		// TODO Auto-generated method stub
		int sum = 0; 
		for(int number : numbers) {
			sum += number; 
		}
		boolean over100 = sum > 100;
		return over100;
	}
	//8. Method that takes two names and returns a full name. 
		private static String fullName(String firstName, String lastName) {
		// TODO Auto-generated method stub
			String fullName = firstName + " " + lastName; 
		return fullName;
	}
		//7 Concatenates a string N number of times. 
		private static String wordsbythree(String word, int n) {
		// TODO Auto-generated method stub
			String total= "";
			for (int i = 0; i < n; i++) {
				total += word; 
			}
		return total;
	}
		private static int lengthSum(int[] Lengths) {
		//6. Create an loop that calculates that sum in the Namelenghts array
		// TODO Auto-generated method stub
			int sum = 0;
			for (int length : Lengths) {
			sum += length; }
		return sum;
	}
		//2B. Concatenate all names together with space. 
		private static String namesTogether(String names[]) {
		// TODO Auto-generated method stub
			String together = "";
			for(int i = 0; i < names.length; i++) {
				together = names[i] + " " + together; 
			}
		return together;
	}
		//2A. Average of length of names in array. 
		private static int letterAverage(String names[]) {
		// TODO Auto-generated method stub
			int total = 0;
			for (int i = 0; i < names.length; i += 1) {
				total = total += names[i].length(); 
			}
			 int averageLength = total / names.length; 
	return averageLength; 
	}
		//1A. Adds first age and last age in array. Is dynamic and will update when adding new numbers
	private static int sums(int age[]) {
		// TODO Auto-generated method stub
		int i = 0;
		int sums = age[i] += age[age.length - 1]; 
		return sums;
	}
	//1B. Calculate average of numbers in array. 
	private static int average(int age[]) {
		// TODO Auto-generated method stub
		int total= 0;
		for(int i = 0; i < age.length; i++) {
			total = total + age[i]; 
			}
		int average = total / age.length; 
		return average;
	}
	
	
}


