package Poo;

public class Teacher extends Person {
	
      public String echelon;
      public String speciality;
      
	public Teacher(String name, String firstname, String city, int age,String echelon, String speciality){
		super(name,firstname,city,age);
		this.echelon=echelon;
		this.speciality=speciality;
	}
public void display(){
	super.display();
	System.out.println("echelon: "+echelon+" \n"+"speciality: "+speciality);
	
	
}
	

}
