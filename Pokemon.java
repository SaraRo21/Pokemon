import java.util.ArrayList;
import java.util.List;

/**
 * This class has 2 methods, readMov and checkHouse.
 * 
 * @author Sara Rodrigues
 */
public class Pokemon {
	/**
	 * This method reads the input given by the user, and returns the number of
	 * pokemon's caught by Ash.
	 * 
	 * @param Mov, sequence of movements given by user
	 * @return number of pokemon's
	 */
	public static int readMov(String Mov) {
		List<Point> visitedHouses = new ArrayList<Point>();
		Point currentHouse = new Point(0, 0);
		visitedHouses.add(new Point(currentHouse.getX(), currentHouse.getY()));
		for (int i = 0; i < Mov.length(); i++) {
			String currentMove = String.valueOf(Mov.charAt(i));
			if (currentMove.equals("N")) {
				currentHouse.addY();
				checkHouses(visitedHouses, currentHouse);
			} else if (currentMove.equals("S")) {
				currentHouse.removeY();
				checkHouses(visitedHouses, currentHouse);
			} else if (currentMove.equals("O")) {
				currentHouse.removeX();
				checkHouses(visitedHouses, currentHouse);
			} else if (currentMove.equals("E")) {
				currentHouse.addX();
				checkHouses(visitedHouses, currentHouse);
			} else {
				System.out.println(currentMove + " is a wrong character. Please use N, S, E or/and O.");
				break;
			}
		}

		return visitedHouses.size();
	}

	/**
	 * This method sees if Ash has already been at a certain house or not.
	 * 
	 * @param list, list of positions that Ash has been at
	 * @param l, current position of Ash
	 * @return true if Ash has already been at the house and vice versa.
	 */
	public static boolean checkHouses(List<Point> list, Point l) {
		if (Point.equals(l, list)) {
			list.add(new Point(l.getX(), l.getY()));
			return true;
		}
		return false;
	}
}
