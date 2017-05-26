
public class VirtualPet {
	String name;
	int hunger = 7;
	int thirst = 4;
	int energy = 9;

	
	
	

int getHunger(){
	return hunger;
}

boolean isHungry(){
	return hunger>=7;
	}
int getThirst(){
	return thirst;
}
boolean isThirsty(){
	return thirst>=4;
}
	int getEnergy(){
		return energy;
			}
	boolean isTired(){
		return energy<=7;
			}
	void feed(){
	hunger = hunger-2;
	thirst = thirst +1;
	energy = energy -3;
			}
	void water(){
		thirst = thirst-1;
		energy = energy -1;
	}
	void bed(){
		energy = energy +3;
		hunger = hunger +3;
	}
	void tick(){
		hunger = hunger + 2;
		thirst = thirst + 3;
		energy = energy -4;
				
	}
	
}


