package learn_Maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Learn_hashCode_equals {

	public static void main(String[] args) {
		Pen p1=new Pen(10,"blue");
		Pen p2=new Pen(10,"blue");
		System.out.println(p1+" "+p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		Set<Pen> s=new HashSet<Pen>();
		s.add(p1);
		s.add(p2);
		System.out.println(s);
		Iterator i=s.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

	
	}
class Pen{
	int price;
	String color;
	public Pen(int price,String color){
		this.price=price;
		this.color=color;
	}
	@Override
	public boolean equals(Object obj) {
		Pen that=(Pen) obj;
		boolean isEqual=this.price==that.price&&
				this.color.equals(that.color);
		return isEqual;
	}
	
	@Override
	public int hashCode() {
		return price+color.hashCode();
	}
}
