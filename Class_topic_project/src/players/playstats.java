package players;

public class playstats {
	private String name;
	private int age;
	private int win;
	private int loss;
	
	public playstats(String name, int age, int win, int loss) {
		this.name = name;
		this.age = age;
		this.win = win;
		this.loss = loss;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getWin() {
		return win;
	}

	public int getLoss() {
		return loss;
	}
}

