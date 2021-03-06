package com.lerner.ComputersApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Intel {
	@Autowired
	@Qualifier("intelproc")
	private Processor processor;
	@Autowired
	@Qualifier("hdd")
	private Storage storage;
	
	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Computer: Intel. Processor:" + processor+". Storage: "+storage;
	}
}
