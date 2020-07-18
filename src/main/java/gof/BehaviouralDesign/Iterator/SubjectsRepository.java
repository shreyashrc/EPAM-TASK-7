package gof.BehaviouralDesign.Iterator;

public class SubjectsRepository implements Container{
	public String subjects[] = {"English" , "Maths" ,"Science" , "History"};

	   
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      
	      public boolean hasNext() {
	      
	         if(index < subjects.length){
	            return true;
	         }
	         return false;
	      }


	      public Object next() {
	      
	         if(this.hasNext()){
	            return subjects[index++];
	         }
	         return null;
	      }		
	   }
}
