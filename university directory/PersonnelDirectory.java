//directory class

import java.util.Scanner;
public class Directory
{

	public static void main(String[] args)
	{
		Individual per = new Individual();
		Scanner scan = new Scanner(System.in);
		String firstN, lastN, middleN, role;
		int ID;
		double salary;
		int choice = -1;
		int total = 0;


		do{


			System.out.println("Welcome to the College Directory Management System");
			System.out.println("====================================================");

			System.out.println("\n\n\t 1. Add Person");
			System.out.println("\n\t 2. Find Person");
			System.out.println("\n\t 3. Print Names");
			System.out.println("\n\t 4. Number of Entries in the Directory");

			System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
			choice = scan.nextInt();
			scan.nextLine();

			switch(choice)
			{
			case 1:
				System.out.println("Enter first name: ");
				firstN = scan.nextLine();
				System.out.println("Enter last name: ");
				lastN = scan.nextLine();
				System.out.println("Enter middle name: ");
				middleN = scan.nextLine();
				System.out.println("Enter role: Student/Professor/Associate Professor/Emeritus ");
				role = check(scan.nextLine());
				System.out.println("Enter id : ");
				ID = scan.nextInt();
				System.out.println("Enter salary" );
				salary = scan.nextDouble();
				scan.nextLine();
				IFactory pf = new IFactory();
				Person p = pf.CreateIndividual(role,lastN,firstN,middleN,ID,salary);



				per.addIndividual(p);
				totalObjects to = totalObjects.getInstance(); 
				if (to!=null)
				{
					total++;
				}
				
				break;
             
			case 2:

				System.out.println("Enter first name : ");
				firstN = scan.nextLine();

				System.out.println("Enter last name : ");
				lastN = scan.nextLine();

				boolean found = false;
				int loc =-1;

				for(int i =0; i <per.getSizeIndividual(); i++)
				{
					if( per.getFirst(i).equals(firstN) && per.getLast(i).equals(lastN))
					{   
						
						found = true;
						loc = i;
					}
				}

				if(found)
				{
					System.out.println("Found");
					per.getLoc(loc).printOrder0();

				}else
				{
					System.out.println("not found");
					
				}

				break;

			case 3:

				System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
				int order = scan.nextInt();
				for(int i=0; i<per.getSizeIndividual(); i++)
				{
					Person pr = per.getPerson(i);
					if (order==0){
						pr.print_0();
					}
					else if (order==1){
						pr.print_1(); 
					}
					else if (order==2){
						pr.print_2();
					}
				}

				break;

			case 4:
				System.out.println("Total Entries : " + total);

				break;

			}

		} while(true);


	}
	static String check(String role) {
		
		Scanner scan = new Scanner(System.in);
		if ("Student".equalsIgnoreCase(role) || "Associate Professor".equalsIgnoreCase(role) ||"Emeritus".equalsIgnoreCase(role)||"Professor".equalsIgnoreCase(role)) {
			return role;
		}
		else{
			System.out.println("Please enter valid role");
			role= check(scan.nextLine());
		}  
		return role;
	}

}
