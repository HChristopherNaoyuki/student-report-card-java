// Package declaration
package Solution;

// Abstract Class: Student
abstract class Student implements iReport 
{
    protected String studentNumber;
    protected double testResult;
    protected double assignmentResult;
    protected double examResult;

    // Constructor
    public Student(String studentNumber, double testResult, double assignmentResult, double examResult) 
    {
        this.studentNumber = studentNumber;
        this.testResult = testResult;
        this.assignmentResult = assignmentResult;
        this.examResult = examResult;
    }

    // Getters
    public String getStudentNumber() 
    {
        return studentNumber;
    }

    public double getTestResult() 
    {
        return testResult;
    }

    public double getAssignmentResult() 
    {
        return assignmentResult;
    }

    public double getExamResult() 
    {
        return examResult;
    }
}
