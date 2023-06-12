/********************************************************************************************************
 * Program: Simply Math Tutor version 2
 *Written by: Saron Gebre
Date: 2019.10.06
Description: The program requirements include
1) Header
2)User Friendly Intro explaining the rules of the game
3) Has a while loop to know how long a user wants to play and an inner while loop that loops
   until the user enters a word starting by either y(continue) or n(stop).
4) Lets user answer random math questions and determine the type of math operator. switch statement
   to properly set the random umbers.
5) Using for loops for giving 3 attempts per question and if statements for different outputs
6) Track number of correct and total questions to calculate and display user's percentage
7) End the program with  a user friendly information.
 *********************************************************************************************************/
///dont forgot java doc ebay stuff
///** for method @param varibale namea and descruption 
// *@see
// *@return
// *
//*
// *at class, methods, class variables should be java doced are doced  @author 
// *@version 
// */

package MathTutor;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

//import java.io.IOException;

/**
 * Program reports the fees charged by ebay.com given an item's 
 * selling price.
 *
 * @author Saron Gebre 
 * @version 5.0
 */
public class MathTutor {

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static Scanner scnr = new Scanner(System.in);

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */

	private static Random randGen = new Random();
	//int[] row = new int[4];
	//int [][] resultsVector = new int [][4];

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */

	private static List<List> resultsVector = new ArrayList<List>();

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static List<Integer> row = new ArrayList<Integer>();

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */

	private static int percentage = 0;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int random1 = 0;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int random2 = 0;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int randomOperator = 0;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int realAnswer = 0 ;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int temp = 0; //A temporary variable we will use to store random1's value to the assign it to random2 to not get a negative value

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int totalCorrectAns = 0;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int totalQuestions = 0;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static int userAnswer = 0;

	/**           !!!CLASS VARIABLE!!!
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static String start;

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static String userCont = "y";

	/**
	 * Program reports the fees charged by ebay.com given an item's 
	 * selling price.
	 *
	 * @author Saron Gebre 
	 * @version 5.0
	 */
	private static char questionOperator = '*';

	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	      
	public static void DisplayWelcomeMsg() 
	{

		System.out.println("Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math");
		System.out.println("*   ##     ##    ###    ######## ##     ##    ######## ##     ## ########  #######  ########      #######     *");
		System.out.println("*   ###   ###   ## ##      ##    ##     ##       ##    ##     ##    ##    ##     ## ##     ##    ##     ##    *");
		System.out.println("*   #### ####  ##   ##     ##    ##     ##       ##    ##     ##    ##    ##     ## ##     ##           ##    *");
		System.out.println("*   ## ### ## ##     ##    ##    #########       ##    ##     ##    ##    ##     ## ########      #######     *");
		System.out.println("*   ##     ## #########    ##    ##     ##       ##    ##     ##    ##    ##     ## ##   ##      ##           *");
		System.out.println("*   ##     ## ##     ##    ##    ##     ##       ##    ##     ##    ##    ##     ## ##    ##     ##           *");
		System.out.println("*   ##     ## ##     ##    ##    ##     ##       ##     #######     ##     #######  ##     ##    #########    *");
		System.out.println(" Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math_Math");

		System.out.println("\t \t \t \t \t Welcome to the MATH TUTOR GAME 2!!");//user friendly title
		System.out.println("\t \t \t Are you ready to answer even more challenging mathematics questions!?"); //user friendly introduction
		System.out.println("..........................................................................................................");
		System.out.println("These are the rules and description of the game:");//Outputting the description of the game.
		System.out.println("1) Get ready to answer as many Mathematic questions you may want to try. You can stop the game when ever you like to.");
		System.out.println("2) The mathematics questions include addition, subtraction, multiplication, or division.");
		System.out.println("3) You get 3 attempts to answer each question correctly." );
		System.out.println("4) If you don't get to answer the question with your 3 chances, that question will be considered wrong and will result");
		System.out.println("in a decrease in your overall score");
		System.out.println("5) You will see the total percentage score after each question you answered right or wrong.");
		System.out.println("6) you will also see the total number of questions you have answered so far, and the total number of correct answers you got.");
		System.out.println("...........................................................................................................");

	}

