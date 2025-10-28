package h2;

public class H2_main {
	public static void main(String[] args) {

		int i=8, j=10, k=67, min=0, max=0; 

		
		if (i < j & i < k) {
            min = i;
        } else if (j < i & j < k) {
            min = j;
        } else {
            min = k;
        }

		
        if (i > j &  i > k) {
            max = i;
        } else if (j > i & j > k) {
            max = j;
        } else {
            max = k;
        }

		
		
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
	
	


