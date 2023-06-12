package zoo.ui;
import java.util.Random;

//import ui.collections.Animal;
//import ui.collections.Exhibit;
import ui.collections.*; //instead of importing entire package

// zzooo keeper is going to be our test bench
public class ZooKeeper {
	///this is always static for class method, there is only one 
	//it is not a member method per object

	public static void testBench() {
		//data type is animal? why/ it should match class name
		//Animal 1 and 2 are objects ..Initnatiated via the animal class
		Animal animal1 = new Animal(); //instansiation  //new is a keyword
		Animal animal2 = new Animal(); //instansiation  
		//Animal 1 and 2 are reference varibales which refer to an instance of a class
		Animal animal3 = new Animal();

		System.out.println(animal1);
		System.out.println(animal2);

		//Animal@7852e922 there are both in to two different memory location 
		//Animal@4e25154f there are both in to two different memory location
		/*
		   // class fields are private so we can no longer directly access these fields 
		 animal1.age = 1;
		 animal2.age = 2;

		 System.out.println(animal1.age);
		 System.out.println(animal2.age );
		 */



		//unit test to verify setAge is working correctly----------------

		animal1.setAge(-1);
		if(animal1.getAge() == -1) {

			System.out.println("Huston we got a bug. Invalid age " + animal1.getAge()); 
		}


		//unit test to verify setAge is working correctly--------------------------

		animal1.setGender("test");

		if(animal1.getGender().equals("test")) {

			System.out.println("Huston we got a bug. Invalid gender " + animal1.getGender()); 
		}


		//unit test to verify setWeight is working correctly--------------------------

		animal1.setWeight(-1);

		if(animal1.getWeight() == -1) {

			System.out.println("Huston we got a bug. Invalid weight " + animal1.getWeight()); 
		}












		//. is a member access operator
		animal1.setAge(1);
		animal2.setAge(2);

		System.out.println("Animal 1 age better be 1: " + animal1.getAge());
		System.out.println("Animal 2 age better be 2: " + animal2.getAge());

		animal1.setGender("male");
		animal2.setGender("female");

		System.out.println("Animal 1 gender better be male: " + animal1.getGender());
		System.out.println("Animal 2 gender better be female: " + animal2.getGender());

		animal1.setWeight(100.1f);
		animal2.setWeight(200.87f);

		System.out.println("Animal 1 weight better be 100.1: " + animal1.getWeight());
		System.out.println("Animal 2 weight better be 200.87: " + animal2.getWeight());




		System.out.println("Animal 3 ages " + animal3.getAge() + " Animal3 gender " + animal3.getGender() + " Animal3 weight " + animal3.getWeight());

		Animal animal4 = new Animal(4, "male", 400.4f);

		System.out.println("Animal 4 ages " + animal4.getAge() + " Animal4 gender " + animal4.getGender() + " Animal4 weight " + animal4.getWeight());


	}

	public static void create3Animals() {
		//create 3 animals using the overloaded constructor to inatniate 3 new objects
		Animal animal1 = new Animal(1, "female ", 100.1f);
		Animal animal2 = new Animal(2, "female ", 200.21f);
		Animal animal3 = new Animal(3, "female ", 300.3f);

		animal1.displayInfo(); //for memebr methods use object name
		animal2.displayInfo();
		animal3.displayInfo();

		Exhibit lionExhibit = new Exhibit("Lion", 2);

		if(lionExhibit.addAnimal(animal1)) {
			System.out.println("I was able to add animal1 to Lion Exhibit");
		} else {
			System.out.println("unable to add animal1 to the Lion Exhbit because its full");
		}


		if(lionExhibit.addAnimal(animal2)) {
			System.out.println("I was able to add animal2 to Lion Exhibit");
		} else {
			System.out.println("unable to add animal2 to the Lion Exhbit because its full");
		}

		if(lionExhibit.addAnimal(animal3)) {
			System.out.println("I was able to add animal3 to Lion Exhibit");
		} else {
			System.out.println("unable to add animal3 to the Lion Exhbit because its full");
		}
		//get ANIMAL works or not

		try {
			Animal animal = lionExhibit.getAnimal(1);
			System.out.print("Animal1 found: ");
			animal.displayInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}




		try {
			Animal animal = lionExhibit.getAnimal(2);
			System.out.print("Animal2 found: ");
			animal.displayInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}



		try {
			Animal animal = lionExhibit.getAnimal(3);
			System.out.print("Animal3 found: ");
			animal.displayInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		////////////////////////////delete below

		try {
			Animal animal = lionExhibit.deleteAnimal(1);
			System.out.print(" Animal1 deleted: ");
			animal.displayInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " Unable to delete! ");
		}



		//you can remove xomment to delete animal 2
		/*try {
					Animal animal = lionExhibit.deleteAnimal(2);
					System.out.print(" Animal2 deleted: ");
					animal.displayInfo();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage() + " Unable to delete! ");
				}

		 */

		try {
			Animal animal = lionExhibit.deleteAnimal(3);
			System.out.print(" Animal 3 deleted: ");
			animal.displayInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " Unable to delete!  ");
		}


