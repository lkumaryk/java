//Emeritus class
public class Emeritus extends Person{
	private int eID;
	private double salary;


	public Security(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		eID = id;
		salary = sal;

	}

	public int getID()
	{
		return eID;

	}
	

}

