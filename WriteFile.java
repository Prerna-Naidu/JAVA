import java.io.IOException;
import java.io.FileWriter;
public class WriteFile{
    public static void main(String[] args) {
        try{
            FileWriter Writer=new FileWriter("myfile.txt");
            Writer.write("Files in java are seriously good!!!");
            Writer.close();
            System.out.println("Successfully Written.");
        }
        catch(IOException e){
            System.out.println("An error has Occurred.");
            e.printStackTrace();
        }
    }
}
