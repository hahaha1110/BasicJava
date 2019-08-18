package chapter25;

public class Varargs {
	public static void showAll(String...vargs) {
		System.out.println("LEN: "+vargs.length);
		
		for (String s : vargs) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		showAll("남도현");
		showAll("남도현", "구정모");
		showAll("남도현", "구정모", "강민희");
	}
}
