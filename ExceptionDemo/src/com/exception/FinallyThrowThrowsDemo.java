package com.exception;

// throw => used to manually throw an exception by the code
// throws => used to inform the user of the method about the exception a method threw
public class FinallyThrowThrowsDemo {

	public static void openfile(boolean isEmpty)
	{
		for(int i=1;i<=3;i++) {
			try {
				System.out.println("opening a file "+i);// code to open a file and do some processing
				if(i==2 && isEmpty) 
					throw new Exception("File emtpy cannot process");
				System.out.println("process the contets of the file");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("Closing the file");// that make sure the file is closed
			}
			System.out.println();
		}
		System.out.println("opening file method done, exiting...");
	}
	public static void calculate(int no) throws Exception
	{
		// checked excpetion
		if(no < 0)
		{
			throw new Exception("Number cannot be 0 or negative");
		}
		System.out.println("Sqrt "+Math.sqrt(no));
	}
	public static void main(String[] args) {
//		openfile(false);
//		System.out.println();
		openfile(true);
		
		try {
			calculate(30);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			calculate(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			calculate(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
