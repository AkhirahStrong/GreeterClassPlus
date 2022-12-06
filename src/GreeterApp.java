import java.util.*;

public class GreeterApp {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		 scan = new Scanner(System.in);
		 
			String greeting = getGreeting();
			String name = getName();
			int volume = getVolume();
			String htmlTag = getHtmlTag();
			ArrayList<Greeter> greetings = new ArrayList<>();
			greetings.add(0, new Greeter(greeting));
			greetings.add(1, new SimonGreeter(greeting));
			greetings.add(2, new LoudGreeter(greeting));
			greetings.add(3, new HtmlGreeter(greeting, htmlTag));
			scan.close();

			// Add loudness to LoudGreeting based on user input
			for (int i = 0; i < volume; i++) {
				((LoudGreeter) greetings.get(2)).addVolume();
			}
			
			for(Greeter greetingObj : greetings) {
				System.out.println(greetingObj.greet(name));
			}

	}
	
	/**
	 * Console input reading method for htmlTag
	 * 
	 * @return user entered htmlTag String
	 */
	private static String getHtmlTag() {
		String htmlTag = "";
		
		// Collect html tag
		while (htmlTag.equals("")) {
			System.out.print("What would you like the html tag to be? ");

			try {
				htmlTag = scan.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid input encountered...");
			}
		}
		return htmlTag;
	}
	
	
	/**
	 * Console input reading method for volume
	 * 
	 * @return user entered volume number
	 */
	private static int getVolume() {
		int volume = -1;
		// Collect volume
		while (volume < 0) {
			System.out.print("How much volume to add? (0 to 10): ");

			try {
				volume = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid input encountered...");
			}
		}
		return volume;
	}
	
	/**
	 * Console input reading method for name
	 * 
	 * @return user entered name String
	 */
	private static String getName() {
		String name = "";
		// Collect user's name
		while (name.equals("")) {
			System.out.print("Enter your name: ");

			try {
				name = scan.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid input encountered...");
			}
		}
		return name;
	}
	
	/**
	 * Console input reading method for greeting
	 * 
	 * @return user entered greeting String
	 */
	private static String getGreeting() {
		String greeting = "";
		while (greeting.equals("")) {
			System.out.print("Choose a greeting: ");

			try {
				greeting = scan.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid input encountered...");
			}
		}
		return greeting;
	}

}
