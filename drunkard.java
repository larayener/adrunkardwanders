import java.util.Random;

public class Drunkard {
	private int x;
	private int y;
	private int a;
	private int s;
	
	public Drunkard() {
		x = 0;
		y = 0;
	}
	
	public Drunkard(int a, int s) {
		this.x = a;
		this.y = s;
		this.a = a;
		this.s = s;
	}
	
	public void step() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(4) + 1;
		if (randomInt == 1) {
			y++;
		}
		if (randomInt == 2) {
			x++;
		}
		if (randomInt == 3) {
			y--;
		}
		if (randomInt == 4) {
			x--;
		}
	}
	
	public void fastForward (int steps) {
		for (int i = 0; i < steps; i++) {
			this.step();
		}
	}
	
	public String getLocation() {
		return "You are at avenue " + x + " and street " + y;
	}
	
	public int howFar() {
		int sum = Math.abs(x - a) + Math.abs(y - s);
		return sum;
	}
	
}
