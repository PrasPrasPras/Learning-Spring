package com.Prashant.LearningSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.Prashant.LearningSpring.game.GameRunner;
import com.Prashant.LearningSpring.game.GamingConsole;
import com.Prashant.LearningSpring.game.MarioGame;
import com.Prashant.LearningSpring.game.PacMan;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	//@Primary
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(new MarioGame());
		return gameRunner;
	}
	
	@Bean(name="PacmanBean")
	@Primary
	public GameRunner gameRunner2(GamingConsole game) {
		var gameRunner = new GameRunner(new PacMan());
		return gameRunner;
	}
//	var game = new PacMan();   
//	var gameRunner = new GameRunner(game); // passing marioGame as a constructor here
//	gameRunner.run();
//	
}
