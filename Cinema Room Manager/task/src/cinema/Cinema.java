package cinema;

import java.util.Scanner;

public class Cinema {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        startCinema();

        /*
        int totalSeats = numberRow * numberEachRow;
        int priceTicket = 10;
        int totalIncome = 0;

        if (totalSeats > 60) {
            for (int i = 1; i <= numberRow; i++) {
                priceTicket = i <= numberRow / 2 ? 10 : 8;
                for (int j = 1; j <= numberEachRow; j++) {
                    totalIncome += priceTicket;
                }
            }
        } else {
            totalIncome = priceTicket * totalSeats;
        }

        System.out.printf("Total income:\n$%d", totalIncome);

        printPanel(x);
*/
    }

    private static void startCinema() {
        System.out.println("Enter the number of rows:");
        int numberRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of seats in each row:");
        int numberEachRow = Integer.parseInt(scanner.nextLine());
        char x[][] = new char[numberRow][numberEachRow];

        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberEachRow; j++) {
                x[i][j] = 'S';
            }
        }

        printPanel(x);
        buyTicket(x);
    }

    private static void printPanel(char[][] x) {
        System.out.println("\nCinema:");

        for (int j = -1; j < x[0].length; j++) {
            System.out.print(j == -1 ? " " : " " + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < x.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(" " + x[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void buyTicket(char[][] x) {
        System.out.println("Enter a row number:");
        int seatRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a seat number in that row:");
        int seatInRow = Integer.parseInt(scanner.nextLine());

        int priceTicket = 10;

        if (x.length * x[0].length > 60) {
            boolean isInFront = seatRow <= x.length / 2;

            if (!isInFront) {
                priceTicket = 8;
            }
        }

        x[seatRow - 1][seatInRow - 1] = 'B';

        System.out.printf("\nTicket price: $%d", priceTicket);
        printPanel(x);
    }
}