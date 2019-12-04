package com.bae.rPSTest;

import org.junit.Assert;
import org.junit.Test;

import rockpaperscissors.RockPaperScissors;


public class RPSTest {

	@Test
	public void rPSTest() {
		RockPaperScissors rPS = new RockPaperScissors();
		String result1 = rPS.playRPS("rock", "paper");

		Assert.assertEquals("Paper covers Rock computer wins.", result1);

		String result2 = rPS.playRPS("rock", "scissors");

		Assert.assertEquals("Rock crushes Scissors player wins.", result2);

		String result3 = rPS.playRPS("rock", "rock");

		Assert.assertEquals("Rock and Rock..sit there.  They're rocks. It's a draw!", result3);

		String result4 = rPS.playRPS("paper", "paper");

		Assert.assertEquals("Paper and Paper..lay there.  They're bits of paper. It's a draw!", result4);

		String result5 = rPS.playRPS("paper", "rock");

		Assert.assertEquals("Paper covers Rock computer wins", result5);

		String result6 = rPS.playRPS("paper", "scissors");

		Assert.assertEquals("Scissors cut Paper computer wins", result6);

		String result7 = rPS.playRPS("scissors", "scissors");

		Assert.assertEquals("Scissors and Scissors cannot cut each other.It's a draw!", result7);

		String result8 = rPS.playRPS("scissors", "paper");

		Assert.assertEquals("Scissors cut Paper player wins", result8);

		String result9 = rPS.playRPS("scissors", "rock");

		Assert.assertEquals("Rock crushes Scissors computer wins", result9);
		
		
	}

}
