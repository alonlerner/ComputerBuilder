package com.lerner.ComputersApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("amd")
@Primary
public class AmdProcessor implements Processor
{
	
	public void process()
	{
		System.out.println("AMD Processor is processing...");
	}
	public String toString()
	{
		return "AMD Processor";
	}
}
