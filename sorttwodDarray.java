import java.util.Arrays;

public class sorttwodDarray {

	public static void main(String[] args) {
		
		int[][] matrix = {
	            {2, -1, 3},
	            {5, 4, 6},
	            {8, 7, 9}
	        };

	for (int k = 0; k <matrix. length; k++) {
	        for (int i= 0; i < matrix[k].length; i++) {
	            for (int j = 0; j < matrix[k].length; j++) {
	                if (matrix[k][i] < matrix[k][j]) {
	                    int temp = matrix[k][i];
	                    matrix[k][i] = matrix[k][j];
	                    matrix[k][j] = temp;

	                }
	            }
	        }
	    }
	

	System.out.print(Arrays.deepToString(matrix));
	System.out.println();
	int [][ ] value=matrix;
	
	
	for (int i = 0; i < value.length; i++) 
	{
		for (int j = 0; j < value.length; j++) 
		{
              System.out.print(value[i][j]+" ");
	}
		
	}}

}
