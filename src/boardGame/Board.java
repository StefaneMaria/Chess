package boardGame;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	private Piece[][] pieces;

	private int columns;	
	private int rows;
	
	public Board(int columns, int rows) {
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		
		

	}
	
	public Piece removePiece(Position position) {
		
		
		
		return null;
	}
	
	public boolean positionExists(Position position) {
		
		
		return true;
	}
	
	public boolean thereIsAPiece(Position position) {
		
		
		return true;
	}
	
	
	

}
