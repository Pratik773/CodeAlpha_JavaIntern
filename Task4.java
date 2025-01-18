package task4;
import java.util.Scanner;

public class hotelmgmt {
	int r;
	static boolean[] room=new boolean[5];
	Scanner sc=new Scanner(System.in);
	void rooms() {
		System.out.println("\nAvailable rooms:");
		for(int i=0;i<room.length;i++) {
			if(!room[i]) {
				System.out.println("Room "+(i+1) +" is available.");
			}
		}
	
	}
	void reserve() {
		System.out.println("Enter room to reserve(1-5):");
		 r=sc.nextInt();
		if(room[r-1]) {
			System.out.println("This room is already booked;");
		}
		else {
			room[r-1]=true;
			System.out.println("Room "+r+" has been reserved.");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s;
		do {
			System.out.println("\n-----Hotel Reservation System-----");
			System.out.println("Enter your choice\n1.View room Details\n2.Book rooms\n3.Exit");
			int e=sc.nextInt();
			hotelmgmt h=new hotelmgmt();
			switch (e) {
			case 1:
				h.rooms();
				break;
			case 2:
				h.reserve();
				break;
			case 3:
			break;
			default:
				System.out.println("Invalid choice!!");
			}
			
			
		}while(true);
			
		}
	}