	/***************************************************************************
	 * Character Buffer File Stream Reading
	 * Used BufferedReader to improve speed of execution.
	 * 
	 * @throws Exception used to return an error message back to the main method 
	 ****************************************************************************/
	// Ineed something in here that clears the database. or not i guess just delete results.txt
	private static void displayPreviousResults() throws Exception {

		//this variable will be used to store each line from the file as it is read line by line
		String inputLine = null;

		//we have to define the BufferedReader here (instead of in the try block)
		//because we need it also accessible in the catch block
		//but we do NOT instantiate (create) it here because it could fail to get a hold of the file
		BufferedReader br = null;


		try {

			//instantiate (create) the BufferedReader inside the try in case it fails to get a hold of the file
			br = new BufferedReader(new FileReader("results.txt"));

			//keep looping, we will MANUALLY break out when the input line is null at end of file
			while (true) { 

				//read a line from the file
				inputLine = br.readLine();

				//if the line is empty we must be at the end of the file so break out of the while loop
				if(inputLine == null) 
					break;

				//create an empty single dimensional ArrayList
				ArrayList<Integer> row = new ArrayList<Integer>();

				//break the LONG string line into 4 individual strings and store it in an Array
				String[] lineNumbers = inputLine.split(" ");

				//Short way to for loop through an array, one number at a time
				for (String num : lineNumbers) {
					//add each number to the row ArrayList
					row.add(Integer.parseInt(num));
				}

				//Add the row of 4 numbers to the 2D List
				resultsVector.add(row);

			} //end of while loop that reads the file line by line

			//close the file
			br.close();
			System.out.println("Looks like you have played before here are your previouse reslts");
			System.out.println(randomOperator );
			DisplayResultsReport();

			//if the file is not found then do NOT throw an error, instead just tell the user there was no file
			//this catch does NOT throw an error back to main
		} catch (FileNotFoundException ex) {

			System.out.println("Looks like you have not played before");

			//if a runtime error occurs, handle it by displaying the error, and throwing an error back to main
		} catch (Exception ex) {

			ex.printStackTrace();

			//make sure the file close even when there is an error
			br.close();

			throw new Exception("Error reading from results.txt");

		} //end of catch	

	} // end of read2dListFromFile


	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	

	public static void GenerateQuestion() {
		random1 = randGen.nextInt(10) + 1;
		random2 = randGen.nextInt(10) + 1;
		randomOperator = randGen.nextInt(4);

		switch (randomOperator) {

		case 0:
			questionOperator = '+';
			realAnswer = random1 + random2;
			break;
		case 1:
			questionOperator = '-';
			if (random1 < random2)
				temp = random1;
			random1 = random2;
			random2 = temp;

			realAnswer = random1 - random2;

			break;
		case 2:
			questionOperator = '*';
			realAnswer = random1 * random2;
			break;
		case 3:
			questionOperator = '/';
			realAnswer = random1;
			random1 = random1 * random2;
			break;

		default : //return -1 ?????
			break;
		}

		System.out.println(random1 + " " + questionOperator + " " + random2 + " =" + "______"); //Outputing the mathematic question for the uses
		System.out.print("-->");

	}
	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	
	public static void GetUserAnswer () {

		for (int i = 2; i >= 0; --i ) {

			while (!scnr.hasNextInt()){

				scnr.nextLine();
				System.out.print("Yo put in a number: ");
			}

			userAnswer = scnr.nextInt();
			scnr.nextLine();

			if (userAnswer == realAnswer)
			{
				totalCorrectAns++;

				System.out.println("____________________________________________");
				System.out.println("Bravo! You have answered the question right!");
				break;
			}
			else     //if user answer is not equal to real answer, the statements below will execute
			{

				if (i > 0)   //As I in the for loop decrements, as long as i is greater than 0, this else statement will continue to execute every time the for loops loops.
				{
					System.out.println("_________________________________________________________________________________________");
					System.out.println("Sorry your answer is not correct. Please try again.");
					System.out.println("Don't forget that you have >> " + i + " << attempts left. Take your time, don't rush:-)");
					System.out.println("_________________________________________________________________________________________");
					System.out.println("-->");
				}
			}

			if (i == 0)   // if i equals to zero, this means that the user have used all 3 of his/her attempts so the output statements below will execute
			{
				System.out.println("______________________________________________________________________");
				System.out.println("Sorry,you have used all attempts for this question, the answer was " + realAnswer); //output the question's answer and having no attempts
			}
		}//end of for loop

		List<Integer> row = new ArrayList<Integer>();

		row.add(random1);
		row.add(random2);
		row.add(randomOperator);		
		row.add(userAnswer);

		resultsVector.add(row);

	}
	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	

