// Professor class
public class Professor extends Person{
		private int pID;
		private double salary;


		public Executive(String last, String first, String middle, int id, double sal) {
			super(last, first, middle);
			pID = id;
			salary = sal;

		}

		public int getID()
		{
			return pID;

		}

	
}
