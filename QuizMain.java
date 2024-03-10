import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * QuizMain
 */
public class QuizMain {
    public static void main(String[] args) throws FileNotFoundException {
        File doc = new File("APWH5.txt");
        Scanner scanDoc = new Scanner(doc);
        Scanner lengthScanDoc = new Scanner(doc);
        Scanner in = new Scanner(System.in);
        int x = 1;
        int questionSizeLocal = 0;
        while(lengthScanDoc.hasNext()) {
            lengthScanDoc.nextLine();
            questionSizeLocal ++;
        }
        lengthScanDoc.close();
        String input = "";
        File docReQuiz = new File("APWH5Re.txt");
        PrintWriter docReQuizPrint = new PrintWriter(docReQuiz);
        Question[] questions = new Question[questionSizeLocal];
        boolean[] isQuestionSaid = new boolean[questionSizeLocal];
        for (int i = 0; i < isQuestionSaid.length; i++) {
            isQuestionSaid[i] = false;
        }
        System.out.println();
        while (scanDoc.hasNext(Integer.toString(x) + ".")) {
            String currentLine = scanDoc.nextLine();
            questions[x - 1] = new Question(
            currentLine.substring(currentLine.indexOf(":") + 2),
            currentLine.substring(0, currentLine.indexOf(":"))
            );
            x++;
        }
        while (!input.equalsIgnoreCase("stop")) {
            int questionNum = (int)(Math.random() * questionSizeLocal);
            if (!isQuestionSaid[questionNum]) {
                isQuestionSaid[questionNum] = true;
                System.out.println(questions[questionNum].getQuestion());
                input = in.next();
                System.out.println(questions[questionNum].getAnswer());
                input = in.next();
                // System.out.println(input.equals("1"));
                // if(input.equals("1")) {
                //     docReQuizPrint.println(questions[questionNum].getAnswer() + questions[questionNum].getQuestion());
                // }
            }
        }
        scanDoc.close();
        docReQuizPrint.close();
        in.close();
    }
}