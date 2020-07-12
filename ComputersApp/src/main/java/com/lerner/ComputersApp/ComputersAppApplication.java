package com.lerner.ComputersApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lerner.ComputersApp.AppConfig;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class ComputersAppApplication {

	public static void main(String[] args) {
		ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		Intel obj1=factory.getBean(Intel.class);
		System.out.println(obj1);
		obj1.getProcessor().process();
		obj1.getStorage().save();
		Lenovo obj2=factory.getBean(Lenovo.class);
		System.out.println(obj2);
		obj2.getProcessor().process();
		obj2.getStorage().save();
	}

}
