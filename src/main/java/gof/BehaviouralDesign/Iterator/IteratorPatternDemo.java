package gof.BehaviouralDesign.Iterator;

public class IteratorPatternDemo {
	 public static void main(String[] args) {
	      SubjectsRepository namesRepository = new SubjectsRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}
