// Package declaration
package Solution;

// useStudent Class to test the application
public class useStudent 
{
    public static void main(String[] args) 
    {
        // Instantiate Student_Report object with sample data
        Student_Report student = new Student_Report("11007", 80, 75, 65);

        // Print the student's report
        student.print_report();
    }
}
