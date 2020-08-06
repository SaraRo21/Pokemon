import java.util.Scanner;

/**
 * This class deals with the interactions with the user.
 * 
 * @author Sara Rodrigues
 */

public class RunCode {

	/**
	 * It uses a Scanner that corresponds to the input of the program, given by the
	 * user.
	 * 
	 */

	@SuppressWarnings("resource")
	public static void scannerPokemons() {
		System.out.println("Hello Ash! Let's Play!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input (N/S/E/O): ");
		String SeqMov = sc.nextLine();
		
		double startTime = System.nanoTime();
		
		System.out.println("Output: " + Pokemon.readMov(SeqMov));
		
		double endTime = System.nanoTime();
		System.out.println("Took " + ((endTime - startTime)/1000000000) + " seconds.");
	}

	/**
	 * Loop to see if the user wants to keep playing or not.
	 * 
	 */
	@SuppressWarnings("resource")
	static void scanner() {
		scannerPokemons();
		boolean end = true;
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Want to go again? (Y/N)");
			String yn = in.nextLine();
			if (yn.equals("Y")) {
				scannerPokemons();
			} else if (yn.equals("N")) {
				System.out.println("Goodbye Ash!");
				end = false;
			} else {
				System.out.println(yn + " is a wrong character. Please use Y or N.");
			}
		} while (end);

	}

	/**
	 * Calls the main method, so the program runs.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner();
	}
}