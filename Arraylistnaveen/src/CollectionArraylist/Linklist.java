package CollectionArraylist;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	LinkedList<String> l=new LinkedList<String>();
	l.add("Tom");
	l.add("Sara");
	l.add("Sam");
	l.add("Susan");
	
	System.out.println(l);
	
		/*
		 * //add first
		 * 
		 * l.addFirst("Naveen"); //add last
		 * 
		 * l.addLast("Jocelin"); System.out.println(l); //Using for loop
		 * 
		 * for(int i =0;i<=l.size();i++) System.out.println(l.get(i));
		 */
	//set
	
l.set(0,"Lisa");
System.out.println(l.get(0));
System.out.println(l);

l.removeLast();
System.out.println(l);
l.remove(0);
System.out.println(l);
l.add("Mara");
l.add("tam");
l.add("musan");
l.removeLast();
System.out.println(l);

		/*
		 * //Using for loop System.out.println("****** for loop");
		 * 
		 * for(int n =0;n<=l.size();n++) { System.out.println(l.get(n)); }
		 */

//Advanced for loop
System.out.println("******Advanced for loop");
for (String str:l) {
	
	System.out.println(str);
	
}
System.out.println("****** using iterator");
//using iterator
java.util.Iterator<String> t=l.iterator();
while(t.hasNext()) {
	
	System.out.println(t.next());
	
	
}


	}

}
