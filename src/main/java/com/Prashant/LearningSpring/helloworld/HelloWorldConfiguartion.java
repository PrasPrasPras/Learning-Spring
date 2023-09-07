package com.Prashant.LearningSpring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address address) {};
record Address(String locality,String city) {};

@Configuration
public class HelloWorldConfiguartion {
	
	@Bean
	public String name() {
		return "Rango";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Address address() {
		return new Address("Ram Nagar","Purnia");
	}
	@Bean(name = "person1")
	public Person person() {
		return new Person("Rahul",19,new Address("Ram Nagar","Purnia"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3Parameter(String name, int age, @Qualifier("address2qualifier")Address address) {
		return new Person(name,age,address);
	}
	
	@Bean
	//@Primary
	@Qualifier("address2qualifier")
	public Address address2() {
		return new Address("Whitefield","Bangalore");
	}
	
	@Bean
	@Primary
	public Address address3() {
		return new Address("COllege Street","Kolkata");
	}
}
