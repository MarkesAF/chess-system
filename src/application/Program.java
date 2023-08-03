package application;

import chess.*;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import chess.ChessMatch;

public class Program {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(in);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(in);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch(ChessException e){
                System.out.println(e.getMessage());
                in.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                in.nextLine();
            }
        }
    }
}
