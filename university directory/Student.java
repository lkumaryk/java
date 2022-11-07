//student class

public class Student extends Person{
	private int sID;


	public Student(String last, String first, String middle, int id) {
		super(last, first, middle);
		sID = id;

	}

	public int getID()
	{
		return sID;

	}
	

}
