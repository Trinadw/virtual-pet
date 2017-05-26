import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet jax = new VirtualPet();
		jax.name = "Jax";
		writeLine("My pet monkey's name is " + jax.name);
		System.out.println("Jax is currently feeling on a scale of 1-20, hunger =  " + jax.getHunger() + " ,thirst = "
				+ jax.getThirst() + " and energy = " + jax.getEnergy() + ".");

		do{
		System.out.println("What would you like to do: feed, water, or put Jax to bed?");
		String state = input.next();
		switch (state) {
		case "feed":
			jax.feed();
			break;
		case "water":
			jax.water();
			break;
		case "bed":
			jax.bed();
			break;
		case "Quit":
			System.out.println("Don't be a quitter! Think of Jax and how she feels.");
				System.exit(0);
		
		}
		System.out.println("Jax is currently feeling hunger =  " + jax.getHunger() + " ,thirst = "
				+ jax.getThirst() + " and energy = " + jax.getEnergy() + ".");
		jax.tick();
		System.out.println("Go enjoy yourself for a couple hours.");
		
		System.out.println("Three hours later, Jax is currently feeling hunger =  " + jax.getHunger() + " ,thirst = "
				+ jax.getThirst() + " and energy = " + jax.getEnergy() + ".");
		}
		while(jax.getEnergy()>0);
		if (jax.getEnergy()<=0){
			System.out.println("Sorry, Jax is no longer with us. You'll need to dig a hole in the backyard.");
		}
	}

	public static void writeLine(String message) {
		System.out.println(message);

	}

}
