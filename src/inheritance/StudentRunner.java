package inheritance;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student("Raveesh");

        student.setEmail("rav55sh@gmail.com");

        System.out.println(student.getName());
        System.out.println(student.getEmail());

        Person person = new Person("Raveesh");
        String value = person.toString();

        System.out.println(value);
        System.out.println(person);
    }

}
