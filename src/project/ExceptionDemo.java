package project;

public class ExceptionDemo {

	public static void main(String[] args) {
		String aaa=null;
		try {
			if(aaa.equals(aaa))
				System.out.println("is right");
			else 
				System.out.println("is not right");
				
			
			//int array[]= {1,2,3,4};
			//System.out.println(array[10]);
			//int information=50/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("its a java code");
		}

	}

}
