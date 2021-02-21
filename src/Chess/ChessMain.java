package Chess;


import java.util.Arrays;
import java.util.Scanner;

import static Chess.Bishop.COUNTBISHOP;
import static Chess.ChessBoard.cell;

import static Chess.King.COUNTKING;
import static Chess.Knight.COUNTKNIGHT;
import static Chess.Pawn.COUNTPAWN;
import static Chess.Queen.COUNTQUEEN;
import static Chess.Rook.COUNTROOK;


public class ChessMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        firstBlock:
        {
            System.out.println("Создать доску?");
            System.out.println("1 - да");
            System.out.println("2 - нет");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 : new ChessBoard();
                break;
                case 2 :
                    System.out.println("Вы не захотели создавать доску");
                    break firstBlock;
                default:
                    System.out.println("Ошибка");
            }

            Thread.sleep(2000);
            System.out.println("Выберите фигуру");

            System.out.println("1 - " + "Король");
            System.out.println("2 - " + "Королева");
            System.out.println("3 - " + "Слон");
            System.out.println("4 - " + "Конь");
            System.out.println("5 - " + "Ладья");
            System.out.println("6 - " + "Пешка");
            System.out.println("Введите координаты");

            for (int i = 0; i < cell.length; i++) {
                int input = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                switch (input) {
                    case 1:
                        if (COUNTKING >= 1) {
                            System.out.println("Больше одного короля нельзя");
                            break;
                        } else if (COUNTKING < 1) {
                            cell[i] = new King(x, y);
                            break;
                        }
                    case 2:
                        if (COUNTQUEEN >= 1) {
                            System.out.println("Больше одной королевы нельзя");
                            break;
                        } else if (COUNTQUEEN < 1) {
                            cell[i] = new Queen(x, y);
                            break;
                        }
                    case 3:
                        if (COUNTBISHOP >= 2) {
                            System.out.println("Больше двух слонов  нельзя");
                            break;
                        } else if (COUNTBISHOP < 2) {
                            cell[i] = new Bishop(x, y);
                            break;
                        }
                    case 4:
                        if (COUNTKNIGHT >= 2) {
                            System.out.println("Больше двух коней нельзя");
                            break;
                        } else if (COUNTKNIGHT < 2) {
                            cell[i] = new Knight(x, y);
                            break;
                        }
                    case 5:
                        if (COUNTROOK >= 2) {
                            System.out.println("Больше двух ладьи нельзя");
                            break;
                        } else if (COUNTROOK < 2) {
                            cell[i] = new Rook(x, y);
                            break;
                        }
                    case 6:
                        if (COUNTPAWN >= 8) {
                            System.out.println("Больше двух пешек нельзя");
                            break;
                        } else if (COUNTPAWN < 8) {
                            cell[i] = new Pawn(x, y);
                            break;
                        }


                }


            }
            System.out.println(Arrays.toString(cell));
        }
    }

}

























