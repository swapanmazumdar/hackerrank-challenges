import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Grading Students
 * <p>
 * Problem: HackerLand University has the following grading policy:
 * <p>
 * Every student receives a grade in the inclusive range from 0 to 100.
 * Any grade less than 40 is a failing grade.
 * Sam is a professor at the university and likes to round each student's grade according to these rules:
 * <p>
 * If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of
 * 5.
 * If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 * For example, grade = 84 will be rounded to 85 but grade = 29 will not be rounded because the rounding would result in
 * a number that is less than 40.
 * <p>
 * Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
 */
public class Grading_Solution {

    /**
     * Returns an integer array consisting of rounded grades.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            // any grade less than 38 or rounding up difference to reach the next multiple of 5 is more than 3
            if (grade >= 38 && grade % 5 >= 3) {
                grade += (5 - grade % 5);
            }
            finalGrades.add(i, grade);
        }
        return finalGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(0, 67);
        grades.add(1, 67);
        grades.add(2, 38);
        grades.add(3, 33);

        List<Integer> result = gradingStudents(grades);
        Stream.of(result).forEach(System.out::println);
    }
}