package com.luni.recursion.backtracking;

public final class NQueens{
	private final int numberOfQueens;
	private final int [][]chessBoard;
	
	public NQueens(int numberOfQueens){
		this.numberOfQueens = numberOfQueens;
		this.chessBoard = new int[numberOfQueens][numberOfQueens];
	}

	public void solve(){
		if(solveRec(0)){
			printQueens();
		}else{
			System.out.println("No solution found.");
		}
	}

	private boolean solveRec(int column){
		if(column == numberOfQueens) return true;

		for(int i=0; i < chessBoard.length; i++){
			if(isSafe(i, column)){
				chessBoard[i][column] = 1;

				// Try to solve for next Queen once this one is solved
				if(solveRec(column + 1)){
					return true;
				}
				// Backtrack if next move can't be solved
				chessBoard[i][column] = 0;
			}
		}
		return false;
	}

	private boolean isSafe(int row, int column){
		// Check for any Queen's in same row
		for(int i = 0; i < column; i++){
			if(chessBoard[row][i] == 1){
				return false;
			}
		}

		// We konw there are only Queens on left side. So we will
		// ignore right side.
		// Check top left diagonal
		for(int i = row, j = column; i >= 0 && j >= 0; i--, j--){
			if(chessBoard[i][j] == 1){
				return false;
			}
		}

		// Check bottom left diagnonal
		for(int i=row, j=column; i < chessBoard.length && j >= 0; i++, j--){
			if(chessBoard[i][j] == 1){
				return false;
			}
		}

		// If no other Queen found horizontally or diagonally return true
		return true;
	}

	public void printQueens(){
		for(int i = 0; i<chessBoard.length; i++){
			for(int j=0; j<chessBoard.length; j++){
				if(chessBoard[i][j] == 1){
					System.out.print(" * ");					
				}else{
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}
}