package oop;

abstract class Cricketer {
	protected String name, country;

	public Cricketer(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.country);
	}

	public abstract int getPoints();
}

class Batsman extends Cricketer {
	protected int runs;

	public Batsman(String name, String country, int runs) {
		super(name, country);
		this.runs = runs;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.runs);
	}

	public int getPoints() {
		return this.runs / 30;
	}

}

class Bowler extends Cricketer {
	protected int wickets;

	public Bowler(String name, String country, int wickets) {
		super(name, country);
		this.wickets = wickets;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.wickets);
	}

	public int getPoints() {
		return this.wickets / 2;
	}
}

public class TestCricketer {

	public static void main(String[] args) {
		Bowler bowler = new Bowler("Bhumra", "India", 240);
		bowler.print();
		System.out.println(bowler.getPoints());
		
		Cricketer c = new Batsman("Dhoni","Ind",1800);   // Upcasting
		c.print();   // Runtime polymorphism 
		c = new Bowler("Xyz","ENG",200);
		c.print();
		
		System.out.println(c.getPoints());  // Runtime polymorphism 
		
		
		System.out.println(10);  // compile-time polymorphism 
		 
	}

}
