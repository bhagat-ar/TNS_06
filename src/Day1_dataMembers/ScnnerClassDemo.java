package Day1_dataMembers;

import java.util.Scanner;

public class ScnnerClassDemo {

	public static void main(String[] args) {
		
		int id ;
		String name;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ID");
		id = s.nextInt();
		System.out.println("ID : "+id);
		
		System.out.println("Enter Name");
		name= s.next();
		System.out.println("Name : "+name);
		

	}

}
