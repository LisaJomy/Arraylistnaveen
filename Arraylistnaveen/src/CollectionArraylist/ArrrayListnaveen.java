package CollectionArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrrayListnaveen {

	public static <E>void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-----Static array		
		
int a[]= {20,30,40,50}; 


//-----Dynamic array
//can contain duplicate values
//not Synchronized
//allows random access to fetch the element at any index


ArrayList ar= new ArrayList();//non  generic
ar.add(10);
ar.add("Tom");
ar.add('A');
ar.add(true);
System.out.println(ar.get(2));

System.out.println(ar.size());

ar.add(40);
ar.add("rosy");
ar.add(40);
System.out.println(ar.size());
//to print all the values of the array we should use 
//for loop or Iterator
System.out.println("*********************");
for(int i=0;i<=ar.size();i++) {
	System.out.println(ar.get(i));
}

// generic ArrayList

ArrayList<Integer> ar1= new ArrayList<Integer>();

ar1.add(100);
ar1.add(400);


ArrayList<E> ar8=new ArrayList<E>();


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

	}

	private static void iterator() {
		// TODO Auto-generated method stub
		
	}

}
