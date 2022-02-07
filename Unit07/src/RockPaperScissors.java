//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		int rand = (int)(Math.random()*3);
		String compChoice = "";
		if(rand == 0) {
			compChoice = "R";
		}
		if(rand == 1) {
			compChoice = "P";
		}
		if(rand == 2) {
			compChoice = "S";
		}
		if(playChoice.equals(compChoice)) {
			return "!Draw Game!";
		}
		else if(playChoice.equals("R") && compChoice.equals("S") || playChoice.equals("S") && compChoice.equals("P")|| playChoice.equals("P") && compChoice.equals("R")) {
			return "!Player wins <<" + playChoice + " beats " + compChoice + ">>";
		}
		else return "!Computer wins <<" + compChoice + " beats " + playChoice + ">>";
	}

	public String toString()
	{
		setPlayers(playChoice);
		String output = determineWinner();
		return output;
	}
}