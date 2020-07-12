package com.lerner.ComputersApp;

import org.springframework.stereotype.Component;

@Component("intelproc")
public class IntelProcessor implements Processor 
{
	public void process()
	{
		System.out.println("Intel Processor is processing...");
	}
	public String toString()
	{
		return "Intel Processor";
	}
}
