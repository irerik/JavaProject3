import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		int entryAmount = welcome(userInput);
		System.out.println(entryAmount);
		
		String[] names = new String[entryAmount];

		for (int a = entryAmount - 1; a >= 0; a--) {
			//System.out.println(contactInfo(userInput));
			names[a] = contactInfo(userInput);
		}
		
		System.out.println("These are your added names: ");
		
		for (String item : names) {
				System.out.println(item);
			}

		}

	

	public static void say(String string) {

		System.out.println(string);

	}

	public static int welcome(Scanner userInput) {

		say("Welcome to the Cheapo Phone Book!");
		say("Please inform me of how many contacts you will be entering today:");

		int entryAmount = userInput.nextInt();
		userInput.nextLine();
		return entryAmount;

	}

	public static String contactInfo(Scanner userInput) {

		say("What is the name of the contact?");

		String name = userInput.nextLine();
		return name;

	}

}
