package com.Prashant.LearningSpring.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Prashant.LearningSpring.game.GameRunner;

import com.Prashant.LearningSpring.game.MarioGame;
import com.Prashant.LearningSpring.game.PacMan;
import com.Prashant.LearningSpring.game.SuperContra;


public class App02GamingBasicJava {

	public static void main(String[] args) {
		
		//1: Launch a Spring Context(inside the jvm)
		try(var context = 
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguartion.class)){
//			System.out.println(context.getBean(int.class));
//			System.out.println(context.getBean("person2MethodCall"));
//			System.out.println();
//			System.out.println(context.getBean("person3Parameter"));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person3Parameter"));
		}
		//var context = new AnnotationConfigApplicationContext(HelloWorldConfiguartion.class);
		// here we have an error : Resource leak: 'context' is never closed. To fix this use try catch or use try with resources
		//2: Configure the things that we want Spring to manage - 
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		
		//3:Retrieving Beans managed by Spring
		
		
	}

}
