package all.manager.statistics;

import all.manager.buy.Ticket;

public class Percentage {

    private static double percentage;

    public static void howMuchPercent() {


        if ((double) Ticket.getHowMany() <= 36) {

        }
        percentage = ((double) Ticket.getHowMany() / 36) * 100;

    }

    public static double getPercentage() {
        howMuchPercent();
        return percentage;
    }

    @Override
    public String toString() {
        return "Percentage{" +
                "percentage=" + percentage +
                '}';
    }
}
