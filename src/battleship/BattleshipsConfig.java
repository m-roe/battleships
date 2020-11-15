package battleship;

/**
 * Class to encapsulate globally used variables.
 * 
 * @author Mareike Röncke
 * @version 1.0, November 2020.
 */

public class BattleshipsConfig {
	
	// Life count for every user playing the game
	public static final int LIFES = 3;
	// size of the battlefield (number of rows and columns are even)
	public static final int FIELD_SIZE = 3;
	// number of battleships to be found on the field
	public static final int BATTLESHIP_NO = 3;
	public static final String[] SHIP_SHAPES = {"o", "x", "#", "+", "§"};
	public static final boolean DEBUGGER = true;

}
