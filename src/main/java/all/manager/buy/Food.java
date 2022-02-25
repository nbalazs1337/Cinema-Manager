package all.manager.buy;

import all.manager.Manager;

import java.util.Scanner;

public class Food {



    private int foodIncome;
    private static int addFoodIncome;
    Manager cinemaMenuManager = new Manager();


    public static int getAddFoodIncome() {
        return addFoodIncome;
    }

    public void chooseFood(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(true){
            try
            {
                choice = Integer.parseInt(scanner.nextLine());


            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a number!\n");
            }
            addFoodIncome = addFoodIncome+foodIncome;
            System.out.println("Want something?If not, you can exit our buying Menu by pressing 5");

            switch(choice){
                case 1->{
                    foodIncome =  3;
                    System.out.println("Succesfully added Popcorn Medium to your cart\n");
                }
                case 2->{
                    foodIncome = 5;
                    System.out.println("Succesfully added Popcorn Huge to your cart\n");
                }
                case 3->{
                    foodIncome = 3;
                    System.out.println("Succesfully added Coke to your cart\n");
                }
                case 4->{
                    foodIncome = 2;
                    System.out.println("Succesfully added Bugeci 2.5L to your cart\n");
                }
                case 5->{
                        cinemaMenuManager.readChoice();
                }
                default -> {
                    System.out.println("Please select from the options above\n");
                }
            }
        }

    }

}
