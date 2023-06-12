package game.console;
import java.util.ArrayList;
import java.util.Random;
import game.player.*;

public class Game {
	//set this field to true if you want to know when a method starts and end for debugging purposes
	private static final boolean DEBUG_ON = true;

	//private  static int numHeats ;
	private  static Wrestler player1;
	private  static Wrestler player2;

	private static Random randGen = new Random();

	private final static String[] moves = {"Sword Slash Attack", "Jump Kick Attack", "Summon Enchanted Creatures to attack ","Summon Baba Soldier to attack", "Cast Fire", "Cast Thunder","Signiture Move"};
	private final static String[] roles= {"Mr_Sage", "EmpressSaba"};
	

	protected static void displaygameIntro() { //private 
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");
		Console.doubleDashLineGap();
		System.out.println("Welcome to Ancient Axum Exmpire Throne Fight Game \n");
		Console.singleDashLineGap();
		System.out.println("Here are the rules of the game: \n\n"
				+ "1) First Players will select their desired roles \n"
				+ "2) You will slect the move you would like to play against your openent \n"
				+ "3) Whome ever player has the greatest moves will have the greatest points, "
				+ "and whome ever has the greater point will be the winner!" + "Goodluck! \n");
		Console.pressEnterToContinue();
		if(DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");
		System.out.println();
	} 

	protected static Wrestler createPlayer(int role) throws Exception {  //private 

		if(DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

		Wrestler player = null;

		switch(role) {

		case 1:
			player = new Mr_Sage(); //don't know if Mr_Sage should be infort///////////
			break;
		case 2:
			player = new EmpressSaba(); //also player 1 and 2 yigbu aygbu have no idea//////////
			break;
		default:
			throw new Exception("Invalid role number, + role");

		}



		if(DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");
		return player;
	}



	protected static void displayRoles() { //private 
		if(DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

		System.out.println(Console.doubleDashLine);

		int i = 1;

		for ( String role: roles) {   //no idea if this is going to work we will see
			System.out.println( "# " + i  + role);
			if (i==1)
				{Game.displayPlayerMagicSkill(player1);}
			else {
				Game.displayPlayerMagicSkill(player2);
			}
			
			i++;
		}

		System.out.println(Console.doubleDashLine);

		if(DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");


	}

	protected static void displayMoves(Wrestler player) { //private 
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());

		System.out.println(Console.doubleDashLine);	

		int i = 1;

		for ( String move: moves) {   //no idea if this is going to work we will see
			System.out.println(i + "# " + move);
			i++;

			//in or out of for loop i don't know
			//plus dusplay the player's signiture move as the last move by using the getter method
			//System.out.println(Console.doubleDashLine);

		}

		System.out.println(++i + "#"  +  player.getSignatureMove());
		System.out.println(Console.doubleDashLine);


		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());




	}

	protected static void displayPlayerInfo(Wrestler player) { //private 
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());

		player.displayInfo();// displaying the display info found in wrestelor
		//display the theme music, signiture mover and finisher move using the player's getter methods


		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());


	}

	protected static void displayPlayerMusic(Wrestler player) {//private 
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());

		ArrayList<String> themeMusicLyrics = player.getThemeMusicLyrics();

		for(int i = 0; i < themeMusicLyrics.size(); i++) {//FOR LOOP to display all elements of the player's theme msic by using theme music array by using getter method
			System.out.println(themeMusicLyrics.get(i));


		}

		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	protected static void displayPlayerMagicSkill(Wrestler player) {//private 
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());
String magicSkillLevel = player.getMagicSkillLevel();
System.out.println(magicSkillLevel);
	}
	protected static void  playerSetup() throws Exception{ //private 

		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		int role;
		while(true)
			try {
				{
					
					System.out.println("First player, please select your role");
					Game.displayRoles(); //Display roles
					role = Console.numericInput(1,  roles.length);
					player1 = Game.createPlayer(role); //create player
					Game.displayPlayerInfo(player1); //display player info
					System.out.println();
					Console.pressEnterToContinue();


					System.out.println("Second player, please select your role");
					Game.displayRoles();
					role = Console.numericInput(1,  roles.length); //1 milewun 2 arekut
					player2 = Game.createPlayer(role);
					Game.displayPlayerInfo(player2);
					System.out.println();
					Console.pressEnterToContinue();

					if(player1.equals(player2)) {
						System.out.println("Sorr, but both players can not select the same role, please choose again");
						//System.out.println();
						//Console.pressEnterToContinue();
					}
					else {
						break;
					}
					System.out.println();
					Console.pressEnterToContinue();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());



	}


	protected static void playerIntros () { //private 
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Console.poundLineGap();
		System.out.println(player1 + "is entering the ring");//let them know player one has entered the ring.displayPlayerMusic(player1);
		Game.displayPlayerMusic(player1);
		//Display theme music
		Console.singleDashLineGap();

		System.out.println(player2 + " is entering the ring");//let them know player one has entered the ring
		Game.displayPlayerMusic(player2);
		Console.pressEnterToContinue();
		Console.singleDashLineGap();
		System.out.println();

		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		

	}

	protected static void  playRounds () {
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		int points = 0;
		int player1Move = 0;
		int player2Move = 0;
		int player1MoveSuccess = 0;
		int player2MoveSuccess = 0;

		do {
			//ask player one to select thier move
			System.out.println("Please select your move player 1");
			Game.displayMoves(player1);
			player1Move = Console.numericInput(1,  moves.length + 1);
			System.out.println();

			System.out.println("Please select your move player 2");
			Game.displayMoves(player2);
			player2Move = Console.numericInput(1,  moves.length + 1);
			System.out.println();

			player1MoveSuccess = performMove(player1, player1Move); //where is perform move/?
			player2MoveSuccess = performMove(player2, player2Move);

			System.out.println();

			if (player1MoveSuccess == player2MoveSuccess) { //why isn't player one move success not working?
				System.out.println("It's a Draw!");

			} else if ((player1MoveSuccess < player2MoveSuccess )){
				points = player2MoveSuccess - player1MoveSuccess;//announce who won the round and how many points they won by the difference in player's move success
				player2.addPoints(points);//Display both player's points

				System.out.println(player2 + "Playre two won this round, adding" + points + " points");

			}else if (player1MoveSuccess > player2MoveSuccess ){
				points = player1MoveSuccess - player2MoveSuccess;//announce who won the round and how many points they won by the difference in player's move success
				player1.addPoints(points);//Display both player's points
			} 
			Console.poundLineGap();
			System.out.println(player1 + "Currently has this points " + player1.getPointTotal() + " points");
			System.out.println(player2 + "Currently has this points " + player2.getPointTotal() + "points");
			Console.poundLineGap();

			if (player1.getPointTotal() >= 12 || player2.getPointTotal() >= 12) 
				break;//if either player has reached 20 points, break out of the loop
			System.out.println();

		} while (Console.ynInputValue("Do you want to continue or end the game?"));


		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());


	}


