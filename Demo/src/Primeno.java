
public class Primeno {

	public static void main(String[] args) {


        int num = 13;
        int count =0;
        boolean isPrime = true;
		/*
		 * int div=13/2; int mod = 13%2; System.out.println("div/"+div+"mod%"+mod);
		 */
      
        if(num>1) {
        	for (int i=1; i <= num; i++)
        
        {
            if ( num % i == 0)
            {
                count++;
            }
        }
 
        if ( count == 2 )
            System.out.println(num + "is a prime number");
        else
            System.out.println(num + "is not a prime number");
    }else {
    	System.out.println("not a plaindrome num");
    }
	}

}
