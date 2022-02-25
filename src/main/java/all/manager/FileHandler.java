package all.manager;

import java.io.*;

public class FileHandler {

    public void fileOutput(String income_file, String income){

    String s;


        try {

        BufferedReader in4 = new BufferedReader(new StringReader((income)));
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("./src/main/resources/files/"+income_file)));
        int lineCount = 1;
        while ((s = in4.readLine()) != null) {
            out1.println(  "Today's income: " + s + "$");
        }
        out1.close();
    } catch (EOFException e){
        System.err.println("End of stream");
    }
    catch(IOException e){
            e.printStackTrace();
    }

    }


}
