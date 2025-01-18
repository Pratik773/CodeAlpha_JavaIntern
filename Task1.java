package Task1;
import java.util.*;
import java.util.Scanner;

public class Grade {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int num=sc.nextInt();
        double[]per=new double[num];
        double total=0,highest=0,lowest=100;
        for(int i=0;i<num;i++){
            System.out.println("Enter the grade of student "+(i+1)+":");
             per[i]=sc.nextDouble();
            total+=per[i];
            if(per[i]>highest)highest=per[i];
            if(per[i]<lowest)lowest=per[i];
        }
        double average=total/num;
        System.out.println("\n**RESULT**");
        System.out.println("\tAverage grade:");
        System.out.println("\t"+average);
        System.out.println("\thighest grade:");
        System.out.println("\t"+highest);
         System.out.println("\tlowest grade:");
        System.out.println("\t"+lowest);


	}

}
