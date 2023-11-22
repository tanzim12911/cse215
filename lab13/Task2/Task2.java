package lab13.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException{
        File f1 = new File("quizMarks");

        FileWriter fw = new FileWriter(f1);

        fw.write("113098 20\n");
        fw.write("115089 15\n");
        fw.write("345678 12\n");
        fw.write("234566 18\n");

        fw.close();

        Scanner reader = new Scanner(f1);
        
        Quiz[] quiz = new Quiz[4];

        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = new Quiz();
        }

        int i = 0;

        while (reader.hasNext()) {
            int id = reader.nextInt();
            int mark = reader.nextInt();

            quiz[i].setId(id);
            quiz[i].setMark(mark);

            i++;
        }

        int highScore = 0;
        int highIndex = 0;

        for (int j = 0; j < quiz.length; j++) {
            System.out.println(quiz[j].toString());

            if(quiz[j].getMark() > highScore) {
                highScore = quiz[j].getMark();
                highIndex = j;
            }
        }

        System.out.println("Highest mark obtained by ID: " + quiz[highIndex].getId());
    }
}
