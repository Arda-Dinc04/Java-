
public class ComputeTemp
{
    private double[][] temps;
    
    
    public double computeTemp(int row, int col)
    {
       if((row==0)|| (row==(temps.length-1)) || (col==0) || (col==(temps[row].length-1)))
           return temps[row][col];
       else
           return (temps[row][col-1]+temps[row][col+1]+temps[row-1][col]+temps[row+1][col])/4;
           
    }
    
    public boolean updateAllTemps(double tolerance){
        boolean result = true;
        double updValue;
        double copyTemps[][] = new double[temps.length][temps[0].length];
        for(int r = 0; r<temps.length; r++){
            for(int c = 0; c<temps[0].length; c++){
                updValue = computeTemp(r,c);
            if(Math.abs(updValue-temps[r][c])>tolerance)
                result = false;
            copyTemps[r][c] = updValue;
            }
        }
        for(int r = 0; r<temps.length;r++){
            for(int c = 0; c<temps[0].length; c++)
                temps[r][c] = copyTemps[r][c];
            }
        return result;
    }
}
