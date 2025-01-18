//Traveling plan
package travel.java;
import java.util.Scanner;

public class Destiny {
	String dname, adate, ddate, pref; 
	double budget;
	void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n**********Enter Information**********");
		System.out.println("Enter Destination Name:");
		dname=sc.next();
		System.out.println("Enter arrival date(DD-MM-YYYY):");
		adate=sc.next();
		System.out.println("Enter Departure date(DD-MM-YYYY):");
		ddate=sc.next();
		System.out.println("Enter budget:");
		budget=sc.nextDouble();
		System.out.println("Enter Preferance (eg. Food, Adventure, relaxation):");
		pref=sc.next();
		}
	void display() {
		System.out.println("\n**********Your Itinerary**********");
		System.out.println("Your destination: "+dname);
		System.out.println("Arrival Date: "+adate);
		System.out.println("Departure Date: "+ddate);
		System.out.println("Your budget: "+budget);
		System.out.println("Your Preferance: "+pref);
		System.out.println("**********Enjoy Journy**********");
	}

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		Destiny d=new Destiny();
		do {
		System.out.println("*****!!!Welcome!!!*****");
		System.out.println("\nEnter your choice:\n1.Add Destination\n2.Your Itinerary\n3.Exit");
		a=sc.nextInt();
		switch (a){
		case 1:
			d.getinfo();
			break;
		case 2:
			d.display();
			break;
		case 3:
			break;
			default:
				System.out.println("Enter Valid Choice!!");
		}
		System.out.println("\nDo you wants to continue?\n1.Yes\n2.No");
		b=sc.nextInt();
	}while(b==1);
		System.out.println("********Thank You for Visiting!!!!**********");
	}
}
