import java.util.ArrayList;
import java.util.List;

/**
 * @author Sara Rodrigues
 *
 */
public class TestCode {

	/**
	 * Unit Tests
	 * 
	 * @param args
	 */
	
	
	static void alwaysEast() {
		String alwaysEast = "E";
		for (int i = 1; i < 10000; i++) { // This leaves with a string with 10000 E's
			alwaysEast+="E";
		}
		if(Pokemon.readMov(alwaysEast)==10001) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}
	
	static void NESO() {
		if(Pokemon.readMov("NESO")==4){
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}		
	
	static void E() {
		if(Pokemon.readMov("E")==2){
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}
	
	static void NS() {
		if(Pokemon.readMov("NSNSNSNSNSNS")==2){
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}
	
	static void testCheckHouses(List<Point> list, Point l) {
		if(Pokemon.checkHouses(list, l)) {
			System.out.println("Point wasn't in the list");
		}else {
			System.out.println("Point was in the list");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubs

		System.out.println("Mov. Sequence: ENSJ -> Output: " + Pokemon.readMov("ENSJ"));

		System.out.println("Mov. Sequence: JNNN -> Output: " + Pokemon.readMov("JNNN"));

		System.out.println("Mov. Sequence: 6 -> Output: " + Pokemon.readMov("6"));
		
		alwaysEast();
		NESO();
		E();
		NS();
		
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(0,1));
		Point l = new Point(0,1);
		testCheckHouses(list, l);
		
		Point l1 = new Point(0,3);
		testCheckHouses(list, l1);
	}
}
