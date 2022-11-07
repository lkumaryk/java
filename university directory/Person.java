
public class Person implements PInterface{
	public String last;
	public String first;
	public String middle;

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}
	
	@Override
	public void print_0() {
		System.out.println(first + "  " + middle + "  " + last);
		
	}
	@Override
	public void print_1() {
		System.out.println(last + " ," + middle + " " + first);
		
	}
	@Override
	public void print_2() {
		System.out.println(last + " ," + first + " " + middle);
		
	}


}
