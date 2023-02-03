package ExcelReadWrite;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException; 

public class Main {
	
    private static boolean CONTINUE =true;
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	while(CONTINUE)
        {
        System.out.println("1.Read Data");
        System.out.println("2.Write");
        System.out.println("Enter your Choice:");
        int number = 0;
          try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entered. Please enter a valid choice (1 or 2)");
            sc.nextLine();        
        }
       try {
        switch (number) {
            case 1:
                new Read();
                System.out.println("Press 1 to continue press 2 to exit");
                int user_preference = sc.nextInt();
                if (user_preference ==2)
                {
                    CONTINUE= false;
                }
                break;
            case 2:
               new Write();
               System.out.println("Press 1 to continue 2 to exit");
                 user_preference = sc.nextInt();
                 if(user_preference ==2)
                 {
                     CONTINUE = false;
                 }
                 break;
            default:
                System.out.println("Not a valid choice");
                System.out.println("Press 1 to continue 2 to exit");
                user_preference = sc.nextInt();
                if(user_preference ==2)
                {
                    CONTINUE = false;
                }
                break;   
        }
        
    }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
        }
}
}
