// Package declaration
package Solution;

// Student_Report Class
public class Student_Report extends Student 
{
    // Constructor
    public Student_Report(String studentNumber, double testResult, double assignmentResult, double examResult) 
    {
        super(studentNumber, testResult, assignmentResult, examResult);
    }

    // Implementation of print_report method
    @Override
    public void print_report() 
    {
        double testWeighted = testResult * 0.25;
        double assignmentWeighted = assignmentResult * 0.25;
        double examWeighted = examResult * 0.50;
        double finalResult = testWeighted + assignmentWeighted + examWeighted;

        System.out.println("******************************************");
        System.out.println("STUDENT RESULT REPORT");
        System.out.println("******************************************");
        System.out.println("Student Number: " + getStudentNumber());
        System.out.println("Test Mark (25%): " + testWeighted);
        System.out.println("Assignment Mark (25%): " + assignmentWeighted);
        System.out.println("Exam Mark (50%): " + examWeighted);
        System.out.println("Final Mark: " + finalResult + "%");
        System.out.println("******************************************");
    }
}
