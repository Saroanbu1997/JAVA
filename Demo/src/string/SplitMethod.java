package string;

public class SplitMethod {

	
	
	public static void main(String[] args) {
		String s= "java,Selenium,testng,maven,jenkins";
		String[] str = s.split(",");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		for(String st:str) {
			System.out.println("values"+st);
		}
		
		String str1="abc";
		String str2="def";
		String str3="fdf";
		String str4=str1+str2+str3;
		String str5=str1.concat(str3).concat(str2);
		System.out.println(str4+"   "+str5);
		
		StringBuffer st = new StringBuffer(str1);
		System.out.println(st.append(str2).append(str3));
		
	}

}
