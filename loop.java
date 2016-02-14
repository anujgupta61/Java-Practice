public class loop {
	public static void main(String[] args) {
		int x = 1 ;
		System.out.println("Before the loop") ;
		while(x < 4) {
			System.out.println("Inside the loop");
			System.out.println(x) ;
			x ++ ;
		}
		System.out.println("After the loop") ;
	}
}