
//implementation of Individual Factory class
public class IFactory {
	public static Person CreateIndividual(String type, String last,
            String first,
            String middle,
            int id,
            double sal){
		if("Student".equalsIgnoreCase(type)){
			return new Employee(last, first, middle,id,sal);
		}	
		else if("Professor".equalsIgnoreCase(type))
		{
			return new Executive(last, first, middle,id,sal);
		}
		else if("Associate Professor".equalsIgnoreCase(type))
		{
		     return new Volunteer(last,first,middle,id);
		}
		else if("Emeritus".equalsIgnoreCase(type))
		{
					return new Security(first, middle, last,id,sal);
		}
		
		return null;
	}

}

	
