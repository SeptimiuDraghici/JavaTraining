import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) {
        System.out.println("Type something:");
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String s = read.readLine();
            System.out.println("\nYour Input: " + s);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
