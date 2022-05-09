import java.io.*;
import java.io.IOException;

class exception {

    public static void main(String[] args) throws IOException {
         String ftp = null;
        try
        {
            ftp.toString();
           if(ftp.equals("tfp"))
               System.out.print("Same");
           else
               System.out.print("Not same");
        }
        catch (NullPointerException e){
            System.out.print("NullPointerException Caught");
            e.printStackTrace();
            e.toString();
        }

System.exit(0);
    }
}