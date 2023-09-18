package com.Prashant.LearningSpring;

import com.Prashant.LearningSpring.game.GameRunner;
import com.Prashant.LearningSpring.game.MarioGame;
import com.Prashant.LearningSpring.game.PacMan;
import com.Prashant.LearningSpring.game.SuperContra;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		//var game = new SuperContra();
		var game = new PacMan();   
		var gameRunner = new GameRunner(game); // passing marioGame as a constructor here
		gameRunner.run();
		//attempting to edit file on github website directly .
	}

}
