import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
    private final int[] marks;
    private final String name;

    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getStudentName() {
        return name;
    }

    public int getMarksLength() {
        return marks.length;
    }

    public int getTotalMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaxMarks() {
//        int max = 0;
        int max = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public int getMinMarks() {
//        int min = 0;
        int min = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalMarks();
        return new BigDecimal(sum).divide(new BigDecimal(marks.length), 3, RoundingMode.UP);
    }

}
