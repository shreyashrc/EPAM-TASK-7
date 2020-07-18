package gof.BehaviouralDesign.TemplatePattern;

public class TemplatePatternDemo {

	  public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Basketball();
	      game.play();		
	   }
}
