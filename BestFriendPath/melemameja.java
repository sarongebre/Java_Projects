package testingCenter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CovidTestingCenter {
	static //int j = 0;
	ArrayList<String> quarantine = new ArrayList<>(); //Array list to store the names so we don't have to hardcod everytime

	private static Random randGen = new Random();
	static LinkedList<String> Patients = new LinkedList<String>(); 

	private static LinkedList<String> nameGenerator() {

		String AlphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder(5);

		//for (int j=0; j <= 10; j++) {
		while (Patients.size() < 10) {

			for (int i = 0; i < 5; i++) { 
				// generate a random number between 
				// 0 to AlphaNumericString variable length 
				int index 
				= (int)(AlphaString.length() 
						* Math.random()); 
				// add Character one by one in end of sb 
				sb.append(AlphaString 
						.charAt(index)); 

			}
			//System.out.println(sb);
			Patients.add(sb.toString());
			sb.delete(0, 5);
			//System.out.println();

		}
		return Patients; //sb.toString();
	}

	public static void quarantineDay(int time) throws InterruptedException  {

		long t= System.currentTimeMillis();
		long end = t+time;

		while(System.currentTimeMillis() < end) {
			for (int t1=1; t1 < 14; t1++) {

				System.out.print("Day-" + t1 + "...");
				Thread.sleep(time);
			}

			System.out.println("..........");
			Thread.sleep(time);	
		}
	}

	public static void waitingForSample(int time2) throws InterruptedException  {
		long waitingt= System.currentTimeMillis();
		long ends = waitingt+time2;
		while(System.currentTimeMillis() < ends) {
			for (int t1=1; t1 < 4; t1++) {

				System.out.print("Sample being taken...");
				Thread.sleep(time2);
			}
			System.out.println("Almost done..........");
			Thread.sleep(time2);
	}}

	public static void resultsTime(int time3) throws InterruptedException  {
		
	
		long resultsTime= System.currentTimeMillis();
		long end3 = resultsTime + time3;

		while(System.currentTimeMillis() < end3) {
			for (int t1=1; t1 < 4; t1++) {

				System.out.print("Day" + t1 + "...");
				Thread.sleep(time3);
			}
			System.out.println("..........");
			Thread.sleep(time3);
	}
}

	//String AlphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 

	// create StringBuffer size of AlphaNumericString 


	public static void main(String[] args) throws InterruptedException {

		///testing

		nameGenerator();




		//System.out.println(Patients.get(2));

		// while (Patients.isEmpty() == false) 
		{
			System.out.println("Welcome to the COVID Testing Center Patients.");
			System.out.println(Patients);
			System.out.println("We will now beging the testing");


			System.out.println();
			System.out.println();

			/*for (int i = 0; i < Patients.size(); i++)
				System.out.println("Patient " + Patients.get(i));
			System.out.println("Your testing will now beging");*/






			for (int i = 0; 0 < Patients.size(); i++) {
				//if (i == 10) {
				//	break;
				//} 

				System.out.println("Patient - " + Patients.getFirst() + ", Please come in so we can take your sample");

		
				waitingForSample(3000);
				 
				System.out.println("We have taken your sample, you should get your results back in 3 to 4 days");

				resultsTime(3000);

				String firstPerson = "Firstperson";

				firstPerson = Patients.getFirst();
				//Patients.indexOf(firstPerson);
				System.out.println("Test results are out!");
				int chance;
				chance = randGen.nextInt(9) + 1;
				String testResult;
				if (chance <= 2) {
					testResult = "Positive";
					System.out.println("You have tested " + testResult + ", thus you have been moved to quarantine for 14 days");
					Patients.remove(firstPerson);
					quarantine.add(firstPerson);
					System.out.println("List size is now"  + Patients.size());
				} else {
					testResult = "Negative";
					System.out.println("You have tested " + testResult + ", you are safe from the virus!, come test again soon!");
					Patients.remove(firstPerson);
					Patients.addLast(firstPerson);
				}
				System.out.println();
				System.out.println("Patients currently inline to be tested - " + Patients );
				System.out.println("Patients that are in quarantine" + quarantine);
				System.out.println();
				System.out.println();
				System.out.println();
			}

			System.out.println("Patients that are in quarantine" + quarantine);
			System.out.println();


			for (int i = 0; 0 < quarantine.size(); i++)  { 

				quarantineDay(1000);
				String FirstpersoninArray = "FirstpersoninArray";

				FirstpersoninArray = quarantine.get(0);
				System.out.println("Patient - " + FirstpersoninArray + " you are free of COVID, you can get out of quarantine!");

				quarantine.remove(FirstpersoninArray);
				System.out.println("Patients that are in quarantine" + quarantine);
				System.out.println();
				System.out.println();
			}

System.out.println();
System.out.println();
System.out.println("We are saved! there are no more people with COVID");






			//System.out.println(Patients.get(0));

			//}


		}
	}
}


