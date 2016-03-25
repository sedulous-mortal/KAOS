//Program by Alison Stuart
//Project commenced in March 2015
//K.A.O.S. is designed to be a language-learning A.I., no more, no less.

import java.util.Scanner;

public class KAOS{
	public static void main(String[] args){
	
		//set next user input to be assigned variable first_name
		Scanner user_input = new Scanner(System.in);
		String first_name;
		System.out.println("What's your first name?");
		first_name = user_input.next();
		System.out.println();
		
		//check for ttyl
		if(first_name.indexOf("ttyl") >= 0){
			System.exit(0);
		}//end check for ttyl
		
		
		System.out.print("Nice to meet you, " + first_name + "!");
		System.out.println();
		
		//tell the program to wait one second
		try {
		Thread.sleep(1000); //1000 milliseconds is one second.
		} 
		
		catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
		}//catch the exception for if the wait delay gets messed up
		
		System.out.print("My name is K.A.O.S.");
		System.out.println();
		System.out.println("When you reply to me, please only use one word.");
		String nameReply = user_input.next();
		
		
		if(nameReply.equals("cool")){
			System.out.println("Thanks!");
		}//end reply to "cool" 
		
		if(nameReply.equals("neat")){
			System.out.println("Indeed!");
		}//end reply to "neat"
		
		
		
		
		class wait(){
		//tell the program to wait one second after ttyl option is revealed
		try {
		Thread.sleep(1000); //1000 milliseconds is one second.
		} //end try 
		}//end class wait
		
		
		
		
		catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
		}//catch the exception for if the wait delay gets messed up
		
		String fav_pet;
		System.out.print("What is your favorite kind of pet?");
		fav_pet = user_input.next();
		System.out.print(" " + fav_pet + "? ");
		//initialize known_pet, the counter for how many pets
		//have been entered that we know
		int known_pet = 0;
		boolean know_pet;
		
		if(fav_pet.equals("cats") || fav_pet.equals("a cat") || fav_pet.equals("cat")){
			System.out.println();
			System.out.print("They go meow!");
			known_pet = known_pet+1;
		}//end cat if
		
		if(fav_pet.equals("dogs") || fav_pet.equals("a dog")){
			System.out.print("They go woof!");
			known_pet = known_pet+1;
		}//end dog if
		
		if(fav_pet.equals("ducks") || fav_pet.equals("a duck")){
			System.out.println();
			System.out.print("They go, Quack! Quack!");
			System.out.println();
			known_pet = known_pet+1;
		}//end duck if
		
		if(fav_pet.equals("cows") || fav_pet.equals("a cow")){
			System.out.print("They go mooooooo!");
			known_pet = known_pet+1;
		}//end cow if
		
		if(fav_pet.equals("birds")|| fav_pet.equals("a bird") 
			|| fav_pet.equals("birdies")){
			System.out.print("They go chirp chirp! ");
			System.out.print("They go cheep cheep! ");
			System.out.println();
			known_pet = known_pet+1;
		}//end bird if
		
		if (fav_pet.equals("a hawk") || fav_pet.equals("hawks") || fav_pet.equals("hawk")){
			System.out.println("They go ca-caw! ca-caw!");
		}//end hawk if
		
		if(fav_pet.equals("fish")){
			System.out.println("They go:");
			System.out.println("Splish splash!");
			System.out.print("Blub blub blub");
			System.out.println();
			known_pet = known_pet+1;
		}//end fish if
		
		if (known_pet>=1){
			know_pet = true;
		}//end finding out if we knew the pet given
		
		else {
			know_pet = false;
		}//end setting know_pet to default false
		
		if(know_pet.equals(false)){
			String new_animal = user_input.next();
			System.out.println(fav_pet+"?");
			String new_animal_sound = user_input.next();
			System.out.println("What sound does that animal make?");
			System.out.println();
			//I need some code here to create a function...
			//The function must create a variable
			//named "animal_" + the string value of new_animal
			//and store new_animal_sound in a string titled,
			//"[value of new_animal] + "_sound"
			System.out.print(" Sweet! I learned something new! ");
			System.out.println();
			System.out.println("I think my favorite pet is going to be " 
			+ fav_pet + " too!");
		System.out.println();
		}//end what to do if pet is unknown
		
	}//end main
		
//The TTYL Checker function (to find out if exiting KAOS interface is desired)
	public String ttyl_checker(){
	String ttyl = user_input.next();
	}//end class ttyl_checker
	
	if(ttyl.equals("ttyl")){
	System.out.println("Hopefully the program will terminate now!");
	System.exit(0); //will cause the program to quit itself
	}//end if statement for ttyl

}//end class ttyl_checker
//if that doesn't work, 
	boolean exit_desired;
		
	System.out.println("Anytime you want me to leave, you can let me know"); 
	System.out.println("by typing ttyl!");
		
	//turn this section into a loop or for or while statement, so it continually checks for 
	//exit_desired to become true
	//if(exit_desired == true){
		//System.out.println("It seems you wish me to leave. Goodbye now!");
	//}//end exit_desired 
		

}//end class KAOS