package CollectionArraylist;

public class Arraypractice {

	public static void main(String[] args) {
		int i[]= {10,20,30,40};
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
	System.out.println(i[0]+i[1]);
	//to print all the values in an array
	System.out.println("************for loop");
	for(int k=0;k<i.length;k++) {
	System.out.println(i[k]);
	}
	System.out.println("******string for loop");
	String h[]= {"varun","lisa","deepa","priya"};
	
	
	for(int m=0;m<h.length;m++) {
		System.out.println(h[m]);
		
	}
	String browsers[]= {"Safari","Opera","Internet Explorer","hjgjhgg"};
	for(int t=0;t<browsers.length;t++) {
		System.out.println(browsers[t]);
	if(browsers[t].equals("Safari")) {
		System.out.println("launch Safari Browser");
				}
	else if (browsers[t].equals("Opera")) {
					System.out.println("launch Opera Browser");
				} 
	else if (browsers[t].equals("Internet Explorer")) {
					System.out.println("launch Internet Explorer Browser");
				}
	else if (browsers[t].equals("Google chrome")) {
					System.out.println("launch Google chrome");
				} 
	else
	{
					System.out.println("please enter the valid browser");
		
		}
	}
	//object array
	System.out.println("*****object array");	
		Object emp[]= {"Tom",22.33,14,true,'a'};
		
		for(int b=0;b<emp.length;b++) {
			System.out.println(emp[b]);

			}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
