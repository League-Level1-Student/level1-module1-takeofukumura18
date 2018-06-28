/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if(name.equals("Papa")) {
			return "My hat is red.";
		}
		else
		return "My hat is white.";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if(name.equals("Smurfette")) {
			return "I am a woman.";
		}
		else {
		return "I am a man.";
		}
	}
	
	public static void main(String[]args) {
		Smurf handy=new Smurf("Handy");
		handy.eat();
		System.out.println(handy.getName());
		
		Smurf papa=new Smurf("Papa");
		papa.eat();
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		
		Smurf g=new Smurf("Smurfette");
		g.eat();
		System.out.println(g.getName());
		System.out.println(g.getHatColor());
		System.out.println(g.isGirlOrBoy());
	}

}



