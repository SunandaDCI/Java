import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise1_WriteLinesinFile {
    public static void main(String[] args) throws IOException {

//        List<String> stringList = List.of("Apple, Banana, Cat, Dog");

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple1");
        stringList.add("Banana1");
        stringList.add("Cat1");
        stringList.add("Dog1");

        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "/Desktop";
        String fileName = "/sample.txt";

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(desktopPath+fileName, true));
            for (String s: stringList){
                printWriter.println(s);
            }
            printWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}