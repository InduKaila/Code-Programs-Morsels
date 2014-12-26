public class Money {
	public int pounds = 100;
	public int pence = 20;
	public int a = 50;
	public int b = 900;

	public Money() {
		this(150, 50);

	}

	public Money(int pounds, int pence) {
		this.pounds = pounds;
		this.pence = pence;
	}

	public Money(int a, int b, int pounds, int pence) {
		this.a = a;
		this.b = b;
		this.pounds = pounds;
		this.pence = pence;
	}

	public static void swap(int a, int b) {
		// a = 900, b = 50;
		int temp = a;
		a = b;
		b = temp;
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
		Money mon = new Money(3, 99);
		System.out.println(mon);
	}
}
