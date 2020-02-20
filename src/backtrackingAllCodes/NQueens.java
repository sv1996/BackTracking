package backtrackingAllCodes;

public class NQueens {
	
	public static void placeNQueens(int n){
		int board[][]=new int [n][n];
		placeQueens(0,n);
}
	private static void placeQueens(int n , int row) {
		 if(row==n){
			 // valid board configuration
			 
		 }
	// check for collumns
		 // check if it is safe to place Queen
	// if it is safe-> then place the queen and move to next row
		 
		 for(int i=0;i<n;i++){
			 if(isSafe(board,i,,col))
		 }
		 
		 
	}



	public static void main(String[] args) {
		 int n=4;
		 placeNQueens(n);

	}

}
