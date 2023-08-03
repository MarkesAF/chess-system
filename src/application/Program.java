package application;

import chess.ChessMatch;

import java.util.Locale;
import java.util.Scanner;


import chess.ChessPiece;
import chess.ChessMatch;

public class Program {
    public static void main(String[]args){
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
