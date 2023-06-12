package ui.collections;
import java.util.ArrayList;

public class Exhibit {
	//member fields, something every exhibit will have  
	//exhibt will have his own name and max capacity

	//These are my member fields. each echibit is going to have its one
	private String name;
	private int capacity;

	private ArrayList<Animal> animals;                //has to be class name in data type

	//default constructure, must be public, doesnt return any data, must have the same name as the class

	public Exhibit() {
		this.setName("unknown");
		this.setCapacity(0);

		this.animals = new ArrayList<Animal> ();

	}
	//overload constructure, same rules as default, but has params
	public Exhibit(String name, int capacity) {
		this(); //call defualt constructure
		//this.name is a member field
		//name is a constructor's param
		this.setName(name);
		this.setCapacity(capacity);

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		if(capacity < 0)
			System.out.println("Invalid capacity of " + capacity + "unable to set");
		else 
			this.capacity = capacity;
	}

	public Boolean addAnimal(Animal animal)  {
	if(animals.size() >= this.capacity) {
		return false;}

	animals.add(animal);
	return true;
}

	//helper member method, cause every memebr can use it, recieve the animal id and returns the animal index
	
	private int getAnimalIndexById(int id) {
		for (int i = 0; i < this.animals.size(); i++) {
			
			if(this.animals.get(i).getId() == id) {
				return i;
		}
			
	}
// this is a member method that will return an anima, oject vased onit's id
		return -1;
}
	public Animal getAnimal(int id) throws Exception {
		int index = this.getAnimalIndexById(id);
		
		if(index != -1) {
			return this.animals.get(index);
		}
		else { throw new Exception("Animal Id " + id + " not found in the " + this.name + " Exhibit ")
;		}
		}
	
	
	
	// this is a member method that will return an anima, oject vased onit's id
//return deleted animal
	public Animal deleteAnimal(int id) throws Exception {
		int index = this.getAnimalIndexById(id);
		
		if(index != -1) {
			return this.animals.remove(index);
		}
		else { throw new Exception("Animal Id "+ id + " not found in the " + this.name + " Exhibit")
;		}
		}
	//This is a member method used to display all the information about the Exhibit
	public void displayInfo() {
		System.out.println();
		System.out.println(this.name + " Exhibit capacity is " + this.capacity);
		
/*		for (int i = 0; i < animals.size(); i++) {
			
			System.out.print(animals.get(i) + " ");
			
			animals.get(i).displayInfo();
			}
	*/
		for(Animal animal : animals) {
			
			animal.displayInfo();
		}
		
		System.out.println();
		}
		
	
	}
	  
	//it will be the delete
	//to udpdate we need set method
	//it neads onject and and index
	//update a specific animal in a specific index, update will happen in a the zookeeper
	//zookeper updates
	//exhibit update


