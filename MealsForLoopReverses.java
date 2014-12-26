public class MealsForLoopReverses {

	public static void main(String[] args) {
		String[] meals = new String[] { "pasta", "pizza", "fish and chips",
				"methappen", "peshwari gosht", "steak (raw)",
				"fried egg sandwich" };
		int stepBy = 1;
		for (int ct = 0; ct >= 0; ct += stepBy) {
			System.out.println(meals[ct]);
			if (ct == (meals.length - 1))
				stepBy = -1;
		}
	}
}
// ct=0, ct<=0
// pasta
// ct=0+=1, ct=1>=0
// pizza
// ct=1+1=2, ct=2 which is >=0
// fish and chips
// ct=2+1=3, ct=3 which is >=0
// methappen
// ct=3+1= 4, ct=4 which is >=0
// peshwari gosht
// ct=4+1=5, ct=5 which is >=0
// steak (raw)
// ct=5+1=6, ct=6 which is >=0
// fried egg sandwich
// if ct==6,
// stepBy =1-1 =-1
// ct=6 -1(stepBy)=5, ct>=0
// steak (raw)
// ct=5-1=4, ct>=0
// peshwari gosht
// ct=4-1=3, ct>=0
// methappen
// ct=3-1=2, ct>=0
// fish and chips
// ct=2-1=1, ct>=0
// pizza
// ct=1-1=0, ct>=0
// pasta
// ct=0-1=-1, ct=-1
// as ct is not >=0 the for loop ends

