package testingCenter;

import java.util.ArrayList; //To import necessary methods for using ArrayList
import java.util.LinkedList; //To import necessary methods for using LinkedList
import java.util.Random; //To import necessary methods for using RandomNumbers

public class CovidTestingCenter {

	static ArrayList<String> quarantine = new ArrayList<>(); //Create Array List Object to store people that test Positive

	private static Random randGen = new Random();   //Create the object randGen to helo us generate random numbers
	static LinkedList<String> Patients = new LinkedList<String>(); 

	private static LinkedList<String> nameGenerator() { //Create a linked list function to generate random names

		String LetterString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  //We add which ever alphabet we want to the String AlphaString so we use to generate random names
		StringBuilder sb = new StringBuilder(5); //Create a string builder sb so we can use it to create the length of letters we want and so that we add to it

		while (Patients.size() < 10) { //We want to create 10 names so we use this while loop 

			for (int i = 0; i < 5; i++) {  //Will loop 5 times since we only want a five letter name
				int index = (int)(LetterString.length() * Math.random());   //The characters we had put in, in the Alpha string will be randomly chosen 

				sb.append(LetterString.charAt(index)); //The randomly chosen characters will be added to the StringBuilder at chosen index	 
			}

			Patients.add(sb.toString()); //Adds the people name into the patients line linked list
			sb.delete(0, 5);
		}
		return Patients; 
	}

	public static void quarantineDay(int time) throws InterruptedException  { //Just a function so we can simulate time

		long t= System.currentTimeMillis();
		long end = t+time;

		while(System.currentTimeMillis() < end) {
			for (int t1=1; t1 < 14; t1++) {

				System.out.print("Day-" + t1 + "...");
				Thread.sleep(time); //Will sleep based on the time we put in
			}

			System.out.println("..........");
			Thread.sleep(time);	
		}
	}

	public static void waitingForSample(int time2) throws InterruptedException  { //Just a function so we can simulate time
		long waitingt= System.currentTimeMillis();
		long ends = waitingt+time2;
		while(System.currentTimeMillis() < ends) {
			for (int t1=1; t1 < 4; t1++) {

				System.out.print("Sample being taken...");
				Thread.sleep(time2);
			}
			System.out.println("Almost done..........");
			Thread.sleep(time2);  //Will sleep based on the time we put in
		}
	}

	public static void resultsTime(int time3) throws InterruptedException  { //Just a function so we can simulate time

		long resultsTime= System.currentTimeMillis();
		long end3 = resultsTime + time3;

		while(System.currentTimeMillis() < end3) {
			for (int t1=1; t1 < 4; t1++) {

				System.out.print("Day" + t1 + "...");
				Thread.sleep(time3);
			}
			System.out.println("..........");
			Thread.sleep(time3);  //Will sleep based on the time we put in
		}
	}

	public static void patientTesting() throws InterruptedException{ //This functions tests as well as removes patients from the line as well as adds to quarantine list

		for (int j = 0; 0 < Patients.size(); j++) { //For loop so it will keep on looping untill our linked list is empty

			System.out.println("Patient - " + Patients.getFirst() + ", Please come in so we can take your sample"); //We will call out the patient fist on the list

			waitingForSample(3000); // Call Time simulation function

			System.out.println("We have taken your sample, you should get your results back in 3 to 4 days");

			resultsTime(3000); // Call Time simulation function

			String firstPerson = "Firstperson"; 
			firstPerson = Patients.getFirst(); //We assign the first person on the list to the string we declared firstPerson
			System.out.println("Test results are out!");
			int chance;
			chance = randGen.nextInt(9) + 1; //Generate random number from 1 upto 10, 1 being only one percent probability of getting COVID while 2 - 10 being probability of not getting covid
			String testResult;

			if (chance <= 2) { //I just put in 20% because it took a long time for me to test
				testResult = "Positive"; //Patients will test positive having 2% chance out of 10
				System.out.println("You have tested " + testResult + ", thus you have been moved to quarantine for 14 days");
				Patients.remove(firstPerson); //We will remove the person from the testing line when positive
				quarantine.add(firstPerson); //We will add the removed person to the quarantine line
				//System.out.println("List size is now"  + Patients.size());
			} else { //Else meaning if the random number is above 2 and at or below 10 then the person is negative 
				testResult = "Negative";
				System.out.println("You have tested " + testResult + ", you are safe from the virus!, come test again soon!");
				Patients.remove(firstPerson); //We will remove person from the list 
				Patients.addLast(firstPerson); //We will add person back into the list but at the end of the list 
			}

			System.out.println();
			System.out.println("Patients currently inline to be tested - " + Patients ); //Display the no of people inline for testing 
			System.out.println("Patients that are in quarantine" + quarantine); //Display the no of people in quarantine
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

	public static void removeFromQuarantine() throws InterruptedException { // Function that removes people from quarantine 

		for (int i = 0; 0 < quarantine.size(); i++)  {  //as long as the arraylist is not empty it will keep on looping 

			quarantineDay(1000); //Call out the time simulating function for 14 days
			String FirstpersoninArray = "FirstpersoninArray";

			FirstpersoninArray = quarantine.get(0); //Assigns the firstperson in that array list to the string firstpersoninArray
			System.out.println("Patient - " + FirstpersoninArray + " you are free of COVID, you can get out of quarantine!");

			quarantine.remove(FirstpersoninArray); //We will remove the first person since 14 days has passed will continue for all the names in the list
			System.out.println("Patients that are in quarantine" + quarantine); //List number of people that are in quarantine
			System.out.println();
			System.out.println();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		nameGenerator(); //Call the name generator method so we can get 10 words qith 5 letters. Method also put these names in the liked list

		System.out.println("Welcome to the COVID Testing Center Patients."); //Displaying welcome messages
		System.out.println(Patients); //List out the patients names waiting in the line
		System.out.println("We will now begin the testing");
		System.out.println();
		System.out.println();

		patientTesting(); //Call this method so all the testing gets processed 

		System.out.println("Patients that are in quarantine" + quarantine);
		System.out.println();

		removeFromQuarantine(); //Calls the removeFromQuarantine so as to remove people who were in quarantine

		System.out.println();
		System.out.println();
		System.out.println("We are saved! there are no more people with COVID"); //Display the end message

	}
}
