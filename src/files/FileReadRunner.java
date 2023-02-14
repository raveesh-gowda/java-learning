package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("./src/files/data.txt");

        //List<String> lines = Files.readAllLines(pathFileToRead);
        //System.out.println(lines);

        //Files.lines(pathFileToRead).forEach(System.out::println);

//        Files.lines(pathFileToRead).map(String::toLowerCase).forEach(System.out::println);

        Files.lines(pathFileToRead)
                .map(String::toLowerCase)
                .filter(str -> str.contains("a"))
                .forEach(System.out::println);
    }

}
