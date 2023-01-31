package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class StudentsCollectionRunner {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("abc", 1), new Student("def", 2), new Student("ghi", 3));
        System.out.println(students);

        ArrayList<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);
        Collections.sort(studentsAl);
        System.out.println("Ascending : " + studentsAl);
        Collections.sort(studentsAl, new DescStudentComparator());
        System.out.println("Descending : " + studentsAl);
    }

}
