package Poo;

import java.util.ArrayList;

public class Student extends Person{
	
	private String email;
	private String classStudent;
	//ArrayList declarations
	private ArrayList notes;
	private ArrayList cours;
	
	
	public Student(String name, String firstname, String city, int age,String email,String classStudent){
		super(name,firstname,city,age);
		this.email=email;
		this.classStudent=classStudent;
		notes=new ArrayList();
		cours=new ArrayList();	
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getClassStudent() {
		return classStudent;
	}


	public void setClassStudent(String classStudent) {
		this.classStudent = classStudent;
	}


	public ArrayList getNotes() {
		return notes;
	}


	public void setNotes(ArrayList notes) {
		this.notes = notes;
	}


	public ArrayList getCours() {
		return cours;
	}


	public void setCours(ArrayList cours) {
		this.cours = cours;
	}


}
