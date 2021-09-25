package learn_Maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Learn_hashCode_equals1 {


	public static void main(String[] args) {
		Pen1 p1=new Pen1(10,"blue");
		Pen1 p2=new Pen1(10,"blue");
		System.out.println(p1+" "+p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		Set<Pen1> s=new HashSet<Pen1>();
		s.add(p1);
		s.add(p2);
		System.out.println(s);
		Iterator i=s.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

 class Pen1{
	int price;
	String color;
	public Pen1(int price,String color){
		this.price=price;
		this.color=color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen1 other = (Pen1) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}