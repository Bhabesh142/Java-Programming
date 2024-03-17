public class task {
	public static void main(String []s) {
	
		String s1 = ",xyz";
		String s2 = " abc ";
		String s3 = "priya,prit,";
		
		if(s1.startsWith(",")) {
			s1= s1.substring(1);
		}
		if(s1.endsWith(",")) {
			s1=s1.substring(0,s1.length() - 1);
		}
		
		if(s2.startsWith(",")) {
			s2= s2.substring(1);
		}
		if(s2.endsWith(",")) {
			s2=s2.substring(0,s2.length() - 1);
		}
		
		if(s3.startsWith(",")) {
			s3= s3.substring(1);
		}
		if(s3.endsWith(",")) {
			s3=s3.substring(0,s3.length() - 1);
		}
		
		System.out.println("Result is " + s1);
		System.out.println("Result is " + s2);
		System.out.println("Result is " + s3);
	}
}