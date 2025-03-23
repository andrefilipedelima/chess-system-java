package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for (int line = 0; line < pieces.length; line++) {
			System.out.print((8 - line) + " ");
			for (int column = 0; column < pieces.length; column++) {
				printPiece(pieces[line][column]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
