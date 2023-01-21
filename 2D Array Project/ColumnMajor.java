public class ColumnMajor
{
    public static void main(String[] args)
    {
        int[][] columnMajor = new int[4][7];
        int flag = 1;
        for(int col = 0; col < columnMajor[0].length; col++){
            for(int row = 0; col< columnMajor.length; row++){
            columnMajor[row][col] = flag;
            flag++;
            }
        }
        Helper.print2DArray(columnMajor);              
    } 
}