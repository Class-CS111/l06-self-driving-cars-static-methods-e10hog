// When you are ready to have your work checked, change the value below from N to Y
// ReadyForSubmission=Y
// YOUR NAME: ETHAN LUONG
// COLLABORATORS:
// DATE: 3/1/25

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("My thoughts on the article are:");
		// Part 2: Invoking/calling method
		printThoughts();
	}
	
	// Part 1: Creating method definition
	/* method header */ public static /* return type > */ void /* identifier > */printThoughts() {
		// method body 
		String first = "Pedestrians are more likely to be hurt than the people in the car, so it is should prioritize the safety of pedestrians.\n";
		String second = "The environment of the car since that would determine what paths or maneuvers it can take to protect the pedestrians/passengers, but also reduce the amount of damage to the environment. Also, if the car could recognize the ages and status of the pedestrians, it could prioritize saving children and elders over adults.\n";
		String third = "Not only should the company decide this algorithm, but it should consider the inputs of the public and the government to agree on how should the car act in these scenarios.";
		System.out.println(first + second + third);
	}
}