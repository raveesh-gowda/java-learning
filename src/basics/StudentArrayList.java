package basics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {
    private final ArrayList<Integer> marks = new ArrayList<Integer>();
    private final String name;

    public StudentArrayList(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public String getStudentName() {
        return name;
    }

    public int getMarksLength() {
        return marks.size();
    }

    public int getTotalMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaxMarks() {
        return Collections.max(marks);
    }

    public int getMinMarks() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalMarks();
        return new BigDecimal(sum).divide(new BigDecimal(marks.size()), 3, RoundingMode.UP);
    }

    public String toString() {
        return name + marks;
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }

}
