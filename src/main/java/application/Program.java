package application;


import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.ChessException;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

            while (true) {
                try {
                    //UI.clearScreen();
                    UI.printMatch(chessMatch);
                    System.out.println();
                    System.out.print("Source: ");
                    ChessPosition source = UI.readChessPosition(sc);

                    System.out.println();
                    System.out.print("Target: ");
                    ChessPosition target = UI.readChessPosition(sc);

                    ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                }
                catch (ChessException | InputMismatchException e){
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
        }

    }

    }