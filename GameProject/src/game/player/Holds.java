package game.player;
//all wrestler should 
public interface Holds {
	
public default String nelsonHold(int moveSuccess) {
String moveResults = "Hmm...something must have gotten wrong with Nelson Hold";
switch (moveSuccess)
{
case 1:
case 2:
	moveResults = "That was the saddest Nelson Hold I have ever saw";
	break;
case 3:
case 4:
	moveResults = "Well okay but I have seen better Nelson Holds";
	break;
}
return moveResults;
}

public default String pinHold(int moveSuccess) {
	String moveResults = "Hmmm....Something must have gone wrong with the pin hold move";
	return moveResults;
	//needs switch
}



}