		lionExhibit.displayInfo();


	}

public static void exhibitTestBench(){
	
	Random randGen = new Random();		

	try { 

		Exhibit lionExhibit = new Exhibit("Lion", 5);
		for (int i = 0; i < lionExhibit.getCapacity(); i++) {

			int age = randGen.nextInt(100) + 1;

			String gender = (age % 2 == 0) ? "female" : "male"; //instead of using if else
			float weight = randGen.nextFloat() * 1000;

			Animal animal = new Animal(age, gender, weight);

			//display memory location uniquw
			System.out.println(animal);

			lionExhibit.addAnimal(animal);
		}
		lionExhibit.displayInfo();

		Animal animal = lionExhibit.getAnimal(2);
		animal.setAge(22);
		animal.setWeight(222.222f);
		
		lionExhibit.displayInfo();
		
	} catch(Exception e)

	{
		System.out.println(e.getMessage());

	} //end of try cacth

}	//end of main
	
	
	



	public static void main(String[] args) {
		//since we put static we need not need to put this.testBench();
		//running our class method sone testing
		//ZooKeeper.testBench();


		//since static we don't need to create(Inantiate) a new object
		//ZooKeeper myZooKeeper = new Zookeeper();
		//myZooKeeper.create3Animals();
		//test bench for creating 3 animals and storing in the exhibit
		//add, get, delet animals in the exhibit
	///ZooKeeper.create3Animals();
		
		
Fish redFish = new Fish();//polymorshism complier knwos what to call
Fish blueFish = new Fish(1, "male", 10.5f);
Fish whiteFish = new Fish(2, "female", 5.5f, "debbie");

redFish.displayInfo();
blueFish.displayInfo();
whiteFish.displayInfo();

Exhibit randomAnimalExhibit = new Exhibit("Random", 100);

Animal myAnimal = new Animal();
myAnimal.displayInfo();

randomAnimalExhibit.addAnimal(myAnimal);
randomAnimalExhibit.addAnimal(redFish);

System.out.println("Debbie wants to polymphism here\n");//


try {
	randomAnimalExhibit.getAnimal(1).displayInfo(); //compilor doesn't know which display info to call in parent of fish
	
	randomAnimalExhibit.getAnimal(4).displayInfo();
	
} catch (Exception e) {
	
	System.out.println(e.getStackTrace());
}



System.out.println("Debbie wants to test if Animal equal a Fish using the override equals method test here\n");//


if(myAnimal.equals(redFish) ){ //==memory location we should compare via type
	
	System.out.println("myAnimal EQUALS red Fish");
}
else {
	
	System.out.println("myAnimal NOT EQUALS red Fish");

}



System.out.println("Debbie wants to test == peration here\n");//


if(redFish == blueFish) { //==memory location we should compare via type
	
	System.out.println("Red Fish == Blue Fish");
}
else {
	
	System.out.println("Red Fish not equal Blue Fish");

}



System.out.println("Debbie wants to test with the method EQUALS here\n, this uses override equals method testing");//


if(redFish.equals(blueFish)) { //==memory location we should compare via type
	
	System.out.println("Red Fish == Blue Fish");
}
else {
	
	System.out.println("Red Fish not equal Blue Fish");

}
System.out.println(redFish.type); //don't know if I should remove this or not

	myAnimal.eat();
	myAnimal.sleep();
	redFish.swim();
	redFish.eat();
	redFish.sleep();
	
	myAnimal.equals(redFish);
	
	System.out.println("\n override to string method testing");
	System.out.println(redFish);
	System.out.println(myAnimal);
	
	ZooKeeper.exhibitTestBench();
	
	System.out.println("\n Bird testing");
	Bird blackBird = new Bird();
	System.out.println(blackBird);
	blackBird.fly();
	blackBird.eat();
	blackBird.sleep();
	
	
	System.out.println("\n Chicken testing");
	Chicken chicken = new Chicken();
	System.out.println(chicken);
	chicken.fly();
	chicken.eat();
	chicken.sleep();
	
	System.out.println("\n Sparrow testing");
	Sparrow sparrow = new Sparrow();
	System.out.println(sparrow);
	sparrow.fly();
	sparrow.eat();
	sparrow.sleep();
	
	//for bird//also test both overload constructors
	// for bird//test flying method
}
}//end of class


//setters and getter are rules accessors and mutators