
public class Stringrev {
	public static void main(String args[]) {
		
		String str= "saravanan";
		/*
		 * StringBuffer sr= new StringBuffer(str); System.out.println(sr.reverse());
		 */
		String rev="";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//			
//		}
//		System.out.println(rev);
		
		char a[]=str.toCharArray();
		int len=a.length;
		for (int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);

	}
}
