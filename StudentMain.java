package com.te.assingments.students;

import java.util.Scanner;


public class StudentMain {

	public static void main(String[] args) {
		
		StudentMain jpql  = new StudentMain();
		DynamicStudents stdop = new DynamicStudents();

		boolean quit = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press 1 :  Fetch a Particular Record from table \n"
				+ "Press 2 : Update one entire Record with RollNo \n    press 2a : to Update Row with a Name \n    press 2b : to Update Row with a PhoneNo\n    press 2c : To Upade with a Row with Section \n"
		          + "Press 3 :  Delete one Particular Record\n" 
		           + "Press 4 :  Fetch All  the Records From the Table\n"
		           + "Press 5 : To exit from Operation" );
		
		while(!quit ) {
			String n=scanner.nextLine();
			
			switch (n) {
			case "1": System.out.println(" Fetch one Particular Record with RollNo :");
						stdop.fetchParticular();
			           break;
			case "2":     System.out.println("  Update one entire Record with RollNo :");
				            stdop.update();
		               break;	            
			case "2a" : System.out.println("Update Row with a Name");
			                  stdop.updateWithName();
		               break;    
		   case "2b" : System.out.println("Update Row with a PhoneNo");
                             stdop.updateWithPhoneno();
                        break;    
		   case "2c" : System.out.println("Upade with a Row with Section");
			              	stdop.UpdateWithSection();
			           break;
		    case "3": System.out.println(" Delete one Particular Record  :");
			           stdop.delete();
                        break;
			case "4": System.out.println(" Fetch All  the Records From the Table :");
			            stdop.fetchAll();
                         
			            break;
			case "5" :  
						 System.exit(0);
				              break;
			case "y":
				
				System.out.println("Press 1 :  Fetch a Particular Record from table \n"
						+ "Press 2 : Update one entire Record with RollNo \n    press 2a : to Update Row with a Name \n    press 2b : to Update Row with a PhoneNo\n    press 2c : To Upade with a Row with Section \n"
				          + "Press 3 :  Delete one Particular Record\n" 
				           + "Press 4 :  Fetch All  the Records From the Table\n"
				           + "Press 5 : To exit from Operation" );
				quit= false;
				break;
			case "n":
				quit=true;
				break;            

			default:
				try {
					throw new IdNotFound("IdNotFound in DataBase : "+n+"\nPress 1 :  Fetch a Particular Record from table \n"
										+ "Press 2 : Update one entire Record with RollNo \n    press 2a : to Update Row with a Name \n    press 2b : to Update Row with a PhoneNo\n    press 2c : To Upade with a Row with Section\n"
							            + "Press 3 :  Delete one Particular Record \n"
							     	     +"Press 4 :  Fetch All  the Records From the Table\n"
							     	     + "Press 5 : To exit from Operation"+(quit));
				}catch (Exception e) {
					System.err.println(e.getMessage());
				}

			}
		}
	}
}

