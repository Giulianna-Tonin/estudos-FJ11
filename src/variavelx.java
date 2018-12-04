
public class variavelx {

	public static void main(String[] args) {

		int x = 13;
		
		while (x<=100) {
		
		if (x % 2 == 0) {
			x = x/2;
		}
		
		if (x % 2 != 0) {
			x = 3*(x+1);
		}
		
		System.out.println(x);
		x++;
		
		}
		
		
	}
	
}
