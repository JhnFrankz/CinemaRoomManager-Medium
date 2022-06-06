package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numberRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of seats in each row:");
        int numberEachRow = Integer.parseInt(scanner.nextLine());
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

        /*System.out.println("Cinema:");

        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i <= 7; i++) {
            System.out.print(i);
            for (int j = 1; j <= 8; j++) {
                System.out.print(" S");
            }
            System.out.println();
        }*/
    }
}