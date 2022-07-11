package com.chainsys.bestPractices.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Home 
{
	private Home()
	{
		System.out.println("Home");
	}
	private String owner;
	private int doorNo;
	
	@Autowired
	@Qualifier("airtel")
	private Internet fiber;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public void connect()
	{
		fiber.switchOn();
		System.out.println("Connected to internet");
	}
}
