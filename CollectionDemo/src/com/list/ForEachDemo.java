package com.list;

interface Consumer1{
	public void accept(Integer no);
}

class List1{
	private Integer no[] = new Integer[5];
	private static int x;
	public void add(Integer n)
	{
		no[x] = n;
		x++;
	}
	public void forEach(Consumer1 consumer) {
		for(Integer n :no)
			consumer.accept(n);
	}
}
public class ForEachDemo {

	public static void main(String[] args) {
		List1 obj = new List1();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		// print square of numbers?
		obj.forEach(new Consumer1() {
			@Override
			public void accept(Integer no) {
				System.out.println("Data : "+no);
				System.out.println(no * no);
			}
		});
		System.out.println();
		obj.forEach((Integer no)-> {
				System.out.println("Data : "+no);
				System.out.println(no * no* no);
			}
		);
		
	}

}
