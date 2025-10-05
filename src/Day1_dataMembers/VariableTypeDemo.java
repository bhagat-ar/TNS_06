package Day1_dataMembers;

import java.security.PublicKey;

public class VariableTypeDemo {

	
   private static char[] y;
   int x =10;//instance variable
   
   //user defined method
   public void show(int z) 
   {
	   int y = 30;//local variable 
	   System.out.println(x);
	   System.out.println("User Defined Method");
   }
   
   public static void main(String[] args) {
   
	 System.out.println(y);
	 
	}
}
