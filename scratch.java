import java.net.*;
import java.io.*;
import commons. 
public class scratch{
    public static void main(String[] args) throws Exception{ 
        URL api = new URL("http://madlibz.herokuapp.com/api/random?minlength=10&maxlength=100");
        BufferedReader in = new BufferedReader(new InputStreamReader(api.openStream()));
        String line = "";

        File file = apiOut;

        FileUtils.copyURLToFile(api,file);

        //while ((line = in.readLine())!= null){
        //    System.out.println(line);
        //}
        in.close();
    }
}