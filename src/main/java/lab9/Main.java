package lab9;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        long wordCount = Files.lines(Paths.get("data\\song.txt"))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .count();
        System.out.println(wordCount);
    }

}
