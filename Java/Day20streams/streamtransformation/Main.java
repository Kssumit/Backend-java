package Java.Day20streams.streamtransformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        List<List<String>> list = Arrays.asList(
            Arrays.asList("A","b"),
            Arrays.asList("c","d")
        );

        Stream<String> res = list.stream().flatMap(x -> x.stream());
        System.out.println(res.toList());


        Stream<String> words = Stream.of("hello","bye","usmitchauhan","no");
        // words.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

                Object[] powers = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Fetching " + e)).limit(20).toArray();
        // System.out.println(Arrays.toString(powers));

     Optional<String> largest = words.max(String::compareToIgnoreCase);
        System.out.println("lagerst "+ largest.orElse("loda"));

    }
}
