package gof.CreationalDesign.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SingletonPatternDemo {
	public static void main(String[] args) throws IOException {
			
		FileOutputStream out = SingletonPattern.getFileRead() ;
		  String s="Welcome to javaTpoint.";    
          byte b[]=s.getBytes();    
          out.write(b);    
          out.close();
          
		FileInputStream in = SingletonPattern.getFileWrite() ;
		  int i=0;    
          while((i=in.read())!=-1){    
           System.out.print((char)i);    
          }    
          in.close(); 
		
		
	}

}
