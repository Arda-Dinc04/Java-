public class Duck { 
    
    public static final double VAL = 2.0;
    
    private int size; 
    
    // constructor of the class Duck
    public Duck(int newSize) { 
        size = newSize;
    }
    
     // mutator method  changes the variable size
    public void setSize(int newSize) {
        size = newSize; 
    } 
    
    // accessor method return variable size
    public   int getSize() {
      
        return size; 
    } 
 
    // a static function used as a print it is not mutator not accessor
    public static void displayName(){
        System.out.println("Duck class");
 
    }
    
    public String toString(){
    return "Ducks size is " + size + " static value =" +VAL;
    }

    public static void main(String[] args) {
        
        double d;
        // you must define an object like obj1 to access its member through getSize()
        Duck obj1 = new Duck(2);
        
        System.out.println(" obj1.getSize() =   " + obj1.getSize() );
      //  System.out.println("The size of the duck is " + getSize(2) );  //  ILLEGAL 
       
       System.out.println(" obj1.size= " + obj1.size );
       
      Duck.displayName();    // LEGAL 
       obj1.displayName();    //  LEGAL 
       
       d = Duck.VAL  ;
       
        System.out.println("Duck.VAL = "  + d);
        
       d = obj1.VAL ; 
       System.out.println("obj1.VAL = "  + d);
       
       
       System.out.println(obj1);
        
 
    }
    
}