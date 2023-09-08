package com.Prashant.LearningSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Prashant.LearningSpring.game.GameRunner;
import com.Prashant.LearningSpring.game.GamingConsole;
import com.Prashant.LearningSpring.game.MarioGame;
import com.Prashant.LearningSpring.game.PacMan;
import com.Prashant.LearningSpring.game.SuperContra;
import com.Prashant.LearningSpring.helloworld.HelloWorldConfiguartion;

public class App03GamingSpringBeans {
//commenting as a collaborater --
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
	}
}

