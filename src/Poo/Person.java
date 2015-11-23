package Poo;

public class Person {
	
	private String name;
	private String firstname;
	public String city;
	public int age;
	
	public Person(){
		System.out.println("Constuctor without parameters...");
	}
	//Constuctor with parameters
	
	public Person(String name,String firstname, String city,int age ){
		this.setName(name);
		this.setFirstname(firstname);
		this.city=city;
		this.age=age;
	}
public void display(){
System.out.println("The Name Person:" + name + "\n" + "FIRSTNAME:"+firstname +"\n" + "ORIGIN: "+city+ "\n" +"Age is: " +age+ " ans");	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}


}


