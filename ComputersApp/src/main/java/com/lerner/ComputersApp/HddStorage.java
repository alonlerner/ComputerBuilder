package com.lerner.ComputersApp;

import org.springframework.stereotype.Component;

@Component("hdd")
public class HddStorage implements Storage 
{
	public void save()
	{
		System.out.println("Saving into HDD storage...");
	}
	@Override
	public String toString() {
		return "HDD Storage";
	}
	
}
