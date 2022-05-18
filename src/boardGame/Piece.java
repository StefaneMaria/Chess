package boardGame;

public abstract class Piece {
	
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
	
//	matriz boleana das possicoes possiveis da peca
	public abstract boolean[][] possibleMoves();
	
//	verifica se a peca pode mover para uma dada posicao
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
//	retorna se existe pelo menos um movimento possivel para a peca
	public boolean isThereAnyPossibleMove() {
		
		boolean[][] mat = possibleMoves();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j])
					return true;
			}
		}
		
		return false;
	}
}
