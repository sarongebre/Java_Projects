package ui.collections;

public class Sparrow extends Bird {

	//is a member field
	//its set to public brcause its a cnstant field that can't change 
	//so i don't really need to protect

	public final String type = "Sparrrow"; //she put int but i think string

	//used protected access modifier becasue we want to let subclasses access this member field
	//protected int eggsPerYear= 0 ;



	public Sparrow() {
		super();// super calls the parent's atching contructur 
		//on the third video atefachiw. //this.eggsPerYear = "fresh";// TODO Auto-generated constructor stub
	}

	public Sparrow(int age, String gender, float weight) {
		super(age, gender, weight); //super calls the parent's matching method

		// TODO Auto-generated constructor stub
	}

	public Sparrow(int age, String gender, float weight, int eggsPerYear) {
		super(age, gender, weight, eggsPerYear);// calls the functions over loadcontructore 

		//this.seteggsPerYear(eggsPerYear); 
	}


	@Override  // since <10 is added we no longer want to use birds set eggs contructure bt want this one to run instead
	public void seteggsPerYear(int eggsPerYear) {
		if(eggsPerYear >= 0 && eggsPerYear < 10) {
			this.eggsPerYear = eggsPerYear;}
		else {
			System.out.println("Inavlid eggsPerYear value=" + eggsPerYear);
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
	@Override
	public void fly() {
		System.out.println(this.type 
				+ "Flying...");	

	}










	@Override //needs super
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" Type= " + this.type +
				"       eggsPerYears = " + this.eggsPerYear);
	}



	@Override
	public boolean equals(Object other) {

		boolean result;

		//is the object not null and is it of the same type as this class
		if((other == null) || (this.getClass() != other.getClass())){

			result = false;

		} else{

			//the other object must be an animal so type cast it to be an Bird
			Sparrow otherSparrow = (Sparrow)other;

			//using a ternary operator, verify that only the animal types are equal
			result = this.type.equals(otherSparrow.type) ? true : false;

		}

		return result;		
	}
	@Override
	public String toString() {
		return this.type;
	}

}//end of class




