package Task2;
import java.util.Scanner;
public class Bank {
	int a,dep,Depo,wit,With,ch;
	String w,b;
	Scanner sc=new Scanner(System.in);
	void getData() {
		System.out.println("Enter Your Name:");
		w=sc.next();
		System.out.println("Enter your Balance:");
		a=sc.nextInt();
		System.out.println("Enter Your Bank Name:");
		b=sc.next();
		
	}
	void display() {
		System.out.println("*************Your Details:************");
		System.out.println("Name: "+w);
		System.out.println("Bank Name: "+b);
		System.out.println("Balance: "+a);
	}	
	void deposit() {	
		System.out.println("*****Deposite here*****");
		System.out.println("Enter amount to be deposit:");
		dep=sc.nextInt();
		Depo=a+dep;
		System.out.println(dep+"Rs has been deposited to your account. ");
		System.out.println("Current Balance: "+Depo);		
	}
	void withdraw() {
		System.out.println("*****Withdraw here*****");
		System.out.println("Enter amount to be withdraw:");
		wit=sc.nextInt();
		if(wit>Depo) {
			System.out.println("Insuffitiant Balance!!");
		}
		else {
		With=Depo-wit;
		System.out.println(wit+"Rs has been withdraw from your account. ");
		System.out.println("Current Balance: "+With);
		}		
	}
	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("*************BANK APPLICATION*************");
		Bank pn=new Bank();
		pn.getData();
		pn.display();
		int p;
		do {
		System.out.println("\n***Enter your choice:***\n1.Deposit Money\n2.Withdraw money\n3.Exit");
		int ch=sc.nextInt();
		switch (ch){
		case 1:{
			pn.deposit();
			break;
		}
		case 2:{
			pn.withdraw();
			break;
		}
		case 3:{
			break;
		}
			default:
				System.out.println("Please Enter Valid Choice!!");
		}
			
		System.out.println("\nDo you wants to continue?\n1.Yes\n2.no");
		p=sc.nextInt();
		
	}while(p==1);
		System.out.println("Thank you !!");
} 
	    
}
