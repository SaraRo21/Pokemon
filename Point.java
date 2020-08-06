import java.util.List;

/**
 * 
 * @author Sara Rodrigues
 *
 */
public class Point {
	private int x;
	private int y;

	/**
	 * Constructor of class Point.
	 * 
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Getter of x from Point Object.
	 * 
	 * @return x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Getter of y from Point Object.
	 * 
	 * @return y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Adds one at the value x from the Point object.
	 */
	public void addX() {
		this.x++;
	}

	/**
	 * Removes one at the value x from the Point object.
	 */
	public void removeX() {
		this.x--;
	}

	/**
	 * Adds one at the value y from the Point object.
	 */
	public void addY() {
		this.y++;
	}

	/**
	 * Removes one at the value y from the Point object.
	 */
	public void removeY() {
		this.y--;
	}

	/**
	 * This method checks if the (x, y) from object s is equal to the (x, y) from object l
	 * 
	 * Object s: for loop in given list, list
	 * Object l: Point object given, it corresponds to the current position of Ash
	 * 
	 * @param l
	 * @param list
	 * @return boolean true if the object s is different from the object l and vice
	 *         versa.
	 */
	public static boolean equals(Point l, List<Point> list) {
		for (Point s : list) {
			if (s.getX() == l.getX() && s.getY() == l.getY()) {
				return false;
			}
		}
		return true;
	}


	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}

}