	public static void displayPercentCorrect() {
		percentage = (totalCorrectAns * 100) / totalQuestions;//calculate the percentage score of the user. Executes for every question because it is after the for loop

		System.out.println("Your current score is " + percentage + "%");// Outputs the percentage

		if (percentage <= 20)   //user friendly and encouraging output if percentage is <20
		{
			System.out.println("Don't worry, you got this! keep on trying, you will get a better score");
		}
		else if ((percentage > 20) & (percentage <= 50))     //encouraging output if percentage is b/n 20 and 50
		{
			System.out.println("Keep on trying, you can get a better score");
		}
		else if ((percentage > 50) & (percentage <= 80))    //encouraging output if percentage is b/n 50 and 80
		{
			System.out.println("Great score! don't stop now, keep on trying to get over 80!");
		}
		else
		{
			System.out.println("Wonderful score! keep it up!");
		}

	}
	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	
	public static void AskMathQuestion() {
		GenerateQuestion();
		GetUserAnswer();

		displayPercentCorrect();

	}
	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	

	public static void  DoYouWantToContinue() {
		System.out.println("____________________________________________");//use friendly line
		System.out.println("Do you want to keep on playing? \"Yes\" or \"No\""); //prompting the user if he/she wants to continue the game or not
		System.out.println("-->");

		Scanner scnrss = new Scanner(System.in);
		userCont = scnrss.nextLine(); //where the user enters either y to go loop the while loop again or enter n to get out of the while loop and stop the game

		while ( userCont.toLowerCase().charAt(0) != 'y' && userCont.toLowerCase().charAt(0) != 'n' )
		{
			System.out.println("invalid input. Please enter a word that starts with either y or n");

			userCont = scnr.nextLine(); // when I put next "line" it doesnt work???(This does not get the entire line) //where the user answer is stored
		}
	}
	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	
	public static void  DisplayResultsReport() {

		char operator = '+';
		//use setw print formate things 
		for (int i = 0; i < resultsVector.size(); ++i)
		{
			random1 = (int) resultsVector.get(i).get(0);
			random2 = (int) resultsVector.get(i).get(1);
			randomOperator = (int) resultsVector.get(i).get(2);
			userAnswer = (int) resultsVector.get(i).get(3);

			switch (randomOperator)
			{

			case 0:
				operator = '+';
				realAnswer = random1 + random2;
				break;

			case 1:
				operator = '-';
				realAnswer = random1 - random2;
				break;

			case 2:
				operator = '*';
				realAnswer = random1 * random2;
				break;

			case 3:
				operator = '/';
				realAnswer = random1 / random2;
				break;
			default :
				;

			}


			if ((int)resultsVector.get(i).get(3) == (int)realAnswer)
			{
				System.out.print("Correct! Yeeppy!"); 
				//+ "" + resultsVector.get(i).get(0) + " " + operator + " "  + resultsVector.get(i).get(1) + " = "+ resultsVector.get(i).get(3));
			}

			else
			{
				System.out.print( "Incorrect! Oh no! ");
			}
			//System.out.print(resultsVector.get(i).get(0) + " " + operator + " " + resultsVector.get(i).get(1) + " = " + resultsVector.get(i).get(3) + " The correct answer is " + realAnswer);

			System.out.printf("%3d %c %-3d = %3d \n", random1, operator , random2 , userAnswer );//randomoperator

		}

	}
	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	
	public static void saveResults() throws Exception {

		//we have to define the BufferedWriter here (instead of in the try block)
		//because we need it also accessible in the catch block
		//but we do NOT instantiate (create) it here because it could fail to get a hold of the file
		BufferedWriter bufwrite = null;

		//create 4 variable to store each row's numbers retrieved from the ArrayList



		try{

			//instantiate (create) the BufferedWriter inside the try in case it fails to get a hold of the file 
			bufwrite = new BufferedWriter(new FileWriter("results.txt"));

			//loop through the 2D ArrayList one row at a time
			for (int i = 0; i < resultsVector.size(); i++) {

				//unblock the wrapper Integer back to the primitive data type of int				
				random1 = (int) resultsVector.get(i).get(0);
				random2 = (int) resultsVector.get(i).get(1);
				randomOperator= (int) resultsVector.get(i).get(2);
				userAnswer = (int) resultsVector.get(i).get(3);

				//write each int to the file, separated by a space
				bufwrite.write(random1 + " " + randomOperator + " " + random2 + " " + userAnswer);

				//ONLY send a new line to the file if it's NOT the last row
				if (i != resultsVector.size() - 1)
					bufwrite.write("\n");
			}		

			bufwrite.flush(); //make everything is written to the hard drive
			bufwrite.close(); //and then close the file

		} catch (Exception ex) {

			bufwrite.flush(); //even if there is an error we should make sure everything is written to the hard drive
			bufwrite.close(); //even if there is an error, we should make sure we close the file if open

			//print the error, and the entire log of where it started from 
			ex.printStackTrace();

			//throw an error back to the main method
			throw new Exception("Error writing to resultVector.txt");
		}

	} // end of writeTo2dListToFile	

	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	
	public static void DisplayClosingMsg() {
		System.out.println("\t \t \t \t  Good practice! Your overall score is " + percentage + "%");
		System.out.println("\t \t Total questions attempted = " + totalQuestions + "     Correct questions");
		System.out.println(" answered = " + totalCorrectAns);
		System.out.println("Thank you for playing! Please play again next time in order to beat your previous score! See you soon!");
		System.out.println("........................................................................................................");	
	}
	// algebam genertae questn wust >> totalQuestions++;



