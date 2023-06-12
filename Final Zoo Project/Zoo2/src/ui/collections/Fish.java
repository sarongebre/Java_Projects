package ui.collections;
// fish is the child (sub class or derived of the parent (superclass or based animal)
public class Fish extends Animal{ // how to create a sub class

	//is a member field
	//its set to public brcause its a cnstant field that can't change 
	//so i don't really need to protect

	public final String type = "Fish";

	//used protected access modifier becasue we want to let subclasses access this member field
	protected String waterType = "Fresh";


	public String getWaterType() {
		return waterType;
	}

	public Fish() {
		super();// super calls the parent's atching contructur 
		//on the third video atefachiw. //this.waterType = "fresh";// TODO Auto-generated constructor stub
	}

	public Fish(int age, String gender, float weight) {
		super(age, gender, weight);

		// TODO Auto-generated constructor stub
	}

	public Fish(int age, String gender, float weight, String waterType) {
		super(age, gender, weight);// calls the functions over rided contructore 

		this.setWaterType(waterType); 
	}


	public void setWaterType(String waterType) {
		if(waterType == "fresh" || waterType == "salt" ) {
			this.waterType = waterType;}
		else {
			System.out.println("Inavlid water Type value=" + waterType);
		}
	}

	@Override
	public void sleep( ) {
		System.out.println(this.type + "is sleeping...");
	}
	@Override
	public void eat () { //so that classs use uses this method
		System.out.println(this.type + " is eating...");
	}

	public void swim() {
		System.out.println(this.type 
				+ "Swimming...");	

	}










	@Override //needs super
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" Type= " + this.type +
				"       waterTypes = " + this.waterType);
	}



	@Override
	public boolean equals(Object other) {

		boolean result;

		//is the object not null and is it of the same type as this class
		if((other == null) || (this.getClass() != other.getClass())){

			result = false;

		} else{

			//the other object must be an animal so type cast it to be an Animal
			Fish otherFish = (Fish)other;

			//using a ternary operator, verify that only the animal types are equal
			result = this.type.equals(otherFish.type) ? true : false;

		}

		return result;		
	}
@Override
public String toString() {
	return this.type;
}

}//end of class
