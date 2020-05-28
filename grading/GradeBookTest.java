package grading;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {

        
        Scanner input = new Scanner( System.in );
        GradeBook myGradeBook = new GradeBook( "Computer Science" );

        System.out.printf( "initial course name %s\n", myGradeBook.getCourseName() );

        System.out.println("please enter the course name:");
        String nameOfCourse = input.nextLine();
        myGradeBook.setCourseName( nameOfCourse );
        System.out.println();


        myGradeBook.displayMessage();

    }
}