public class Payroll 
{ 
    public static final double HOURLY_RATE = 9.46; 
 
    private String employeeName; 
    private double hoursWorked; 
     
    public Payroll() 
    { 
        employeeName = ""; 
        hoursWorked = 0.0; 
    } 
 
    public void currentWage() 
    { 
        System.out.println("The current wage is " + HOURLY_RATE); 
    } 
     
    public void addHours(int hours) 
    { 
        hoursWorked += hours; 
    } 
 
    public double paycheck() 
    { 
        return hoursWorked * HOURLY_RATE; 
    } 
} 

