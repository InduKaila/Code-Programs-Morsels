public class Point {

	public int x = 0;
	public int y = 0;

	// constructor
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p = new Point(2, 5);
		System.out.println(p.x);
		System.out.println(p.y);
	}
}
