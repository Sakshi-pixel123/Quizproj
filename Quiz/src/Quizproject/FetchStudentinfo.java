package Quizproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
//list of student who gave the exam
public class FetchStudentinfo {

	Connection conn;
	
	String choice;
	
	public Connection listStudentorder() {
		
		
		
		//yes or no karna hai remaining 
		
	
		
		 
		 try {
			 MainConnectionTest j = new MainConnectionTest();
			 Connection con   = j.getconnectionDetail();
			
			
			
	//		ReteriveScore rs = new ReteriveScore();
	//		rs.reterivelist();
			 PreparedStatement   prs;
			 prs=con.prepareStatement("select * from liststudentinfo order by Sid asc");
			 ResultSet r= prs.executeQuery();
			 
			 System.out.println("**********list of Studentents gave the exam****************  ");
			 while(r.next()) {
				 System.out.println( "Sid is " +r.getInt(1));
				 System.out.println("Fname is " +r.getString(2));
				 System.out.println("Lname is " +r.getString(3));
				 System.out.println("Score is " +r.getString(4));
		
			 }
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		return conn;
		
		 
		
		
		
		
		
	
		
		
		
		
		
	}
	public void listvalidation() {
		Scanner S = new Scanner(System.in);
		System.out.println("**********Want to displat list of Student (Y/N)*******");
		
		
		char choice = S.next().charAt(0);
		
	
		if(choice == 'Y' || choice == 'y') {
			listStudentorder();
		}
		else if (choice == 'N' || choice == 'n') {
			System.out.println("Okay Thank you..!");
		}else {
			System.out.println("please enter correct Character");
			Scanner S1 = new Scanner(System.in);
		//	System.out.println("**********Want to displat list of Student (Y/N)*******");
		  char	choice1 = choice;
			 choice1 = S.next().charAt(0);
			
			 listStudentorder();
		}
		return;
	}
}
	
	
	
	

