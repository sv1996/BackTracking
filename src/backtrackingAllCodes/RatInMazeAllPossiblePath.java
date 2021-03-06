
package backtrackingAllCodes;
 

public class RatInMazeAllPossiblePath { 
	
	public static void ratInMaze(int [][] maze){
		int n=maze.length;
		int path[][]=new int[n][n];
		printAllPaths(maze, 0,0, path);
			}
	
	
	
	
	public static void printAllPaths (int maze[][],int i,int j, int path[][]){
		// check if i,j cell is valid or not
		int n=maze.length;
		if( i <0 || i >=n  || j<0 || j >=n  || maze[i][j]==0 || path [i][j]==1){
			return ;
			}
	// include the cell in current path
		path[i][j]=1;
		// Destination cell  reached and print the path
		if(i==n-1 && j==n-1){
			for(int row=0;row<n;row++){
				for(int col=0;col<n;col++){
					System.out.print(path[row][col]+" ");
					}
				//System.out.println();
			}
			System.out.println();
			path[i][j]=0;
			return ;
		}
		// explore further in all direction
		// top
		printAllPaths(maze ,i-1,j,path);
	  // right
		printAllPaths(maze ,i,j+1,path);
		 // Down
		printAllPaths(maze ,i+1,j,path);
		 // Left
		printAllPaths(maze ,i,j-1,path);
		path[i][j]=0;
	}
	
	public static void main(String[] args) {
	
		
		
		int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
		 ratInMaze(maze);
		// System.out.println(pathPossible);
		
		
	}

}
