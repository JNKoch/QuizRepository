package DasQuiz4;

import DasQuiz4.Data.TextFileRepository;

public class Main {
    public static void main(String[] args){
        TextFileRepository fileRepository = new TextFileRepository("Quiz_Covis/src/DasQuiz4/DataTest.txt");
        fileRepository.testStart();
//        Controller controller = new Controller();
//        controller.start();
//        System.out.println("The Second Commit");
//        System.out.println("klappt das mit zwei branches");
    }
}
