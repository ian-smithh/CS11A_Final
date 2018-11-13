import java.net.*;
import java.io.*;
public class APIFiddle{
    public static void main(String[] args) throws Exception{ 
        URL api = new URL("http://madlibz.herokuapp.com/api/random?minlength=10&maxlength=100");
        BufferedReader in = new BufferedReader(new InputStreamReader(api.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("apiOut.txt"));
        PrintWriter formatter = new PrintWriter(writer);
        String line = "";

        while ((line = in.readLine())!= null){
            System.out.println(line);
            formatter.printf("%s %n",line);
        }
        in.close();
        writer.close();
        formatter.close();
    }
}