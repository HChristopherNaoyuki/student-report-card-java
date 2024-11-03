# Student Report System

This project implements a student report system in Java, designed to calculate and display student performance based on test, assignment, and exam results.

## Features

- **Student Class**: An abstract class that holds common attributes for students.
- **iReport Interface**: Defines the contract for reporting student results.
- **Student_Report Class**: Inherits from the Student class and implements the reporting logic.
- **Weighted Calculation**: Calculates final results using a weighted average (25% test, 25% assignment, 50% exam).

## Usage

To use the application, simply run the `useStudent` class, which creates a sample student and prints their report.

### Example

```java
public class useStudent
{
    public static void main(String[] args)
    {
        Student_Report student = new Student_Report("11007", 80, 75, 65);
        student.print_report();
    }
}
```

### Output

The output will display a formatted report including:
- Student Number
- Test Mark (weighted)
- Assignment Mark (weighted)
- Exam Mark (weighted)
- Final Mark

## Requirements

- Java Development Kit (JDK) 8 or higher

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/student-report-card-java.git
   ```
2. Navigate to the project directory:
   ```bash
   cd student-report-system
   ```
3. Compile and run the project using your favorite IDE or command line.
