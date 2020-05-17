package CollectionArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	


		Employee e1=new Employee("Lisa",45,"Sales");
		Employee e2=new Employee("Nisa",42,"Accounting");
		Employee e3=new Employee("Misa",47,"Finance");
		//ArraylList to store class objects
		ArrayList <Employee>  ar4=new ArrayList <Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);


		//We have to use iterator to get all the elements of the array list
		 Iterator <Employee> it= ar4.iterator();
		while(it.hasNext()){
			
		Employee emp	=it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);



	}
	System.out.println("************");	
		
	//addall	
		
		/*
		 * ArrayList<String> ar5 = new ArrayList<String>(); ar5.add("Phython");
		 * ar5.add("Cucumber"); ar5.add("JavaScript");
		 */
ArrayList<String> ar6 = new ArrayList<String>();
ar6.add("Phython");
ar6.add("Cucumber");
ar6.add("Selenium");
System.out.println(ar6);
		/*
		 * ar5.addAll(ar6);
		 * 
		 * for(int i=0; i<=ar5.size();i++){ System.out.println(ar5.get(i)); }
		 */



		/*
		 * ar5.removeAll(ar6); for(int i=0; i<=ar5.size();i++){
		 * System.out.println(ar5.get(i)); }
		 */


		/*
		 * ar5.retainAll(ar6); for(int i=0; i<=ar5.size();i++){
		 * System.out.println(ar5.get(i)); }
		 */



}

}

