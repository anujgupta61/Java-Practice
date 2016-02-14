public class BearSong {
	public static void main(String[] args) {
		int count = 99 ;
		String word = "Bottles" ;
		while(count > 0) {
			System.out.println("Remaining " + word + " : " + count) ;
			count -- ;
			if(count == 1)
				word = "Bottle" ;
			if(count == 1) {
				System.out.println("Remaining " + word + " : " + count) ;
			} else {
				System.out.println("Remaining " + word + " : " + count) ;
			}
		}
	}
}