import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet jax = new VirtualPet();
		jax.name = "Jax";
	
System.out.println("	    *~*");
System.out.println("	   @ oo @");
System.out.println("	   _( ^) ");
System.out.println(" 	    >~<");
		
		
		writeLine("My pet monkey's name is " + jax.name);
		System.out.println("Jax is currently feeling on a scale of 1-50:\nhunger = " + jax.getHunger() + "\nthirst = "
				+ jax.getThirst() + "\nenergy = " + jax.getEnergy());

		do{
		System.out.println("What would you like to do: feed, water, or put Jax to bed?");
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
			System.out.println("Don't be a quitter! Think of Jax and how she feels.");
				System.exit(0);
				break;
				default:
					System.out.println("This is not a valid entry.");
		continue;
		}
		System.out.println("Jax is currently feeling: \nhunger =  " + jax.getHunger() + "\nthirst = "
				+ jax.getThirst() + "\nenergy = " + jax.getEnergy());
		jax.tick();
			
		System.out.println("Three hours later, Jax is currently feeling: \nhunger  " + jax.getHunger() + "\nthirst = "
				+ jax.getThirst() + "\nenergy = " + jax.getEnergy());
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
