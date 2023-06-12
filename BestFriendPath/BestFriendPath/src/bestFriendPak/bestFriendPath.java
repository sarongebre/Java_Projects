package bestFriendPak;

import java.util.LinkedList; //import already existing linked list class
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class bestFriendPath {

	LinkedList<String> path1 = new LinkedList<String>(); //Create new linked list methods can use called path1 (Bob - Castor)
	LinkedList<String> path2 = new LinkedList<String>(); //Create new linked list methods can use called path2 (Bob - Alice)
	private static Scanner dP;

	private LinkedList<String> allList1() { //Create private LinkedList return type method to add all the names going forward

		path1.addFirst("Bob"); //We use addfirst so the program knows which value is the head or start
		path1.add("Alice"); //We use add function so it will add this as second
		path1.add("Peter"); //We use add function so it will add this as third
		path1.add("Atia");  //We use add function so it will add this as fourth
		path1.add("Sam"); //We use add function so it will add this as 5th
		path1.add("Titus"); //We use add function so it will add this as 6th
		path1.add("Paula"); //We use add function so it will add this as 7th
		path1.add("Vita"); //We use add function so it will add this as 8th
		path1.add("Barb"); //We use add function so it will add this as 9th
		path1.add("Falco"); //We use add function so it will add this as 10th
		path1.add("Marco"); //We use add function so it will add this as 11th
		path1.addLast("Castor"); //We use add function so it will add this as second 12th

		return path1;
	}

	private LinkedList<String> allList2() { //Create private LinkedList return type method to add all the names going backwards

		path2.addFirst("Bob"); //We use addfirst so the program knows which value is the head or start
		path2.add("Castor"); //We use add function so it will add this as second
		path2.add("Marco"); //We use add function so it will add this as third
		path2.add("Falco");  //We use add function so it will add this as fourth
		path2.add("Barb"); //We use add function so it will add this as 5th
		path2.add("Vita"); //We use add function so it will add this as 6th
		path2.add("Paula"); //We use add function so it will add this as 7th
		path2.add("Titus");//We use add function so it will add this as 8th
		path2.add("Sam");//We use add function so it will add this as 9th
		path2.add("Atia");//We use add function so it will add this as 10th
		path2.add("Peter"); //We use add function so it will add this as 11th
		path2.addLast("Alice"); //We use add function so it will add this as 12th

		return path2;
	}

	private void display() { //Call the other methods and displays the output

		ArrayList<String> destinationC = new ArrayList<>(); //Array list to store the names so we don't have to hardcod everytime
		destinationC.add("Sam"); //Adding the name Sam to the array list called destinationC
		destinationC.add("Paula"); //Adding the name Paula to the array list called destinationC
		destinationC.add("Barb");   //Adding the name Paula to the array list called destinationC
		destinationC.add("Titus"); 
		destinationC.add("Vita");
		destinationC.add("Tom");

		allList1(); //Call this method so the first path gets executed 
		allList2();   //Call this method so the secon dpath gets executed

		for (String i : destinationC) { //For loop so it can loop and print out all the names inside the Array list starting at index 0 till the end
			System.out.println("Best friend path from Bob-" + i + " is: ~ ");
			bestRoute(i);
			System.out.println();
		}    

		System.out.println("You are now at Bob's house, choose another destination?"); //Asking user if they would want the program to print another path (Bob - peter)
		dP = new Scanner(System.in); //Scanner object called dp created so as to recieve input from user
		String chosenName = dP.nextLine();
		System.out.println("You have chosen" + chosenName);//Displays chosen destination 
		destinationC.add(chosenName); //added to our arraylist
		System.out.println(destinationC);

		for (String i : destinationC) {
			bestRoute(i); //This calls the bestRout method for the new destination name the user chose
		}
	}

	private Integer bestRoute(String name) { //Create an integer method that will pass the destination name
		int bestPath = 0;

		int position; 
		position = path1.indexOf(name); //We will need to find out where that name is with in the path1 list. This is then assigned to variable "position" to make it easier

		int position2;
		position2 = path2.indexOf(name); //We will need to find our where that name is with in the path2 list. This is then assigned to variable "position2" to make it easier

		if (position == -1 || position2 == -1) { //Comapare the index positions. IndexOf will result negative one if name not found so we test this first
			System.out.println("Name " + name + " not found in path list");	
		} else {

			if (position > position2) { //if the name was found we can go ahead and compare the index's the name was found from the two different path
				bestPath = position2; //We will assign best path to position to just incase we would want to display the number comparison but that is not on the exam requirement so I have opted it out.

				for (int j = 0; j <= bestPath; j++) { //Print out out the names from path 2 until we reach the name with the index we are looking for
					if (j != bestPath) {
						System.out.print(path2.get(j) + "  >>  ");
					}
					if (j == bestPath) {  //This is just created because, my out put displayed  "  >>  " at the end of the path
						System.out.print(path2.get(j));
					}		
				}
			}
			else if (position < position2) { 
				bestPath = position;
				for (int j = 0; j <= bestPath; j++) { //Print out out the names from path 1 until we reach the name with the index we are looking for
					if (j != bestPath) {
						System.out.print(path1.get(j) + "  >>  ");
					}
					if (j == bestPath) { //This is just created because, my output displayed  "  >>  " at the end of the path
						System.out.print(path1.get(j));				}
				}
			}
			else {
				bestPath = position;
				System.out.println("::Path 1 and Path 2 are equal!::"); 
				for (int j = 0; j <= bestPath; j++) { //Print out out the names from path 1 until we reach the name with the index we are looking for. I just chose path one because path 1 = path 2;
					if (j != bestPath) {
						System.out.print(path1.get(j) + "  >>  ");
					}
					if (j == bestPath) {
						System.out.print(path1.get(j));
					}
				}
			}
			System.out.println();
		}
		return bestPath;
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		bestFriendPath path = new bestFriendPath(); //We create an object so as not to use static for the methods
		path.display(); //Will just call the display method as the display method has all the other methods with in it
	}
}


