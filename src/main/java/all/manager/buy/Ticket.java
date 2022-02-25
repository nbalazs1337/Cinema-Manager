package all.manager.buy;

import java.util.Scanner;

public class Ticket {
    private int income;
    private static int ticketPrice;
    private static int howMany=0;
    static Scanner scanner = new Scanner(System.in);

    public Ticket() {
        howMany++;
    }

    public static int getTicketPrice() {

        return ticketPrice;
    }

    public int getIncome() {
        return income;
    }

    public static int getHowMany() {
        return howMany;
    }

    public static void  buyATicket(String[][] cinema, int rows, int seats) {
        Ticket ticket = new Ticket();
        System.out.println("Enter a row number where you would like to sit:\nRemember!\nFirst half - $8\nSecond half - $10");
        int selectedRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int selectedSeat = scanner.nextInt();

        if (selectedRow <= rows / 2) {
            ticketPrice = 8;

        } else {
           ticketPrice = 10;

        }
        try {
            if (cinema[selectedRow][selectedSeat] != "S") {

                cinema[selectedRow][selectedSeat] = "S";

                System.out.println();
                System.out.printf("Wise choice!Your ticket price is going to be: $%d%n", ticketPrice);
                System.out.println("To check your reserved seat, please choose 'Available seats' within our Menu.Thanks!");
                System.out.println();
            } else {
                throw new Exception("That ticket has already been purchased!");
                //System.out.println("");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            if (Ticket.getHowMany() <= 36) {

            } else {
                throw new Exception("Our cinema is full, please come back tomorrow night!");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println();
    }
}
