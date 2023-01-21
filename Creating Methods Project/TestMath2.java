public class TestMath2
{
   public static void main (String [] args)
   {
       System.out.println("Testing nthRoot");
       System.out.println("****************");
       System.out.println("The following two lines should say 1.2884547612849064 and 0.4764862967873432.");
       System.out.println(Math2.nthRoot(17.1, 76.24));
       System.out.println(Math2.nthRoot(-5.03, 41.63));
       
       System.out.println("\nTesting cube");
       System.out.println("************");
       System.out.println("The following two lines should say 6859 (NOT 6859.0!!) and -25544.660620851002.");
       System.out.println(Math2.cube(19));
       System.out.println(Math2.cube(-29.451));
       
       System.out.println("\nTesting factorial");
       System.out.println("*****************");
       System.out.println("0! is " + Math2.factorial(0) + ".  (Should be 1)");
       System.out.println("9! is " + Math2.factorial(9) + ".  (Should be 362880)");
           
       System.out.println("\nTesting logXY");
       System.out.println("*************");
       System.out.println("The following two lines should say 3.256637023871826 and -252.6618179602761.");
       System.out.println(Math2.logXY(16.48,9187.3));
       System.out.println(Math2.logXY(0.983, 76.11));
       
       System.out.println("\nTesting distance");
       System.out.println("****************");
       System.out.println("The following two lines should say 39.501017708408476 and 58.141926352675995.");
       System.out.println(Math2.distance(5.12, 48, 9.1, 87.3));
       System.out.println(Math2.distance(-40.9, -0.8, 14.2, 17.76));
       
       System.out.println("\nTesting random integers");
       System.out.println("***********************");
       int low = 1000;
       int high = -1000;
       int num = 0;
       for (int i = 1; i <= 100000; i++)
       {
           num = Math2.random(-489, 765);
           if (num < low)
               low = num;
           if (num > high)
               high = num;
       }
       System.out.println("Unless you got REALLY unlucky, the low should be -489 and the high should be 765");
       System.out.println("High:  " + high);
       System.out.println("Low:  " + low);
            
       System.out.println("\nTesting random doubles");
       System.out.println("***********************");
       double lowDecimal = 1000;
       double highDecimal = -1000;
       double dec = 0.0;
       for (int i = 1; i <= 100000; i++)
       {
           dec = Math2.random(-315.0, 609.0);
           if (dec < lowDecimal)
               lowDecimal = dec;
           if (dec > highDecimal)
               highDecimal = dec;
       }
       System.out.println("The low should be close to -315 and the high should be close to 609");
       System.out.println("High:  " + highDecimal);
       System.out.println("Low:  " + lowDecimal);
   }
}
