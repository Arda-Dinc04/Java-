/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.*;
/**
 *
 * @author arda dinc 
 */
public class JavaApplication1 {

//  both functions input arguments can not be the same 
 
public static  boolean  checkIfPalandrome(int num ) {
       int first, second, third;
 
       boolean numFound;
   
     // find each digit 1st 2nd 3rd.
     numFound = false;   // if not found then return -1 so outside we can know if palandrome found or not
     if (num < 10 ){
          numFound = true ; 
     } else  if ( (num> 9) && (num < 100) ) {
        first     = num         % 10 ; 
        second = (num/10) % 10 ;    // move this to the single digit by dividing by 10 
        
         if (first == second) {    
             numFound = true ;         
         }
         
     } else if ( num >= 100) {     // check if 1st and 2nd digits are same 
             
         first     = num          % 10 ; 
        // second = (num/10)  % 10 ;    // move this to the single digit by dividing by 10 
         third    = (num/100) % 10 ; // third digid such as 343/100 =  3.4 in terms of in t = 3 then take the modulo 10 
         
         if (first == third) {
             numFound = true ;     
         } 
     }  
 
    return numFound;
}
 
 // just print result a method 
public static  void printResult (int number,int count ) {
    
          System.out.println("from 1 to " + number + " we found " + count + "  palandrome " );

}
 
//=======================================================  
public static void main(String[] args)

    {
   
       double total;
       String aName ;
 
       boolean temp;
       int count;

     //  double x = exercise(18); 
        String var; 
        
       

      
       
       count=0;
    
      // check if this is palandrome number 
    
      for (int num=1; num <    999 ; num++){
             temp =  checkIfPalandrome(num);
      
        if (temp == true) {
             System.out.println("num = " +  num);
             count = count + 1;
         } else {

            //  System.out.println("this number   " + num + " is not palandrome   count = "  + count );
       }  // end of for loop 
        
         
      }
      printResult(999, count);
      
   
    //=======================================================
}
}