/*long t= System.currentTimeMillis();
		long end = t+6000;

		while(System.currentTimeMillis() < end) {
			for (int t1=1; t1 < 4; t1++) {

				System.out.print("Day" + t1 + "...");
				Thread.sleep(6000);
			}
			System.out.println("..........");
			Thread.sleep(3000);

 */
/*
The CDC has asked you to build a simulation of a Covid Testing Center.  You must use at least two different data structures.

You will simulate a line of patients waiting for a test.  Each patient will step into the testing center,  get their test and then you will simulate a waiting period of approximately 3.75 seconds.  After that point you will randomly determine whether they are positive or negative.  If negative, they will return to the end of the line for further testing.  If positive, they will go into a quarantine period (simulate 14 days - your design).  Manage both the line and the quarantined patients in this simulation.  The simulation stops when there is no more patients in the line and once that happens, make sure your quarantined people are slowly removed from their quarantine as well.  Then - Covid is gone!

Grades Requirements:

- Start with 10 patients in your initial line. 

- Simulate testing - the CDC states that 1% of the people tested, test positive.  If you can, try to add that to your testing simulation.  You will see many more negatives, than positives as you progress. 

- Negative go to back of line

- Positives go into quarantine for a simulated 14 day period (once out of quarantine, if the line still has patients (meaning we still have Covid), then the go back to the end of the line.

If no one is left in the line, they are free and Covid is gone!

- Since we don't want to know patients real name, you must generate a 5 digit string of characters - make that random so they are unique.

- Once line has no more patients, make sure all quarantined are free (simulate some time passing) and then print Covid is gone!  Or something like that.

- Make your interface as informative and creative as you feel like making it.

- Comment your code

- Submit zip file of project and submit screen shots of code and output (several partial - like mine below) showing the simulation moving forward.

- Submit no later than Nov 20th!

Your output will be large so here are a few samples from my output.

First - testing and waiting for the results:

(I have a sleep function waiting for 3.75 secs and print out ...  (dots) as they wait)

~Covid Testing Center~
---Begin Testing---

Patient Name: ldgkh <----- notice random characters for unique name
~ Processing Specimen ~
........................ <----- this is slowly printing dots to the screen to simulate waiting

A negative test:

Patient Name: ldgkh
~ Processing Specimen ~
..............................

ldgkh has tested negative!
ldgkh will now go to the end of the testing line!

A positive test:

Patient Name: tunin
~ Processing Specimen ~
..............................

tunin has tested positive!
tunin is now quarantined for 14 days!



Continually display testing line and quarantined list:

Testing line: qcxax rojcx vgzfp tzkjp ptbaa tdsxe vdsnq jqvlo 

Quarantined: [hyjvu, tunin]



Finally line is empty and all quarantined are free - after a lapsed time like:

No more to test!

Quarantined: [hsgum, fqdrp, nyqwm, fmxnn, micow, ezwdh, fckae, wdwsf, oaqkk, itmjd]
Time passes .....
I'm free! ~ hsgum
Time passes .....
Time passes .....
Time passes .....
Time passes .....
I'm free! ~ fqdrp
Time passes .....
Time passes .....
Time passes .....
Time passes .....
I'm free! ~ nyqwm
Time passes .....
Time passes .....
Time passes .....
I'm free! ~ fmxnn
Time passes .....
Time passes .....
I'm free! ~ micow
Time passes .....
I'm free! ~ ezwdh
Time passes .....
Time passes .....
Time passes .....
I'm free! ~ fckae
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
I'm free! ~ wdwsf
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
I'm free! ~ oaqkk
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
Time passes .....
I'm free! ~ itmjd

 **Covid is gone!**



 */

