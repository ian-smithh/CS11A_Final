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
        URL api = new URL("http://madlibz.herokuapp.com/api/random?minlength="+min+"&maxlength="+max);
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
        getInput("apiOut.txt");
    }

    public static void getInput(String fileName) throws FileNotFoundException{
        //Read the "blanks" section and output
        Scanner readFile = new Scanner(fileName);
        while(readFile.hasNext()){
            if(readFile.next().equals("]")){
                break;
            }
            else{
                readFile.next();
            }
        }
        //Store input in an array
        //Print "value" section with inputs from array
        //???
        //Profit
        readFile.close();
    }
    
}