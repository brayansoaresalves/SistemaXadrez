package boardgame;

public class Piece { // pe�a
	
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}
// e de uso interno para boardgame
	protected Board getBoard() {
		return board;
	}

}
