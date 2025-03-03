package Labs;
import java.util.Scanner;

public class LearningProgramming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hourToSolve = input.nextInt();
        int minutesToSolve = input.nextInt();
        int problemsSolved = (60 / minutesToSolve);
        System.out.println(problemsSolved);
    }
}
