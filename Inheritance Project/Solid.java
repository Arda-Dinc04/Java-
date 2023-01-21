public class Solid
{
    private String color;  //Don't change this to protected
    
    public Solid(String newColor)
    {
        color = newColor;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String newColor)
    {
        color = newColor;
    }
    
    public double getVolume()
    {
        /*
         * Note:  Once upon a time, the AP curriculum included the concept
         * of abstract.  Taking that concept out does make this course (and
         * especially this chapter) much easier.  However, this method
         * screams out to be abstract instead of this bogus implementation.
         * If you want to do comp sci beyond this course, you might take
         * a look at the concept of abstract.
         * 
         * The only reason I have this bogus implementation here is so that 
         * one of the exercises would actually work.
         */
        System.out.println("This method should be overridden in child classes.");
        
        return -1;
    }
}
