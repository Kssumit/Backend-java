package Java.Day20streams.streamcreation;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ListFormat.Style;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).toList();
        System.out.print(title + ": ");
        if (firstElements.size() <= SIZE)
            System.out.println(firstElements);
        else {
            firstElements.remove(SIZE);
            String out = firstElements.toString();
            System.out.println(out.substring(0, out.length() - 1) + ", ...]");
        }
    }

    public static void main(String[] args) throws IOException {
        // when you have array
        Path path = Path.of("alice.txt");
        String content = Files.readString(Path.of("alice.txt"));
        Stream<String> words = Stream.of(content.split("\\PL+"));
        // show("words",words);
        // of have varargs parameter so we can pass any number of argument
        // use Arrays.stream(array,from,to) when you want to creat a stream from part of
        // array

        // to make empty stream
        Stream<String> silence = Stream.empty();
        //infinte parallelStream
        Stream<String> echos = Stream.generate(()->"echo");
        // echos.forEach(System.out::println);
        Stream<Double> randoms = Stream.generate(Math::random);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n->n.add(BigInteger.ONE));
        // integers.forEach(System.out::println);
        // System.out.print(integers.limit(1000).toList());


        //finite
        var limit = new BigInteger("100000");
        Stream<BigInteger> integers1= Stream.iterate(BigInteger.ZERO,n->n.compareTo(limit) < 0 ,n->n.add(BigInteger.ONE));
        // integers1.forEach(System.out::println);

        //more ways of creating stream of words

        Stream<String> anotherway = Pattern.compile("\\PL+").splitAsStream(content);

        Stream<String> moreways = new Scanner(content).tokens();


        //Files.line return stream of lines in file
        try(Stream<String> lines = Files.lines(path)){}
        
        //stream builder used to create a stream by adding el one by one
        Stream<Integer> digit = digits(78);
        // digit.forEach(System.out::println);

        Stream<String> w = "Hello\nguuter".lines();
        System.out.println(w.toList());



        
    }

   static Stream<Integer> digits(int n){
        Stream.Builder<Integer> builder = Stream.builder();
        while(n!=0){
            builder.add(n%10);
            n/=10;
        }
        return builder.build();
    }
}
