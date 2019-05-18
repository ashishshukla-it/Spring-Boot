package com.example.FirstProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// When we enter @Component above class, then spring creates bean of that class
public class Users {
	private  int uid;
	private String userName;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	// Spring won't know that there is a class Laptop. 
	// Autowired tells that there is class Laptop whose bean has to be created and has to be used here.
	// Autowired searches for a class by type by default.
	// If we want to make it search by name, we can use Qualifier.
	// By default, name of a component is name of the class itself but in lowercase i.e. by default, name of component of Laptop class will be laptop.
	// we can change it by giving it in parameter.
	
	public Users()
	{
		System.out.println("^^^ Object of Users created");
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show()
	{
		System.out.println("^^^ inside show() of Users");
		laptop.compile();
	}
	
}
