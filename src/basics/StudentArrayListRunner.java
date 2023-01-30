package basics;

import java.math.BigDecimal;

public class StudentArrayListRunner {

    public static void main(String[] args) {
        int[] marks = {99, 98, 100};

        StudentArrayList student = new StudentArrayList("Raveesh Gowda K", 99, 98, 100); //variable arguments

        String studentName = student.getStudentName();
        System.out.println(studentName);

        int marksLength = student.getMarksLength();
        System.out.println("Number of marks is " + marksLength);

        int totalMarks = student.getTotalMarks();
        System.out.println("Total scored marks is " + totalMarks);

        int maxMarks = student.getMaxMarks();
        System.out.println("Maximum marks is " + maxMarks);

        int minMarks = student.getMinMarks();
        System.out.println("Minimum marks is " + minMarks);

        BigDecimal averageMarks = student.getAverageMarks();
        System.out.println("Average marks is " + averageMarks);

        String toString = student.toString();
        System.out.println(toString);

        student.addMark(55);
        System.out.println(student);

        student.removeMarkAtIndex(1);
        System.out.println(student);
    }

}
