package chapterSeventeeen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//public class StreamOfLines {
//    public static void main(String[] args) throws IOException {
//        try (Formatter output = new Formatter("Clients.txt")) {
//            Scanner input = new Scanner(System.in);
//            System.out.printf("%s%n%s%n", "Enter account number, first name, last name and balance.",
//                    "Enter end-of-file indicator to end input");
//
//            while (input.hasNext()) {
//                try{
//                    output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
//                }
//                catch (NoSuchElementException elementException){
//                    System.err.println("Invalid input please try again");
//                    input.nextLine();
//                }
//                System.out.print("?");
//            }
//        }
//        catch (SecurityException | FileNotFoundException | FormatterClosedException e){
//            e.printStackTrace();
//        }
//
//
//        Pattern pattern = Pattern.compile("\\s+");
//
//        Map<String, Long> wordCount = Files.lines(Paths.get("Chapter2Paragraph.txt"))
//                .flatMap(line -> pattern.splitAsStream(line))
//                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
//
//        wordCount.entrySet().stream().collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()));
//
//        };
//    }
//}
