
public class Die {
	private int numDots = 0;
	public static void main(String[] args) {
		
		Die die = new Die();
		for (int i = 0; i < 9999; i++) {
		die.roll();
		System.out.println(die.getNumDots());
		die.roll();
		System.out.println(die.getNumDots());
		die.roll();
		System.out.println(die.getNumDots());
		}
	}
	
	public void roll() {
		numDots = (int)(6*Math.random())+1;
	}
	
	public int getNumDots() {
		return numDots;
	}
}
