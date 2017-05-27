
public class VirtualPet {
	String name;
	int hunger = 37;
	int thirst = 34;
	int energy = 49;
	
	

int getHunger(){
	return hunger;
}

boolean isHungry(){
	return hunger>=5;
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
	hunger = hunger-10;
	thirst = thirst +10;
	energy = energy -8;
			}
	void water(){
		thirst = thirst-10;
		energy = energy -7;
	}
	void bed(){
		energy = energy +10;
		hunger = hunger +10;
		thirst = thirst +10;
	}
	void tick(){
		hunger = hunger + 12;
		thirst = thirst + 13;
		energy = energy -14;
				
	}
	
}


