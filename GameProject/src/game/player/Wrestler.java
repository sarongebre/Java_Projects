package game.player;

import java.util.ArrayList;

abstract public class Wrestler implements Holds, Attacks, CastSpell { //implements Holds, Attacks, Throws



	protected String role;
	protected String signatureMove;
	protected String finisherMove;
	protected String themeMusicTitle;
	protected String magicSkillLevel;
	protected String swordSkillLevel;
	protected int lifeBar;
	protected ArrayList<String> themeMusicLyrics = new ArrayList<String>();
	protected int pointTotal;


	public Wrestler() {
		this.role = "unknown";
		this.signatureMove = "unknown";
		this.finisherMove = "unknown";
		this.magicSkillLevel ="unknown";
		this.swordSkillLevel = "unknown";
		this.lifeBar = 100;

	}


	public void displayInfo() { 
		System.out.println( "\n" + "Your chosen role = " + this.role +

				"\n" + "Your Role's Theme Musics =" + this.themeMusicTitle +
				"\n" + "Your Role's Signature Move ="  + this.signatureMove +
				"\n" + "Your Role's Finisher Mover =" + this.finisherMove );
	}

	public String getSignatureMove() { return this.signatureMove;}
	public abstract String signatureMove(int moveSuccess); //don't know if there should be void
	public void setSignatureMove(String signatureMove) {
		this.signatureMove = signatureMove;
	}

	public String getFinisherMove() { return this.finisherMove;}
	public abstract String finisherMove(int moveSuccess); //don't know if there should be void
	public void setFinisherMove(String finisherMove) {
		this.finisherMove = finisherMove;
	}

	/*public String getMagicSkillLevel() { return this.magicSkillLevel;}
	public abstract String magicSkillLevelMove(int moveSuccess); //don't know if there should be void
	public void setMagicSkillLevel(String magicSkillLevel) {
		this.magicSkillLevel = magicSkillLevel;
	}

	public String getSwordSkillLevel() { return this.swordSkillLevel;}
	public abstract String SwordSkillLevel(int moveSuccess); //don't know if there should be void
	public void setSwordSkillLevel(String swordSkillLevel) {
		this.swordSkillLevel = swordSkillLevel;
	}

	public int getLifeBar() { return this.lifeBar;}
	public abstract String lifeBar(int moveSuccess); //don't know if there should be void
	public void setLifeBar(int lifeBar) {
		this.lifeBar = lifeBar;
	}

*/
	
	
	public void setMagicSkillLevel(String magicSkillLevel) {
		this.magicSkillLevel = magicSkillLevel;
	}
	public String getMagicSkillLevel() { 
		return this.magicSkillLevel;}
	
	public String getRole() { 
		return this.role;}
	public void setRole(String role) {
		this.role = role;
	}


	public ArrayList<String> getThemeMusicLyrics() {
		return this.themeMusicLyrics; }

	public void setThemeMusicLyrics(ArrayList<String> themeMusicLyrics) {
		this.themeMusicLyrics = themeMusicLyrics;
	}

	public String getThemeMusicTitle() { 
		return this.themeMusicTitle ;}

	public int getPointTotal(){ 
		return this.pointTotal;}

	public void addPoints(int points ) {
		this.pointTotal = points;
	}

	















}
