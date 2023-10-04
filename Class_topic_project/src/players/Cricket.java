package players;

public class Cricket extends playstats {
	private int run;
	private int wicket;
	
	public Cricket(String name, int age, int win , int loss, int run , int wicket) {
		super(name,age,win,loss);
		this.run = run;
		this.wicket = wicket;
	}
	public void to_print() {
		System.out.println("Cricket Stats: \nPlayer Name: "+ getName()+ "\nPlayer Age: " + getAge() + "\nWin: " + getWin() + "\nloss: " + getLoss() + "\nTotal Run: " + run + "\nTotal Wicket: " + wicket);
	}
	
}
