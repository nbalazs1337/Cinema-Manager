package all.manager;


import all.manager.buy.Film;
import all.manager.buy.Food;
import all.manager.buy.Ticket;
import all.manager.room.Populate;
import all.manager.room.Seats;
import all.manager.statistics.Income;
import all.manager.statistics.Percentage;
import all.menus.MainMenu;
import all.menus.options.BuyOptions;
import all.menus.options.FilmOptions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Manager {

    private String[][] cinema = new String[7][7];

    public static void showMenu() {

        System.out.println(MainMenu.MENU.getText());

    }

    public static void showBuyOptions() {
        System.out.println("Buy Options \n" + BuyOptions.MENU.getText());
    }

    public static void showFilmOptions() {
        System.out.println("Film Options \n" + FilmOptions.MENU.getText());

    }


    public void readChoice() {

        FileHandler fileHandler = new FileHandler();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        Populate.initialPopulate(cinema);
        Seats seats = new Seats();
        Income income = new Income();
        Percentage percentage = new Percentage();
        Food food = new Food();
        Film film = new Film();

        while (true) {
            showMenu();
            System.out.println("Enter choice: ");

            try
            {
                choice = Integer.parseInt(scanner.nextLine());


            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a number!\n");
            }
            switch (choice) {
                case 1 -> {

                    System.out.println("Our available seats for tonight\nS - SOLD\nF - FREE");
                    seats.showTheSeats(cinema);

                }
                case 2 -> {
                    System.out.println("Want to reserve a seat?No problem!");
                    Ticket.buyATicket(cinema, 7, 7);
                    income.addIncome();


                }
                case 3 -> {
                    showBuyOptions();
                    food.chooseFood();


                }
                case 4 -> {
                    showFilmOptions();
                    film.chooseFilm();

                }

                case 5 -> {
                    System.out.println("Current income: $" + Income.getIncome());
                    fileHandler.fileOutput("income.txt", Integer.toString(Income.getIncome()));
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    System.out.println("Seats sold: "+Ticket.getHowMany());
                    System.out.println("Our cinema is " + decimalFormat.format(Percentage.getPercentage()) + "% of its full capacity");


                }
                case 6 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please, choose something from our Menu");
                }
            }
        }

    }


}
