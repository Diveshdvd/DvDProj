package ExcelReadWrite;

import java.util.Scanner;

public class choice {
	 boolean choice = true;
	 
	 public static Scanner sc= new Scanner(System.in); 
	 public boolean choice()
	 {
		 boolean c = true;
	  System.out.println("Press 1 to continue 2 to exit");
     int user_preference = sc.nextInt();
     if(user_preference ==2)
     {
         c = false;
     }
     return c;
}

}