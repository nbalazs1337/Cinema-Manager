package all.manager.room;

import java.util.Arrays;

public class Populate {

    public  static void initialPopulate(String[][] cinema) {
        for (int i = 0; i < cinema.length; i++) {
            if (i == 0) {
                for (int j = 0; j < cinema[0].length; j++) {
                    if (j == 0) {
                        cinema[i][j] = " ";
                    } else {
                        cinema[i][j] = Integer.toString(j);
                    }
                }
            } else {

                Arrays.fill(cinema[i], 0, 1, Integer.toString(i));
                Arrays.fill(cinema[i], 1, cinema[i].length, "F");
            }
        }
    }
}
