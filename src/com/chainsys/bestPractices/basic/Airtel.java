package com.chainsys.bestPractices.basic;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Internet
{
	@Override
	public void switchOn() {
		System.out.println("Airtel Internet is connecting");		
	}
}
