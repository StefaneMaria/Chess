package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		ChessMatch chessMath = new ChessMatch();
		
		while (true) {
			
			try {
				UI.clearScreen();
				UI.printMatch(chessMath);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(scan);
				
				boolean[][] possibleMoves = chessMath.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMath.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(scan);
				
				ChessPiece capturedPiece = chessMath.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			}
			
		}
		
	}

}
