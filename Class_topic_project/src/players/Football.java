package players;

public class Football extends playstats {
	private int goal;
	private int pass;
	
	public Football(String name, int age, int win , int loss, int goal , int pass) {
		super(name,age,win,loss);
		this.goal = goal;
		this.pass = pass;
	}
	public void to_print() {
		System.out.println("Football Stats: \nPlayer Name: "+ getName()+ "\nPlayer Age: " + getAge() + "\nWin: " + getWin() + "\nloss: " + getLoss() + "\nTotal Goal: " + goal + "\nTotal Pass: " + pass);
	}
}
