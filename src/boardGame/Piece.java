package boardGame;

public class Piece {
	
	private Board board;
	
	protected Position position;
	
//	a posicao nao vai ser passada no momento da criacao da peca
	public Piece(Board board) {
		this.board = board;
	}

//	o tabuleiro nao pode ser alterado e so a camada de tabuleiro tera acesso a ele
	protected Board getBoard() {
		return board;
	}
	
	public boolean[][] possibleMoves(){
		
		
		return null;
	}
	
	public boolean possibleMove(Position position) {
		
		
		return true;
	}
	
	public boolean isThereAnyPossibleMove() {
		
		
		
		return true;
	}
	
	

}
