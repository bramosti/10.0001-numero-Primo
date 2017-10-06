
public class NumerosPrimo {
	

	static boolean Primo(long n) {
	    if (n < 2) return false;
	    if (n == 2) return true;
	    if (n % 2 == 0) return false;
	    if (n < 9) return true;
	    if (n % 3 == 0) return false;
	    long max = (long)(Math.sqrt(n + 0.0)) + 1;
	    for (int i = 5; i <= max; i += 6) {
	        if (n % i == 0) return false;
	        if (n % (i + 2) == 0) return false;
	    }
	    return true;
	}
	    public static void main(String[] args) {
	        int x = 0;
	        int primo = 0;
	        while (primo <= 10001) {
	           if (Primo(x) == true) {
	                primo++;
	                if (primo == 10001) {
	                    System.out.println(x);
	                }
	            }
	            x++;
	        }
	    }
	
}
