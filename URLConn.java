import java.net.*;
import java.io.*;
import java.util.Date;

public class URLConn {
    public static void main(String[] args) throws IOException{
        URL hp=new URL("http://www.srinix.org");
        URLConnection hpCon=hp.openConnection();
        long d=hpCon.getDate();
        if(d==0)
        System.out.println("No date information.");
        else
        System.out.println("Date:" +new Date(d));
        System.out.println("Content-Type:" +hpCon.getContentType());
    }
}
