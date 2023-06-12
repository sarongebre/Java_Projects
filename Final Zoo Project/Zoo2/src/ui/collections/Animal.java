package ui.collections;
//Class starts with an upper case letter

//


public  class Animal { //No longer inatiate an animal
	
	//class field shared by all objects, protect 
	private static int nextId = 1; //static cause i want all object to share it/ first id going to be one
	private int id; //Animal itself to have an ID
	//member field
	//this is public because it is a constant field that non one can change data
	public final String type = " Animal";
	
	//2 things inside of a class, field memebrs(gender) and method memebrs
	// Class field memeber is somthing you are going to track specificc about that one animlal. geneder is eomthing specififc to that animal	

	//Class field members(attribuets)/ memebers or variables of a class, class field memebers known as attributes// every members have theur own data

	//We are hiding our class fields by setting them to private 
	//we are hiding using encapsilation/abstraction to hide the class' logic from my class user = zookeper
	private String gender; //default data
	private int age ; //default we can access and change though zookeeper
	private float weight; //Wh privaet? so that every age from the naimal doesnt chaneg
	
//This is the default constructor	
public Animal() {
	this.id = Animal.nextId++; //we only use this for a member field so we have to put class name isntead
	this.age = 0; //when it is a member field we put this we don'tnecessarily have to put this
	this.gender = "unknown";
	this.weight = 0.0f;
}

//this is an overloaded constructor
public Animal(int age, String gender, float weight) {
	this();// forces the default constructor to run even though I'm using the overloaded constructor
	this.age = age;
	this.gender = gender;
	this.weight = weight;

}

public int getId() {
	return this.id;
}



/////////////////////////////////////////////////////////////////////////////////////

	//setter method also known as a mutator method only codded for field memeber
	//implimnetaion is how i want my method logic to work 
	// A memeber definition provides an access modifier,......down
	//retunn type, name, argumentas, and the mthod statements 
	
	//member field is different than static(static is class field))
	public void setAge(int age) { //void because doesnt return anything /// the age in her is only for the method(It is a method variable) we put this so that the class reaches it.  method age into the class age 
		//This.age always point to the class variable
		if(age < 0) {
			System.out.println("Invalid age" + age);
			return;
		}
		this.age = age; //.age is a member access operator / helps as acess the field 
	}

	public int getAge() { //doesnt have anything in the parameters (variable age) so it auto matically reaches out to class age so we don't put this  
		return this.age; //this=class
	}

	//getter method also known as an accessor method , only for member field


/////////////////////////////////////////////////////////////////////////////////////
	
//Primitive with small letter
//abstract data type with capital 
//wrapper class is basically an object
// We can not use inequality operator with objects

	public void setGender(String gender) { //void because doesnt return anything /// the age in her is only for the method(It is a method variable) we put this so that the class reaches it.  method age into the class age 
		//This.age always point to the class variable
		if(!gender.equals("male") && !gender.equals("female")) {
			System.out.println("Invalid gender" + gender);
			return;
		}
		this.gender = gender; //.age is a member access operator / helps as acess the field 
	}
	public String getGender() { //doesnt have anything in the parameters (variable age) so it auto matically reaches out to class age so we don't put this  
		return this.gender; //this=class
	}

//////////////////////////////////////////////////////////////////////////////////////


	public void setWeight(float weight) { //void because doesnt return anything /// the age in her is only for the method(It is a method variable) we put this so that the class reaches it.  method age into the class age 
		//This.age always point to the class variable
		if(weight < 0) {
			System.out.println("Invalid weight" + weight);
			return;
		}
		this.weight = weight; //.age is a member access operator / helps as acess the field 
	}

	public float getWeight() { //doesnt have anything in the parameters (variable age) so it auto matically reaches out to class age so we don't put this  
		return this.weight; //this=class
	}













	//Class method members knowns as behaviours
	public void sleep( ) {
		System.out.println(this.type + "is sleeping...");
	}

	public void eat () { //so that classs use uses this method
		System.out.println(this.type + " is eating...");
	}
	
	public void displayInfo() {
		System.out.println(" Id= " + this.id +
				" Age= " + this.age +
				" Gender = " + this.gender + 
				" weight= " + this.weight);
	}
	
	@Override
	public boolean equals(Object other) { //blue fish ecieve any object

		boolean result;

		//is the object not null and is it of the same type as this class
		if((other == null) || (this.getClass() != other.getClass())){ //are the classes are equal? are they same class

			result = false; //variables do not have a default value

		} else{

			//the other object must be an animal so type cast it to be an Animal
			Animal otherAnimal = (Animal)other; //type cast it, and convert to animal

			//using a ternary operator, verify that only the animal types are equal
			result = this.type.equals(otherAnimal.type) ? true : false; //terinery if th eobject hase same class do 

		}

		return result;		
	}
	
	@Override
	public String toString() {
		return this.type;
	}

}