package rockpaperscissors;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
	Map<String, String> rPSCases = new HashMap<>();

	public RockPaperScissors() {
		rPSCases.put("rockvpaper", "Paper covers Rock");
		rPSCases.put("scissorsvpaper", "Scissors cut Paper");
		rPSCases.put("rockvscissors", "Rock crushes Scissors");
		rPSCases.put("rockvrock", "Rock and Rock..sit there.  They're rocks. It's draw!");
		rPSCases.put("papervpaper", "Paper and Paper..lay there.  They're bits of paper. It's a draw!");
		rPSCases.put("scissorsvscissors", "Scissors and Scissors cannot cut each other. It's a draw!");
	}

	public String playRPS(String playerInput, String computer) {
		switch (playerInput) {
		case "rock": 
			if (computer.equals("rock")) {
				return rPSCases.get("rockvrock");
			}
			if
		case "paper":
			jkgjkgjm
		case "scissors":
			jgkg
		}
		
			
		return null;
	}

	
}
