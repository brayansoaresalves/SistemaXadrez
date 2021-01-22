package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{ // pe�a de xadrez
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
