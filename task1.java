public class task1 {
	public static void main(String []s) {
		
		String s1 = ",xyz";
		String ns1= s1.replace(",xyz", "xyz");
		String s2=" ab ";
		String ns2 = s2.replace(" ab ", " ab ");
		String s3="priya,prit,";
		String ns3=s3.replace("priya,prit,", "priya,prit");
		
		
		System.out.println(s1);
		System.out.println("\n" +ns1);
		
		System.out.println("old value " + s2);
		System.out.println("\n" +ns2);
		
		System.out.println(s3);
		System.out.println("\n" +ns3);
	}
}