package Quizproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//insert student info into database
public class StudentinfoInsert {

	
	
	 public void reterivelist() {
		try{
			 MainConnectionTest j = new MainConnectionTest();
			 Connection con  = j.getconnectionDetail();
			 
			MCQ us = new MCQ();
			Liststudent getinput = us.getinput();
		us.Ques();
		PreparedStatement   prs;
		
		
			 prs=con.prepareStatement("insert into liststudentinfo (Sid,Firstname,Lastname,Score) values(?,?,?,?)");
		
			 prs.setInt(1,getinput.getSid());
             prs.setString(2, getinput.getFirstname());
             prs.setString(3, getinput.getLastname());
              prs.setInt(4,us.Score);
			 int i = prs.executeUpdate();
			 System.out.println("recortrd inserted" +i);
			
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
	 }
	 
	

	
	 
	 
}
