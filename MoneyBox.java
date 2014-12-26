public class MoneyBox {
	public int pounds = 100;
	/* public int pence = 20; */
	public int a = 50;
	public int b = 900;
	public int pence = 20;

	public MoneyBox() {
		this(150, 50);

	}

	public MoneyBox(int pounds, int pence) {
		this.pounds = pounds;
		this.pence = pence;
	}

	public MoneyBox(int a, int b, int pounds, int pence) {
		this.a = a;
		this.b = b;
		this.pounds = pounds;
		this.pence = pence;
	}

	public static void swap(int a, int b) {
		// a = 900, b = 50;
		// NO access to class (member) fields so do not have this.
		int temp = a;
		a = b;
		b = temp;
	}

	/*
	 * int x = (expression goes here); System.out.println("x is " + x);
	 * 
	 * And then put in all the expressions you can think of!
	 * 
	 * You may also like:
	 * 
	 * float y = (some other bit of maths); System.out.println("y is " + y);
	 */

	public void deposit(int depositedPounds, int depositedPence) {
		pounds = pounds + depositedPounds; // £5 = £5 + 3
		pence = pence + depositedPence; // 60p = 60p +50p = 110p
		int poundsOver = pence / 100; // = 110p / 100 = £1
		pounds = poundsOver + pounds; // = £1 + £8
		pence = pence % 100; // = 110p % 100 = 10p
	}

	public void withdrawn(int withdrawnPounds, int withdrawnPence) {
		pounds = pounds - withdrawnPounds;
		pence = pence - withdrawnPence;
		int poundsOver = pence / 100;
		pounds = poundsOver + pounds;
		pence = pence % 100;
	}

	@Override
	public String toString() {

		String str = "£" + pounds + "." + pence + " pence";
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MoneyBox mon = new MoneyBox(5, 60);
		mon.deposit(3, 50);
		// mon.withdrawn(1,0);

		// System.out.println("pounds is " + pence);
		System.out.println(mon);
	}
}
