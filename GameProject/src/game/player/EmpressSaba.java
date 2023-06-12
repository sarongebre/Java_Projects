package game.player;

public class EmpressSaba extends Wrestler {

	public EmpressSaba() {

		super(); //means something needs to go to wrestler

		this.role = "EmpressSaba";
		this.signatureMove ="Spouting Magical Ink In The Air From His Quil";
		this.finisherMove = "Jumping in the air and landing with ne foot";
		this.themeMusicTitle = "Ow the wise Sage";
		this.magicSkillLevel = "Medium";
		this.swordSkillLevel = "High";
		this.lifeBar = 600;

		this.themeMusicLyrics.add("Ow the Wise Sage");
		this.themeMusicLyrics.add("The wisest of them all");
		this.themeMusicLyrics.add("You deserve to rule the empire");
		this.themeMusicLyrics.add("And bring justice to as all");


	}



	@Override
	public String signatureMove(int moveSuccess) {
		String moveResults = "Wow, sad that you magic spell with your quil";
		switch(moveSuccess) {
		case 1:
		case 2:
			moveResults ="That is a very sad spell";
			break;
		case 3:
		case 4:
			moveResults = "Great spell";
			break;
		case 5:
		case 6:
			moveResults = "You have made yourdelf a bird! awesome";
			break;
		}
		return moveResults;
	}
	
	public boolean equals(Object other) {
		boolean result;
		if((other == null) || (this.getClass() != other.getClass())) {
			result = false;
		} else {

			EmpressSaba otherWrestler = (EmpressSaba)other;

			result = this.role.equals(otherWrestler.role) ? true : false; //???
		}
		return result;

	}
	 @Override
	public String toString() {
	return this.role;
	}
	@Override
	public String finisherMove(int moveSuccess) {
		String moveResults = "Wow, sad that move wasn't nice";
		switch(moveSuccess) {
		case 1:
		case 2:
			moveResults ="That is a very sad landing";
			break;
		case 3:
		case 4:
			moveResults = "Great move";
			break;
		case 5:
		case 6:
			moveResults = "Nice jump!";
			break;
		}
		return moveResults;
	}
	
	


}

