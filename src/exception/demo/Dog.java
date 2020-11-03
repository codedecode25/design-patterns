package exception.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class Dog implements Comparable {
	
	private String name;
	
		
		
		public static void main(String[] args) {
			Dog d1 = new Dog();
			Dog d2 = new Dog();
			d1.name = "Coffe";
			d1.name = "tea";
			
			TreeSet set = new TreeSet();
			set.add(d1);set.add(d2);
			
			Iterator iterator = set.iterator();
			while (iterator.hasNext())
			    System.out.print(iterator.next());
			
		}

		@Override
		public int compareTo(Object o) {
			return 0;
		}
		
		

}
