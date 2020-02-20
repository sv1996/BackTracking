package backtrackingAllCodes;

public class RatInMazePrintPath {
	
	public static boolean ratInMaze(int [][] maze){
		int n=maze.length;
		int path[][]=new int[n][n];
   return solveMaze(maze, 0,0, path);
			}
	
	public static boolean solveMaze(int maze[][],int i,int j, int path[][]){
		// check if i,j cell is valid or not
		int n=maze.length;
		if( i <0 || i >=n  || j<0 || j >=n  || maze[i][j]==0 || path [i][j]==1){
			return false;
			}
	// include the cell in current path
		path[i][j]=1;
		// Destination cell  reached and print the path
		if(i==n-1 && j==n-1){
			for(int row=0;row<n;row++){
				for(int col=0;col<n;col++){
					System.out.print(path[row][col]+" ");
					}
			 
			}
			return true;
		}
		// explore further in all direction
		// top
		if(solveMaze(maze ,i-1,j,path)){
			return true;
		}
		// right
		if(solveMaze(maze ,i,j+1,path)){
		return true;
	}
		// Down
		if(solveMaze(maze ,i+1,j,path)){
			return true;
		}
		// Left
				if(solveMaze(maze ,i,j-1,path)){
					return true;
				}
			return false; 
	}
	
public static void main(String[] args) {
		int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
		boolean pathPossible=ratInMaze(maze);
		System.out.println(pathPossible);
			

	}

}
