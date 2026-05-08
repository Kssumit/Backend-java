package Java.Day16collection.property;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception{
        var settings = new Properties();
        settings.put("width","200");
        settings.put("title","Hello World");
        Path path = Path.of("demo.properties");
        try(OutputStream out = Files.newOutputStream(path)){
            settings.store(out, "Program properties");
        }
        var settings1 = new Properties();
        try(InputStream in = Files.newInputStream(path)){
            settings1.load(in);
        }
        System.out.println(settings1);
        String title = settings1.getProperty("width","100");
        System.out.println(title);
    }
}
