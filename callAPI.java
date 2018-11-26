import java.net.*;
import java.io.*;
import java.util.*;
import java.math.*;
public class callAPI{
    public static void main(String[] args) throws Exception{
        URL api = new URL("http://madlibz.herokuapp.com/api/random?minlength=10&maxlength=25");
        BufferedReader in = new BufferedReader(new InputStreamReader(api.openStream()));
        //BufferedWriter writer = new BufferedWriter(new FileWriter("apiOut.txt"));
        //PrintWriter formatter = new PrintWriter(writer);
        String line = "";
        String apiStore [] = new String[60]; 
        int counter = 0;
        while ((line = in.readLine())!= null){
            apiStore[counter] = line;
            counter +=1;
        }
        in.close();
        //writer.close();
        //formatter.close();
        //getInput(apiStore);
        for(int i = 0;i < apiStore.length;i+=1){
            System.out.println(apiStore[i].toString());
        }
    }

    public static void getInput(String array[]){
        //Read the "blanks" section and output
        //for(int i = 0;)
        //Store input in an array
        //Print "value" section with inputs from array
        //???
        //Profit
        //readFile.close();
    }
    
}