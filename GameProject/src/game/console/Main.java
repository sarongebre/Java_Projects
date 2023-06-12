package game.console;


//zoo keeper is going to be our test bench// basically going to call all methods here
public class Main {
	public static void main(String[] args) {
		try {
		Game.displaygameIntro();
		Game.playerSetup();
		Game.playerIntros();
		Game.playRounds();
		Game.announceWinner();
		Game.displayGameClosing();
		}
		catch (Exception except) {
			System.out.println(except.getMessage());
			System.out.println("Error has been detected. Program has ended abruptally");
		}
		
	}
}
