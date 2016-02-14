import java.awt.* ;
import java.awt.event.* ;

public class party {
	public static void buildInvite() {
		Frame f = new Frame() ;
		Label l = new Label("Party at Tim's") ;
		Button b = new Button("You bet") ;
		Button c = new Button("Shooot me") ;
		Panel p = new Panel() ;
		p.add(l) ;
	}
	public static void main(String[] args) {
		buildInvite() ;
	}
}