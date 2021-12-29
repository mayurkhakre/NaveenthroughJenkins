package practice;

import java.util.Arrays;

// https://mdbootstrap.com/docs/b4/jquery/tables/pagination/



public class PaginationWithWebTable {
public static void main(String[] args) {
	 Object[] org = new Object[] {1, 2 ,3};
     
    /* System.out.println("Original Array : \n");
     for (int i = 0; i < org.length; i++)
          System.out.print(org[i] + " ");  
       */
      // copying array org to copy 
      // Here, new array has 5 elements - two
      // elements more than the original array
     Object[] copy = new Object[] {1, 3 ,2};
   
     /* System.out.print("\nNew array copy (of higher length):\n");
      for (int i = 0; i < copy.length; i++) 
          System.out.print(copy[i] + " ");
      */
     
      
      System.out.println(Arrays.deepEquals(org,copy));
   }


}
