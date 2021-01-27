package chess.piece;


import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString () {
		return "B";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getRows()];
		
		Position p = new Position(0,0);
		
		//nw
		p.setValue(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() -1, p.getColumn() -1);
		}
		if (getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// ne
		p.setValue(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() -1, p.getColumn() + 1);
		}
		if (getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// se
		p.setValue(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() + 1, p.getColumn() + 1);
		}
		if (getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// sd
		p.setValue(position.getRow() + 1, position.getColumn() -1);
		while (getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() + 1, p.getColumn() -1);
		}
		if (getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

	
}
