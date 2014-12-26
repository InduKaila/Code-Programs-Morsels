public class Rectangle {
	private int x, y;
	private int width, height;

	public Rectangle() {
		this(0, 0, 1, 1);
	}

	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	private static void swap(int a, int b) {
		// a = 4, b = 7;
		// pass by value this is called
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}

	private static Point swap2(int a, int b) {
		return new Point(b, a);
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		swap(a, b);
		// System.out.println(a);
		// System.out.println(b);
		// Point p = swap2(a, b);
		// System.out.println(p.x);
		// System.out.println(p.y);
	}
}