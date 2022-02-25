package all.manager.statistics;

import all.manager.buy.Ticket;

public class Income  {

    private static int income;
    private int foodIncome;


//    public static void addToFile() throws IOException {
//        File file = new File("C:\\Users\\40758\\Desktop\\ISP\\30123_1_negrea_balazsflorin_isp_labs\\final-exam\\src\\main\\resources\\files\\test.txt");
//        FileWriter fw = new FileWriter(file,true);
//        PrintWriter pw = new PrintWriter(fw);
//
//        pw.println(income);
//        pw.close();
//    }

    public static void addIncome(){

       income = income + Ticket.getTicketPrice();

    }

    public static int getIncome(){

        return income;
    }

    @Override
    public String toString() {
        return "Income=" + income;

    }
}
