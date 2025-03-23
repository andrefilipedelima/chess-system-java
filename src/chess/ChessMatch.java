package chess;

import boardgame.Board;

public class ChessMatch {
	
	
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int line = 0; line < board.getRows(); line++) {
			for (int column = 0; column < board.getColumns(); column++) {
				mat[line][column] = (ChessPiece) board.piece(line, column);
			}
		}
		return mat;
	}

}
