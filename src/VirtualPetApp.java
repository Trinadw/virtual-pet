import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet jax = new VirtualPet();
		jax.name = "Jax";
//visual of Jax
		writeLine("	    *~*");
		writeLine("	   @ oo @");
		writeLine("	   _( ^) ");
		writeLine("            >~<");

		writeLine("My pet monkey's name is " + jax.name + ".");
		System.out.println("Jax is currently feeling on a scale of 1-100:\nhunger = " + jax.getHunger() + "\nthirst = "
				+ jax.getThirst() + "\nenergy = " + jax.getEnergy());
//actions for and by Jax
		do {
			writeLine("What would you like to do: feed, water, or bed? Quit exits the game.");
			String state = input.next();
			switch (state.toLowerCase()) {
			case "feed":
				jax.feed();
				break;
			case "water":
				jax.water();
				break;
			case "bed":
				jax.bed();
				break;
			case "quit":
				writeLine("Don't be a quitter! Think of Jax and how she feels.");
				System.exit(0);
				break;
			default:
				writeLine("This is not a valid entry.");
				continue;
			}
			writeLine("Jax is currently feeling: \nhunger =  " + jax.getHunger() + "\nthirst = " + jax.getThirst()
					+ "\nenergy = " + jax.getEnergy());
			jax.tick();

			writeLine("Three hours later, Jax is currently feeling: \nhunger  " + jax.getHunger() + "\nthirst = "
					+ jax.getThirst() + "\nenergy = " + jax.getEnergy());
			if (jax.isHungry()) {
				jax.stealBanana();
				writeLine("Jax stole a banana. Her hunger = " + jax.getHunger() + "." + " Now she's happily hooting!");
			}
			if (jax.isThirsty()) {
				writeLine("Jax was so thirsty, she drank out of the toilet. Her thirst = " + jax.getThirst() + ".");
			}
			if (jax.isTired()) {
				writeLine("Jax's behavior tanks when she's tired. Hide the breakables! Her energy = " + jax.getEnergy()
						+ ".");
			}

		}

		while (jax.getEnergy() > 0 && jax.getHunger() > 0 && jax.getThirst() > 0);
		//death parameters
		if (jax.getEnergy() <= 0 || jax.getThirst() <= 0 || jax.getHunger() <= 0) {
			System.out.println("Sorry, Jax is no longer with us. You'll need to dig a hole in the backyard.");

		}
	}

	public static void writeLine(String message) {
		System.out.println(message);

	}

}
