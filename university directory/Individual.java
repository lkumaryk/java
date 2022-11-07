//Individual class

import java.util.*;
public class Individual {

	public ArrayList<Person> pList;

	public Individual() {
	   pList = new ArrayList<Person>();
	}

	public void addIndividual(Person p)
	{
		pList.add(p);
	}
	public int getSizeIndividual()
	{
		return pList.size();
	}
	public String getFirst(int i)
	{
		return pList.get(i).first;
	}
	public String getLast(int i)
	{
		return pList.get(i).last;
	}
	public Person getPerson(int i)
	{
		return pList.get(i);
	}
	public Person getLoc(int loc)
	{
		return pList.get(loc);
	}


}
