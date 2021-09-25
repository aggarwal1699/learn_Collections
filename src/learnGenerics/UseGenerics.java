package learnGenerics;

public class UseGenerics {

	public static void main(String[] args) {

		Pair<String, Integer> p1=new Pair("Alex",1);
		Pair<Double, Integer> p2=new Pair(1.5,1);
		p1.getDescription();
		p2.getDescription();
		
	}

}
