//Associate professor class
public class AProfessor extends Person{
	private int aID;
	private int salary;



	public AProfessor(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		aID = id;
		salary = sal;

	}

	public int getID()
	{
		return aID;

	}
	

}

