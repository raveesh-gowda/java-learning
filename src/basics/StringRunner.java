package basics;

public class StringRunner {

    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String dayWithMostCharacters = "";

        for (String day : days) {
            if (day.length() > dayWithMostCharacters.length()) {
                dayWithMostCharacters = day;
            }
        }

        System.out.println("A day with more number of characters is " + dayWithMostCharacters);

        for (int i = days.length - 1; i >= 0; i--) {
            System.out.println(days[i]);
        }

    }

}
