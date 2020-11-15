package battleship;
import battleship.controller.BattleshipsNavigator;

/**
 * Class containing main method which starts the game.
 * 
 * @author Mareike Röncke
 * @version 1.0, November 2020.
 */

public class BattleShipsMain {

	public static void main(String[] args) {
		BattleshipsNavigator navigator = new BattleshipsNavigator();
		navigator.setupBattleshipGame();
	}

}
