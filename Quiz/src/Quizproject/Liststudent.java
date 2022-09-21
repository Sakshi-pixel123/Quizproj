package Quizproject;

import java.util.Objects;

public class Liststudent {
	private int Sid;
	private  String Firstname;
	private  String Lastname;
	private  int Score;
	
	
	
	public Liststudent() {
		
	}


	public Liststudent(int sid, String fname, String lname,int score) {
		super();
		Sid = sid;
		Firstname =  fname;
		Lastname = lname;
		Score = score;
	}


	@Override
	public String toString() {
		return "Liststudent [Sid=" + Sid + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Score=" + Score
				+ "]";
	}


	public int getSid() {
		return Sid;
	}


	public void setSid(int sid) {
		Sid = sid;
	}


	public String getFirstname() {
		return Firstname;
	}


	public void setFirstname(String firstname) {
		Firstname = firstname;
	}


	public String getLastname() {
		return Lastname;
	}


	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	public int getScore() {
		return Score;
	}


	public void setScore(int score) {
		Score = score;
	}
}






	