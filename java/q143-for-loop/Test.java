public class Test {


    public static void main(String[] args) {
        
        int[][]matrix = { {1,2}, {3, 4}};
        for(int i = matrix.length-1; i>=0 ; i--)
        {
            for(int j= matrix[i].length-1; j>=0; j--)
            {
                System.out.println(matrix[i][j]);
            }
        }

    }
}
