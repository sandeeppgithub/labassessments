import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex7 {
     void getSorted(Integer[] arr) {
    	 List<Integer> al=Arrays.asList(arr);
    	 Collections.reverse(al);
    	  System.out.println(al);
    	  Collections.sort(al);
    	 // Integer a=al;
    	  System.out.println(al);
    	//return 0;
     }
     public static void main(String[] args)
     {
    	 Integer[] arr= {10,50,40,60};
    	 Ex7 a= new Ex7();
    	 a.getSorted(arr);
    
    	 
     }
}