	protected static int performMove(Wrestler player, int playerMove) {

		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());

		int moveSuccess = randGen.nextInt(6) + 1;
		String moveResults = null;

		switch(playerMove) {
		case 1:
			moveResults = player.legDropKick(moveSuccess); //This in werstler or interfaces?

			break;

		case 2:
			moveResults = player.nelsonHold(moveSuccess);// why?

			break;
			//case 7 signiture move
			//dfault
		}

		System.out.println( player + " " + moveResults);
		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());

		return moveSuccess;}

	protected static void announceWinner () {

		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());

		int playerNumber;
		Wrestler winner = player1;

		if (player1.getPointTotal() > player2.getPointTotal() ) {
			playerNumber = 1;
	        player1 = winner;
			//and the winner is equal to plaer 1
		}else {
			playerNumber = 2;
			player2 = winner;
			//wonner is equal to plauer 2


		}
		Console.poundLineGap();
		//Display the winner's finsihing move
		System.out.println("And the winner is!" + winner);
		System.out.println("Congratulations!");
		//diplay the winner
		displayPlayerMusic(winner);
		Console.poundLineGap();

		if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	protected static void displayGameClosing () {
		if (DEBUG_ON) System.out.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName());

		System.out.println("Thank you very much for playing! please come again");

				if (DEBUG_ON) System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}











