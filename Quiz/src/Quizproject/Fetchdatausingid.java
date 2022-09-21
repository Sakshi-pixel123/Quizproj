package Quizproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
//fetch data using sid 
public class Fetchdatausingid {
	
	Connection conn;
	Liststudent ls;
	
		
	public Connection Fetchdata() {
	 try {
		 MainConnectionTest j = new MainConnectionTest();
		 Connection con   = j.getconnectionDetail();
		
		
		
	//	ReteriveScore rs = new ReteriveScore();
	//	rs.reterivelist();
		 PreparedStatement   prs;
 ls = new Liststudent();
 
		 
		System.out.println("********Welcome to get score*************");
		 
		 System.out.println("Enter the Sid from reterive data  ");
		 Scanner S = new Scanner(System.in);
	  	  ls.setSid(S.nextInt());
	  	prs=con.prepareStatement("select Firstname,Lastname,Score from liststudentinfo where Sid = ?");
	  	prs.setInt(1, ls.getSid());
		 ResultSet r= prs.executeQuery();
		 
		 
		 System.out.println("Student name and score is......");
		 while(r.next()) {
		//	 System.out.println( "Sid is " +r.getInt(1));
			 System.out.println("Student First name is " +r.getString(1));
			 System.out.println("Student Last name is " +r.getString(2));
			 System.out.println("Score is " +r.getString(3));
	
		 }
	 }catch(Exception e) {
		 System.out.println(e);
	 }
	return conn;
}
	
	public void idvalidation() {
		System.out.println("******To get the particular record by using student id(Y/N)*****");
          Scanner S = new Scanner(System.in);
		char choice1 = S.next().charAt(0);
		
		if(choice1 == 'Y' || choice1 == 'y') {
			Fetchdata();
		}
		else if (choice1 == 'N' || choice1 == 'n') {
			System.out.println("Okay Thank you..!");
		}
		else {
			System.out.println("please enter correct Character");
			Scanner S1 = new Scanner(System.in);
			//System.out.println("**********Want to displat list of Student (Y/N)*******");
		  char	choice2 = choice1;
			 choice1 = S.next().charAt(0);
			
			 Fetchdata();
		}
		return;
	}
			
			
			
		
	
	}

