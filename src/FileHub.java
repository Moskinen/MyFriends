import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHub {
    public static void main(String[]args){
        createFile();
        writeToFile();
    }

    public static void createFile(){
        try {
            File friendList = new File("friendList.txt");
            if (friendList.createNewFile()) {
                System.out.println("File created: " + friendList.getList());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(){
        try {
            FileWriter myWriter = new FileWriter("friendList.txt");
            myWriter.write("So many things are happening, and i understand nothing!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
