package stack;

import java.util.ArrayList;
import java.util.Iterator;

public class BankMain {
	public static void main(String[] args) {
		ArrayList <Account>a=new ArrayList<>();
		a.add(new Account(123,"shweta",657448));
		a.add(new Account(124,"aishu",657448));
		
		
		
		Iterator itr=a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
