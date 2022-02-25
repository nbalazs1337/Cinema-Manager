package all.manager.buy;

import all.manager.Manager;

import java.util.Scanner;

public class Film {



    Manager cinemaMenuManager = new Manager();

    public void chooseFilm()

    {   int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try
            {
                choice = Integer.parseInt(scanner.nextLine());


            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a number!!\n");
            }

            System.out.println("Want something?If not, you can exit our buying Menu by pressing 5");

            switch (choice) {
                case 1 -> {

                    System.out.println("Good choice, Venom II is an action movie.\n");
                }
                case 2 -> {

                    System.out.println("Good choice, Deadpool is an action movie.\n");
                }
                case 3 -> {

                    System.out.println("Good choice, Data Structures in Java is a drama movie.\n");
                }
                case 4 -> {

                    System.out.println("Good choice, Alogirthms in Java is a thriller movie.\n");
                }
                case 5 -> {
                    cinemaMenuManager.readChoice();
                }
                default -> {
                    System.out.println("Please select from the options above\n");
                }
            }
        }
    }}
