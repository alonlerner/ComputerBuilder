package com.lerner.ComputersApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ssd")
@Primary
public class SsdStorage implements Storage 
{
	public void save()
	{
		System.out.println("Saving into SSD storage...");
	}
	@Override
	public String toString() {
		return "SSD Storage";
	}

}
