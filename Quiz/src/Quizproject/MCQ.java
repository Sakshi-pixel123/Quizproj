package Quizproject;

import java.sql.Connection;

import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;



import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
//MCQ question,check ans,display result on console
public class MCQ {
	Connection conn;
 
 Liststudent ls;
	Scanner S;
	char Grade;
	int Score ;
 
 public Connection  Ques() {
	
	 
	 
 
	 try {
		 MainConnectionTest j = new MainConnectionTest();
		 Connection con   = j.getconnectionDetail();
		 PreparedStatement   prs;
		 prs=con.prepareStatement("select * from Quiz order by Rand() LIMIT 10");
		 ResultSet rs= prs.executeQuery();
		 
		 
		// getinput();
		 
		 while(rs.next()) {
			 System.out.print( rs.getInt(1)+ ".");
			 System.out.println(rs.getString(2));
			 System.out.println(rs.getString(3));
			 System.out.println(rs.getString(4));
			 System.out.println(rs.getString(5));
			 System.out.println(rs.getString(6));
			  S=new Scanner(System.in);
			 System.out.println("Enter the Ans:");
			 String ans = S.next();
			 if(ans.equals(rs.getString(7))   ) {
				 System.out.println("Correct");
				
				 Score++;
			Score = Score;
				 
			 }
			 else {
				 System.err.println("Wrong ");
				 
			 }
			 
			  }
		 System.out.println();
		 
		 
		 if(Score >= 8 && Score <= 10) {
			 Grade  = 'A'; 
		 }else if (Score >= 6 && Score <= 8) {
			 Grade  = 'B'; 
		 }else if (Score == 5 && Score <= 6) {
			 Grade  = 'C'; 
	 }else {
		 Grade  = 'D';  
		 //System.out.println("failed");
	 }
		 
		 System.out.println("**************result is ******************");
		 System.out.println("Id is " +ls.getSid());
		 System.out.println("First Name is " +ls.getFirstname());
		 System.out.println("Last Name is " +ls.getLastname());
		 System.out.println("Total question is 10" );
		 System.out.println("Score is " +Score);
		 System.out.println("Grade is " +Grade);
		 if(Grade == 'D') {
			 System.out.println("failed");
		 }
		 
		 
		 
		
		 
		 
		 
		 con.close();
		 prs.close();
		 rs.close();
	 }catch(Exception e) {
		 System.out.println(e);
	 }
	return conn ;
	
	
		 
	 }
	 
	public Liststudent getinput() {
		 ls = new Liststudent();
		 System.out.println("************Welcome to Java Quiz******************");
		 System.out.println("Enter the id:");
		 Scanner S = new Scanner(System.in);
		  ls.setSid(S.nextInt());
		  
		 
	  
		 System.out.println("Enter the Student First name:");
		 ls.setFirstname(S.next());
		 System.out.println("Enter the Student Last name:");
		 ls.setLastname(S.next());
		return ls;
	} 
	 
    public void checkid() {
	Liststudent ls = new Liststudent();
	MCQ us = new MCQ();
	Liststudent getinput = us.getinput();
	int a= ls.getSid();
	
int b =  getinput.getSid();
	
	if(a == b) {
		System.out.println("duplicate id not allowed for exam");
	}
	else {
		System.out.println("elligible for the exam");
		Ques();
	}
	
    }
}
 

