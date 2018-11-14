import java.net.*;
import java.io.*;
import java.util.*;
import java.math.*;
public class callAPI{
    public static void main(String[] args) throws Exception{
        double min = (Math.random() * 100);
        double max = (Math.random() * 100);
        if (max < min){
            double temp = min;
            min = max;
            max = temp;
        }
        URL api = new URL("http://madlibz.herokuapp.com/api/random?minlength="+min+"&"+max+"length=100");
        BufferedReader in = new BufferedReader(new InputStreamReader(api.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("apiOut.txt"));
        PrintWriter formatter = new PrintWriter(writer);
        String line = "";

        while ((line = in.readLine())!= null){
            //System.out.println(line);
            formatter.printf("%s %n",line);
        }
        in.close();
        writer.close();
        formatter.close();
    }
}