package DasQuiz4;

import DasQuiz4.Data.FileRepository;
import DasQuiz4.Data.TextFileRepository;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        FileRepository fileRepository = new TextFileRepository("Quiz_Covis/src/DasQuiz4/DataTest.txt");
        try {
            fileRepository.create("Dies ist eine neue Zeile.");

            List<String> lines = fileRepository.readAllLines();
            lines.forEach(System.out::println);

            String line = fileRepository.readLine(0);
            System.out.println("\n Zeile 1: " + line + "\n");

            fileRepository.updateLine(2, "Dies ist die aktualisierte Zeile.");

            line = fileRepository.readLine(1);
            System.out.println("\n Aktualisierte Zeile 1: " + line +"\n");

            fileRepository.deleteLine(4);

            lines = fileRepository.readAllLines();
            lines.forEach(System.out::println);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        Controller controller = new Controller();
//        controller.start();
//        System.out.println("The Second Commit");
//        System.out.println("klappt das mit zwei branches");
    }
}
