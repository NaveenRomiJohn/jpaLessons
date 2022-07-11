package com.chainsys.bestPractices.basic;

import org.springframework.stereotype.Component;

@Component("bsnl")
public class Bsnl implements Internet
{
	@Override
	public void switchOn() {
		System.out.println("BSNL Internet is connecting");		
	}
}
