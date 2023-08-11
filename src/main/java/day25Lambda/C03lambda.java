package day25Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C03lambda {
    public static void main(String[] args) throws IOException {

        //How to access a file
        Files.lines(Paths.get("/Users/halimealtintas/IdeaProjects/Batch179/src/main/java/day25Lambda/MyTextFile")).
                forEach( System.out::println);

        //Convert all characters to uppercase and sort the lines in natural order

        Files.lines(Paths.get("/Users/halimealtintas/IdeaProjects/Batch179/src/main/java/day25Lambda/MyTextFile")).
                map(String::toUpperCase).
                sorted().
                forEach(System.out::println);
        //Print the lines that contains the word "Java"

        Files.
                lines(Paths.get("/Users/halimealtintas/IdeaProjects/Batch179/src/main/java/day25Lambda/MyTextFile")).
                filter(t->t.contains("Java")).
                forEach(System.out::println);

        //Print the distinct words only







    }
}

