package com.loops;

public class BreakContinueDemo {

	public static void main(String[] args) {
		/*
		 * e1
		 * e2
		 * e3.... en
		 * 
		 * e1000
		 */
		
//		int sv = 100;
//		boolean isFound = false;
//		for(int i=1;i<=100;i++)
//		{
//			if(sv == i) {
//				System.out.println("found "+sv);
//				isFound= true;
//			}
//		}
//		if(!isFound)
//			System.out.println("not found");
		// break is used to stop the loop iteration to further continue
		int sv = 10, i;
		int c=0;
		for(i=1;i<=100;i++)
		{
			if(sv == i) {
				System.out.println("found "+sv);
				break;
				//isFound= true;
			}
		}
		if(sv > i)
			System.out.println("not found");
		
		//continue is used to skip processing for a particular iteration
		
		for(i=1;i<=10;i++)
		{
			if(i%3==0)
				continue;
			System.out.println(i+" "+i*i);
		}
		System.out.println();
		for(i=1;i<=10;i++)
		{
			if(i%3!=0)
				System.out.println(i+" "+i*i);
		}
		
	}

}
