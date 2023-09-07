package com.Prashant.LearningSpring.game;

import org.springframework.beans.factory.annotation.Qualifier;

public class GameRunner {
	//MarioGame game;
	GamingConsole game;
	
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
}