	/**
	 *                   !!!!METHOD JAVADOC!!
	 * Returns fees charged by ebay.com given selling price of
	 * fixed-price books/movies/music/video-games. $0.50 to list
	 * plus 13% of selling price up to $50.00, %5 of amount from
	 *  $50.01 to$1000.00, and 2% for amount $1000.01 or more.
	 * 
	 * @param sellPrice the item's selling price
	 * @return a double representing the imposed fees
	 *  @see "http://pages.ebay.com/help/sell/fees.html"
	 */	  	


	public static void main(String[] args) throws Exception {
		try {
			DisplayWelcomeMsg();

			displayPreviousResults();
			//GenerateQuestion();
			//GetUserAnswer ();
			//displayPercentCorrect();

			while  (userCont.toLowerCase().charAt(0) == 'y') {
				totalQuestions++;
				AskMathQuestion();
				DoYouWantToContinue();
			}
			DisplayResultsReport();
			saveResults();
			DisplayClosingMsg ();
		} catch (Exception ex) {

			//display the error that was thrown back to main
			System.out.println(ex.getMessage());
			//let the user know the program ended with an error
			System.out.println("Sorry! This program ended with an error!");
		}
		return;


		//vector<int> row;
		//row.push_back(random1);
		//row.push_back(random2);
		//row.push_back(randomOperator);
		//row.push_back(userAnswer);
		//Listrandom1 = new ArrayList();



		//row.add(userAnswer);

		//System.out.println();






		//Work to be done here Write if percentage good score keep up good work"


	}



}

//System.out.print( random1 + " " + questionOperator + " " + random2 + "=" + "______" ) ;

//Scanner scnr = new Scanner(System.in);


//userAnswer = scnr.nextInt();
//if(userAnswer == realAnswer){
//	System.out.println("Answer for question 1 is correct!" + random1 + questionOperator + random2 + " is " + "=" + realAnswer);
//} else                  {
//System.out.println(" Sorry, Answer for question 2 is not correct, " + random1 + questionOperator +  random2 + "=" + realAnswer  );
//}}







