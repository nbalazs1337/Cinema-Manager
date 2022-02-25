package all.manager.room;

public class Seats {

    public  void showTheSeats(String[][] cinema) {

        System.out.println("Cinema:");
        for (String[] row : cinema) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}