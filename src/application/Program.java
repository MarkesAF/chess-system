package application;

import chess.ChessMatch;

import java.util.Locale;
import java.util.Scanner;

import chess.ChessPosition;
import chess.ChessPiece;
import chess.ChessMatch;

public class Program {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(in);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(in);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }
    }
}
