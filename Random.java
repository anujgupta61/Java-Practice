public class Random {
	public static void main(String[] args) {
		String[] boys = {"Ajay" , "Aman" , "Anshul" , "Anuj" , "Anup" , "Ashank" , "Ashish" , "Girish" , "Himanshu" , "Jai"} ;
		String[] girls = {"Aastha" , "Akshita" , "Anshula" , "Arshdeep" , "Gunjan" , "Harman" , "Meenu" , "Mehak" , "Charu" , "Jannat"} ;
		int lenb = boys.length ;
		int leng = girls.length ;
		//System.out.println(lenb + "" + leng) ;
		int randb = (int) (Math.random() * lenb) ;
		int randg = (int) (Math.random() * leng) ;
		//System.out.println(randb + "" + randg) ;
		String phrase = boys[randb] + " <--> " + girls[randg] ;
  		System.out.println(phrase) ;
  	} 	
}