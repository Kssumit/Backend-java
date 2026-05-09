package Java.Day20streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("alice.txt");
        String content = Files.readString(path);
        List<String> words = List.of(content.split("\\PL+"));

        long count = 0;
        count =  words.stream().filter(w->w.length() > 12).count();
        count =  words.parallelStream().filter(w->w.length() > 12).count();
        System.out.println(count);
    }
}
