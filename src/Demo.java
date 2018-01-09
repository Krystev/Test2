import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] grades = new int[6];
        fillGrades(grades);
        printData(grades);
    }

    private static void printData(int[] grades) {
        int sum = 0;
        double avg = 0;
        int highestMark = 2;
        int lowestMark = 6;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (grades[i] > highestMark) {
                highestMark = grades[i];
            }

            if (grades[i] < lowestMark) {
                lowestMark = grades[i];
            }
        }
        avg = ( double) sum / (double) grades.length;
        System.out.println("Среден успех " + avg
                + " Най-добра оценка " + highestMark
                + " Най-лоша оценка " + lowestMark);
    }

    private static void fillGrades(int[] grades) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int mark;
        while (grades[grades.length - 1] < 2) {
            mark = input.nextInt();
            if (mark >= 2 && mark <= 6) {
                grades[counter] = mark;
                counter++;
            } else {
                grades[counter] = 0;
            }
        }
    }
}
