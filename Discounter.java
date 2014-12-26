public class Discounter {

	public static int purchase(int price, int payment, int discount) {
		int saving = price / discount;
		int discountPrice = price - saving;
		int change = payment - discountPrice;
		return change;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int change = purchase(450, 500, 10);
		System.out.println(change);
	}
}

/*
 * First step, plug in some numbers for the things you'll know up front. The
 * discount is fixed at 10% but let's say we have an item for £4.50 and
 * someone's paying with a five pound note (all values in pence):
 * 
 * price = 450 payment = 500
 * 
 * Second step. Work out how much is actually owed. We do this by knocking 10%
 * off the price:
 * 
 * saving = price / discount = 450 / 10 = 45 discountedPrice = price - saving =
 * 405
 * 
 * Third step. Work out how much change we have to give. We do this by taking
 * the discounted price away from the payment:
 * 
 * change = payment - discountedPrice = 500 - 405 = 95
 * 
 * And that's the value you return.
 */

