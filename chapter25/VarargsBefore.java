package chapter25;

public class VarargsBefore {
	public static void showAll(String[] vargs) {
		System.out.println("LEN: "+vargs.length);
		
		for (String s : vargs) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		showAll(new String[] {"남도현"});
		showAll(new String[] {"남도현", "구정모"});
		showAll(new String[] {"남도현", "구정모", "강민희"});
	}
}
